package sbktws.fpg2001;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.Collection;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HumanHQ extends ProductionBuilding {

	private String name;
	private ImageIcon img;

	@Override
	public void build(Vector2 pos) {
		// TODO Initialise here
	}

	@Override
	public Boolean troopInteraction(Unit u) {
		if (u.isHuman()) {
			// TODO Apply converted unit to population caps
			return true;
		}
		return false;
	}

	@Override
	public ImageIcon getImage() {
		// TODO Auto-generated method stub
		if (img == null) {
			return img = new ImageIcon("default.png", "Default 64* image tile.");
		} else {
			return img;
		}
	}

	@Override
	public void display(JPanel infoPanel) {
		// TODO Auto-generated method stub
		infoPanel.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();

		JLabel name = new JLabel(this.name);
		c.gridwidth = 2;
		infoPanel.add(name, c);

		c = new GridBagConstraints();
		JLabel icon = new JLabel(this.getImage());
		c.gridy = 1;
		c.gridx = 0;
		infoPanel.add(icon, c);

		c = new GridBagConstraints();
		JLabel info = new JLabel("Building info....");
		c.gridy = 1;
		c.gridx = 1;
		infoPanel.add(info, c);
	}

	@Override
	public Collection<JLabel> getControlPanelIcons() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vector2 getSafeSpawn() {
		return Vector2.ZERO;
	}

	@Override
	public void setSafeSpawn(Vector2 pos) {
		return;
	}

}
