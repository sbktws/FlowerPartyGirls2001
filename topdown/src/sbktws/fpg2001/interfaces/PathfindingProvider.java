package sbktws.fpg2001.interfaces;
import java.util.Collection;

import sbktws.fpg2001.Map;
import sbktws.fpg2001.util.Vector2;

public interface PathfindingProvider {

	void setMap(Map map);

	Collection<Vector2> getRoute(Vector2 source, Vector2 dest);

	void regenerateNavigationMesh();
}
