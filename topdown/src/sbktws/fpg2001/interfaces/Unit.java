package sbktws.fpg2001.interfaces;

import sbktws.fpg2001.BuildingInteractReaction;
import sbktws.fpg2001.util.Vector2;

public interface Unit extends GameObject {

	public void setDestination(Vector2 pos);

	public void damage(int dmg);

	public BuildingInteractReaction buildingInteractResponse(Building b);

	public void Spawn(Vector2 pos);

	public Boolean isHuman();

	public Boolean isUtility();

	public int getPopCount();
}
