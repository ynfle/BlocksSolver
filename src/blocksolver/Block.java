package blocksolver;
	
import java.util.*;

public class Block {
	private Vertex origin;
	private Vertex[] vertices;
	
	public Block() {
		this.origin = new Vertex();
		this.vertices = new Vertex[4];
		this.vertices[0] = this.origin;
		this.vertices[1] = new Vertex(0, 1);
		this.vertices[2] = new Vertex(1, 1);
		this.vertices[3] = new Vertex(1, 0);
	}
	
	public Block(Vertex[] vertices) {
		this.origin = new Vertex();
		this.vertices = new Vertex[vertices.length];
		for (int i = 0; i < vertices.length; i++) {
			this.vertices[i] = new Vertex(vertices[i]);
		}
	}
	
	public Block(List<Vertex> vertices) {
		this.origin = new Vertex();
		this.vertices = new Vertex[vertices.size()];
		for (int i = 0; i < vertices.size(); i++) {
			this.vertices[i] = new Vertex(vertices.get(i));
		}
	}
	
//	public Block(Vertex[] vertices, Color color) {
//		throw new IllegalArgumentException("Still under production");
//	}
	
	public Block(Block other) {
		this.origin = new Vertex();
		this.vertices = new Vertex[other.vertices.length];
		for (int i = 0; i < other.vertices.length; i++) {
			this.vertices[i] = new Vertex(other.vertices[i]);
		}
	}
	
	public Vertex[] getVertices() {
		Vertex[] result = new Vertex[this.vertices.length];
		for (int i = 0; i < this.vertices.length; i++) {
			result[i] = new Vertex(vertices[i]);
		}
		return result;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((vertices == null) ? 0 : vertices.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Block other = (Block) obj;
		if (vertices == null) {
			if (other.vertices != null)
				return false;
		} else {
			Set<Vertex> thisHash = new HashSet<>();
			thisHash.addAll(Arrays.asList(this.vertices));
			Set<Vertex> otherHash = new HashSet<>();
			otherHash.addAll(Arrays.asList(other.vertices));
			if (!thisHash.equals(otherHash))
				return false;
		}
		return true;
	}
}
