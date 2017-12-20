package blocksolver;
	
import java.util.*;

public class Block {
	private Vertex origin;
	private List<Vertex> vertices;
	
	public Block() {
		this.origin = new Vertex();
		this.vertices = new ArrayList<>();
		this.vertices.add(this.origin);
		this.vertices.add(new Vertex(0, 1));
		this.vertices.add(new Vertex(1, 1));
		this.vertices.add(new Vertex(1, 0));
	}
	
	public Block(Vertex[] vertices) {
		this.origin = new Vertex();
		this.vertices = new ArrayList<>();
		for (int i = 0; i < vertices.length; i++) {
			this.vertices.add(new Vertex(vertices[i]));
		}
	}
	
	public Block(List<Vertex> vertices) {
		this.origin = new Vertex();
		this.vertices = new ArrayList<>();
		for (int i = 0; i < vertices.size(); i++) {
			this.vertices.add(new Vertex(vertices.get(i)));
		}
	}
	
//	public Block(Vertex[] vertices, Color color) {
//		throw new IllegalArgumentException("Still under production");
//	}
	
	public Block(Block other) {
		this.origin = new Vertex();
		this.vertices = new ArrayList<>();
		for (int i = 0; i < other.vertices.size(); i++) {
			this.vertices.add(new Vertex(other.vertices.get(i)));
		}
	}
	
	public List<Vertex> getVertices() {
		this.origin = new Vertex();
		List<Vertex> result = new ArrayList<>();
		for (int i = 0; i < this.vertices.size(); i++) {
			result.add(new Vertex(vertices.get(i)));
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
			thisHash.addAll(this.vertices);
			Set<Vertex> otherHash = new HashSet<>();
			otherHash.addAll(other.vertices);
			if (!thisHash.equals(otherHash))
				return false;
		}
		return true;
	}
}
