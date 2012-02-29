package sbktws.fpg2001;
import java.util.Collection;

public interface PathfindingProvider {

	void setMap(Map map);

	Collection<Vector2> getRoute(Vector2 source, Vector2 dest);

	void regenerateNavigationMesh();
}
