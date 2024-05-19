import java.util.*;

public class AdjacencyMatrixGraph extends DirectedGraph {
    protected ArrayList<Vertex> vertices = new ArrayList<>();
    protected ArrayList<ArrayList<Boolean>> matrixRows = new ArrayList<>();

    @Override
    public Vertex addVertex(String newVertexLabel) {
        if (getVertex(newVertexLabel) != null) {
            return null; // Vertex already exists
        }
        Vertex newVertex = new Vertex(newVertexLabel);
        vertices.add(newVertex);
        for (ArrayList<Boolean> row : matrixRows) {
            row.add(false); // Add new column for new vertex
        }
        ArrayList<Boolean> newRow = new ArrayList<>(Collections.nCopies(vertices.size(), false));
        matrixRows.add(newRow); // Add new row for new vertex
        return newVertex;
    }

    @Override
    public boolean addDirectedEdge(Vertex fromVertex, Vertex toVertex) {
        int fromIndex = vertices.indexOf(fromVertex);
        int toIndex = vertices.indexOf(toVertex);
        if (matrixRows.get(fromIndex).get(toIndex)) {
            return false; // Edge already exists
        }
        matrixRows.get(fromIndex).set(toIndex, true);
        return true;
    }

    @Override
    public ArrayList<Edge> getEdgesFrom(Vertex fromVertex) {
        int fromIndex = vertices.indexOf(fromVertex);
        ArrayList<Edge> edges = new ArrayList<>();
        for (int toIndex = 0; toIndex < vertices.size(); toIndex++) {
            if (matrixRows.get(fromIndex).get(toIndex)) {
                edges.add(new Edge(fromVertex, vertices.get(toIndex)));
            }
        }
        return edges;
    }

    @Override
    public ArrayList<Edge> getEdgesTo(Vertex toVertex) {
        int toIndex = vertices.indexOf(toVertex);
        ArrayList<Edge> edges = new ArrayList<>();
        for (int fromIndex = 0; fromIndex < vertices.size(); fromIndex++) {
            if (matrixRows.get(fromIndex).get(toIndex)) {
                edges.add(new Edge(vertices.get(fromIndex), toVertex));
            }
        }
        return edges;
    }

    @Override
    public Vertex getVertex(String vertexLabel) {
        for (Vertex vertex : vertices) {
            if (vertex.getLabel().equals(vertexLabel)) {
                return vertex;
            }
        }
        return null;
    }

    @Override
    public boolean hasEdge(Vertex fromVertex, Vertex toVertex) {
        int fromIndex = vertices.indexOf(fromVertex);
        int toIndex = vertices.indexOf(toVertex);
        return matrixRows.get(fromIndex).get(toIndex);
    }
}
