package blocksolver;
	
import java.util.*;

public class Block {

	private List<Vertex> vertices;
	
	public Block() {
		this.vertices = new ArrayList<>();
		this.vertices.add(new Vertex());
		this.vertices.add(new Vertex(0, 1));
		this.vertices.add(new Vertex(1, 1));
		this.vertices.add(new Vertex(1, 0));
	}
	
	public Block(Vertex[] vertices) {
		this.vertices = new ArrayList<>();
		for (Vertex vert: vertices) {
			this.vertices.add(new Vertex(vert));
		}
	}
	
	public Block(List<Vertex> vertices) {
		this.vertices = new ArrayList<>();
		for (Vertex vert: vertices) {
			this.vertices.add(vert);
		}
	}
	
//	public Block(Vertex[] vertices, Color color) {
//		throw new IllegalArgumentException("Still under production");
//	}
	
	public Block(Block other) {
		this.vertices = new ArrayList<>();
		for (Vertex vert: other.vertices) {
			this.vertices.add(new Vertex(vert));
		}
	}
	
	public List<Vertex> getVertices() {
		List<Vertex> result = new ArrayList<>();
		for (Vertex vert: this.vertices) {
			result.add(new Vertex(vert));
		}
		return result;
	}
}
