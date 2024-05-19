import java.io.*;

public class Edge {
	public Vertex fromVertex;
	public Vertex toVertex;

	public Edge(Vertex from, Vertex to) {
		fromVertex = from;
		toVertex = to;
	}

	public boolean equalsTo(Edge other) {
		return fromVertex == other.fromVertex && toVertex == other.toVertex;
	}

	public boolean notEqualsTo(Edge other) {
		return !(this.equalsTo(other));
	}

	// Prints this edge in the form "A to B", where "A" is fromVertex's label
	// and "B" is toVertex's label.
	public void print(PrintWriter output) {
		fromVertex.print(output);
		output.write(" to ");
		toVertex.print(output);
	}
}
