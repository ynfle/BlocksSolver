package blocksolver;
	
import java.util.*;

public class Block {
	private BuildingBlock origin;
	private List<BuildingBlock> vertices;
	
	public Block() {
		this.origin = new BuildingBlock();
		this.vertices = new ArrayList<>();
		this.vertices.add(this.origin);
		this.vertices.add(new BuildingBlock(0, 1));
		this.vertices.add(new BuildingBlock(1, 1));
		this.vertices.add(new BuildingBlock(1, 0));
	}
	
	public Block(BuildingBlock[] vertices) {
		this.origin = new BuildingBlock();
		this.vertices = new ArrayList<>();
		for (int i = 0; i < vertices.length; i++) {
			this.vertices.add(new BuildingBlock(vertices[i]));
		}
	}
	
	public Block(List<BuildingBlock> vertices) {
		this.origin = new BuildingBlock();
		this.vertices = new ArrayList<>();
		for (int i = 0; i < vertices.size(); i++) {
			this.vertices.add(new BuildingBlock(vertices.get(i)));
		}
	}
	
//	public Block(BuildingBlock[] vertices, Color color) {
//		throw new IllegalArgumentException("Still under production");
//	}
	
	public Block(Block other) {
		this.origin = new BuildingBlock();
		this.vertices = new ArrayList<>();
		for (int i = 0; i < other.vertices.size(); i++) {
			this.vertices.add(new BuildingBlock(other.vertices.get(i)));
		}
	}
	
	public List<BuildingBlock> getVertices() {
		this.origin = new BuildingBlock();
		List<BuildingBlock> result = new ArrayList<>();
		for (int i = 0; i < this.vertices.size(); i++) {
			result.add(new BuildingBlock(vertices.get(i)));
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
			Set<BuildingBlock> thisHash = new HashSet<>();
			thisHash.addAll(this.vertices);
			Set<BuildingBlock> otherHash = new HashSet<>();
			otherHash.addAll(other.vertices);
			if (!thisHash.equals(otherHash))
				return false;
		}
		return true;
	}
}
