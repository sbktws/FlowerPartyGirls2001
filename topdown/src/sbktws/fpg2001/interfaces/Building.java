package sbktws.fpg2001.interfaces;

import sbktws.fpg2001.util.Vector2;

public interface Building extends GameObject {

	void build(Vector2 pos);

	Boolean troopInteraction(Unit u);
}
