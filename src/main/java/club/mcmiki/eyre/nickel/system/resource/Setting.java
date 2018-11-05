package club.mcmiki.eyre.nickel.system.resource;

import java.awt.Color;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Setting extends JPanel {
	
	JPanel chosen = new JPanel(null);
	
	public Setting() {
		this.setBounds(0, 0, 800, 480);
		this.setBackground(new Color(0xff, 0xff, 0xff, 0));
		
		chosen.setBounds(0, 40, 80, 320);
		chosen.setBackground(new Color(0x5a, 0x5a, 0x5a, (int)(256*0.75f)));
		
		this.add(chosen);
	}

}
