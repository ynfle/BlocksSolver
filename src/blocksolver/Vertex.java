package blocksolver;

import java.awt.Point;

public class Vertex {
	
	private Point point;
	
	public Vertex() {
		this(0, 0);
	}
	
	public Vertex(int x, int y) {
		this.point = new Point(x, y);
	}
	
	public Vertex(Vertex vert) {
		this.point = new Point(vert.getX(), vert.getY());
	}

	public int getX() {
		return this.point.x;
	}
	
	public int getY() {
		return this.point.y;
	}
	
	public int[] getLocation() {
		int[] result = {this.getX(), this.getY()};
		return result;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((point == null) ? 0 : point.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false; 
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Vertex other = (Vertex) obj;
		if (point == null) {
			if (other.point != null) {
				return false;
			}
		} else if (!point.equals(other.point)){
			return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "[" + this.point.x + ", " + this.point.y + "]";
	}
	
}
