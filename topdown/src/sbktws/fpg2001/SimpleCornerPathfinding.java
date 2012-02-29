package sbktws.fpg2001;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// This is a really awful pathfinding class that relies on an unobstructed grid pattern and is silly.
// TODO remove before release.
public class SimpleCornerPathfinding implements PathfindingProvider {

	private Map map;

	@Override
	public Collection<Vector2> getRoute(Vector2 source, Vector2 dest) {
		List<Vector2> route = new ArrayList<Vector2>();

		if (map.map[source.x][source.y].type != MapTile.Road) {
			throw new IllegalArgumentException();
		}

		if (source.x == dest.x || source.y == dest.y) {
			route.add(dest);
			return route;
		}

		// Firstly, go across
		route.add(new Vector2(dest.x, source.y));
		// Then up
		route.add(dest);
		return route;
	}

	@Override
	public void setMap(Map map) {
		this.map = map;
	}

	@Override
	public void regenerateNavigationMesh() {
		return;

	}

}
