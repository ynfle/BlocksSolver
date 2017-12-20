package blocksolver;

import java.awt.Point;

public class BuildingBlock {

	private Point point;

	public BuildingBlock() {
		this(0, 0);
	}

	public BuildingBlock(int x, int y) {
		this.point = new Point(x, y);
	}

	public BuildingBlock(BuildingBlock block) {
		this.point = new Point(block.getX(), block.getY());
	}

	public int getX() {
		return (int) this.point.getX();
	}

	public int getY() {
		return (int) this.point.getY();
	}

	public int[] getLocation() {
		int[] result = { this.getX(), this.getY() };
		return result;
	}

	public void move(int x, int y) {
		this.point.move(x, y);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((point == null) ? 0 : point.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
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
		BuildingBlock other = (BuildingBlock) obj;
		if (point == null) {
			if (other.point != null) {
				return false;
			}
		} else if (!point.equals(other.point)) {
			return false;
		}
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "[" + this.point.x + ", " + this.point.y + "]";
	}

}
