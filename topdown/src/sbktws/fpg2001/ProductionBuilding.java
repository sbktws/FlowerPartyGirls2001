package sbktws.fpg2001;
import java.awt.GridLayout;
import java.util.Collection;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public abstract class ProductionBuilding implements Building {

	// This method is added here to set up the default 4x4 control grid.
	// If a building needs finer control it can override this method.
	protected void populateControlPanel(JPanel controls) {
		controls.setLayout(new GridLayout(4, 4));
		controls.setBorder(BorderFactory.createBevelBorder(0));

		Collection<JLabel> icons = this.getControlPanelIcons();

		for (JLabel label : icons) {
			controls.add(label);
		}
	}

	abstract public Collection<JLabel> getControlPanelIcons();

	abstract public Vector2 getSafeSpawn();

	abstract public void setSafeSpawn(Vector2 pos);
}
