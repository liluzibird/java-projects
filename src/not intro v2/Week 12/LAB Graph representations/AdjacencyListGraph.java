import java.util.*;

public class AdjacencyListGraph extends DirectedGraph {
    protected ArrayList<AdjacencyListVertex> vertices = new ArrayList<AdjacencyListVertex>();

    @Override
    public Vertex addVertex(String newVertexLabel) {
        if (getVertex(newVertexLabel) != null) {
            return null; // Vertex already exists
        }
        AdjacencyListVertex newVertex = new AdjacencyListVertex(newVertexLabel);
        vertices.add(newVertex);
        return newVertex;
    }

    @Override
    public boolean addDirectedEdge(Vertex fromVertex, Vertex toVertex) {
        AdjacencyListVertex from = (AdjacencyListVertex) fromVertex;
        AdjacencyListVertex to = (AdjacencyListVertex) toVertex;
        if (from.adjacent.contains(to)) {
            return false; // Edge already exists
        }
        from.adjacent.add(to);
        return true;
    }

    @Override
    public ArrayList<Edge> getEdgesFrom(Vertex fromVertex) {
        AdjacencyListVertex from = (AdjacencyListVertex) fromVertex;
        ArrayList<Edge> edges = new ArrayList<>();
        for (Vertex to : from.adjacent) {
            edges.add(new Edge(from, to));
        }
        return edges;
    }

    @Override
    public ArrayList<Edge> getEdgesTo(Vertex toVertex) {
        ArrayList<Edge> edges = new ArrayList<>();
        for (AdjacencyListVertex from : vertices) {
            if (from.adjacent.contains(toVertex)) {
                edges.add(new Edge(from, toVertex));
            }
        }
        return edges;
    }

    @Override
    public Vertex getVertex(String vertexLabel) {
        for (AdjacencyListVertex vertex : vertices) {
            if (vertex.getLabel().equals(vertexLabel)) {
                return vertex;
            }
        }
        return null;
    }

    @Override
    public boolean hasEdge(Vertex fromVertex, Vertex toVertex) {
        AdjacencyListVertex from = (AdjacencyListVertex) fromVertex;
        return from.adjacent.contains(toVertex);
    }
}
