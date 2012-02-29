package sbktws.fpg2001;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import sbktws.fpg2001.providers.GridCityMapGenerator;

public class Main {
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		// START GRAPHICS INIT
		JFrame content = new JFrame();
		content.setLayout(new GridBagLayout());
		content.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		GridBagConstraints c = new GridBagConstraints();
		JPanel mapPanel = new JPanel();
		mapPanel.setLayout(new BorderLayout());
		mapPanel.setBorder(BorderFactory.createBevelBorder(0));
		c.gridheight = 2;
		c.gridwidth = 1;
		c.gridx = 0;
		c.gridy = 0;
		c.fill = GridBagConstraints.BOTH;
		content.add(mapPanel, c);
		Map m = new Map(mapPanel);
		new GridCityMapGenerator().generateTiles(m);
		c = new GridBagConstraints();

		JPanel displayPanel = new JPanel();
		displayPanel.setLayout(new GridLayout(1, 3));
		displayPanel.setBorder(BorderFactory.createBevelBorder(0));
		c.gridheight = 1;
		c.gridwidth = 1;
		c.gridx = 0;
		c.fill = GridBagConstraints.BOTH;
		c.gridy = 2;
		content.add(displayPanel, c);
		initDisplayPanel(displayPanel);

		content.pack();
		content.setVisible(true);

		// END GRAPHICS INIT
	}

	public void initDisplayPanel(JPanel panel) {
		JPanel minimap = new JPanel();
		minimap.setLayout(new BorderLayout());
		minimap.setBorder(BorderFactory.createBevelBorder(0));
		minimap.add(new JButton("Test"));
		panel.add(minimap);

		JPanel details = new JPanel();
		details.setLayout(new GridBagLayout());
		panel.add(details);

		JPanel controls = new JPanel();
		controls.setLayout(new GridLayout(4, 4));
		controls.setBorder(BorderFactory.createBevelBorder(0));
		initControlPanel(controls);
		panel.add(controls);

		return;
	}

	public void initControlPanel(JPanel panel) {
		for (int x = 0; x < 4; x++) {
			for (int y = 0; y < 4; y++) {
				JButton j = new JButton("");
				j.setMinimumSize(new Dimension(128, 128));
				panel.add(j);
			}
		}
	}
}
