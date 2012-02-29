package sbktws.fpg2001;
public class GridCityMapGenerator implements MapGenerator {

	@Override
	public void configure(Object configurationOptions) {
		return;
	}

	@Override
	public void generateTiles(Map m) {

		for (int x = 0; x < 16; x++) {
			for (int y = 0; y < 16; y++) {
				if (x % 4 == 0 || y % 4 == 0) {
					m.map[x][y].type = MapTile.Road;
					// m.map[x][y].survivors = 0;
				} else {
					m.map[x][y].type = MapTile.Building1;
					// survivors = random
				}
				m.map[8][8].type = MapTile.HumanHQ;
			}
		}
	}

}
