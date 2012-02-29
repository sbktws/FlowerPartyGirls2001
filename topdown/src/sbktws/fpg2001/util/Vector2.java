package sbktws.fpg2001.util;
public class Vector2 {
	public static Vector2 ONE = new Vector2(1, 1);
	public static Vector2 ZERO = new Vector2(0, 0);
	public static Vector2 NEG_ONE = new Vector2(-1, -1);
	public static Vector2 RIGHT = new Vector2(1, 0);
	public static Vector2 LEFT = new Vector2(-1, 0);
	public static Vector2 UP = new Vector2(0, 1);
	public static Vector2 DOWN = new Vector2(0, -1);
	public int x;
	public int y;

	public Vector2(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Vector2 add(Vector2 b) {
		return new Vector2(x + b.x, y + b.y);
	}

	public Vector2 subtract(Vector2 b) {
		return new Vector2(x - b.x, y - b.y);
	}

	public Boolean equals(Vector2 b) {
		if (b == null) {
			return false;
		}
		if (x == b.x && y == b.y) {
			return true;
		}
		return false;
	}
}
