package sbktws.fpg2001.interfaces;

import sbktws.fpg2001.core.Map;

public interface MapGenerator {
	public void configure(Object configurationOptions);

	public void generateTiles(Map m);
}
