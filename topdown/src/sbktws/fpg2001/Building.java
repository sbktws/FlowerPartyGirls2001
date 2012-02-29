package sbktws.fpg2001;
public interface Building extends GameObject {

	void build(Vector2 pos);

	Boolean troopInteraction(Unit u);
}
