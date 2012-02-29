package sbktws.fpg2001.providers;

import sbktws.fpg2001.core.Map;
import sbktws.fpg2001.interfaces.MapGenerator;

public class GridCityMapGenerator implements MapGenerator {

	@Override
	public void configure(Object configurationOptions) {
		return;
	}

	@Override
	public void generateTiles(Map m) {

		for (int x = 0; x < 16; x++) {
			for (int y = 0; y < 16; y++) {
				if (x % 3 == 0 || y % 3 == 0) {
					// m.map[x][y].type = MapTile.Road;
					// m.map[x][y].survivors = 0;
				} else {
					// m.map[x][y].type = MapTile.Building1;
					// survivors = random
				}
				// m.map[8][8].type = MapTile.HumanHQ;
			}
		}
	}

}
