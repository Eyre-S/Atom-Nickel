package club.mcmiki.eyre.nickel.visual.label;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import club.mcmiki.eyre.nickel.AtomNickel;
import club.mcmiki.eyre.nickel.system.Logger;

public class Home extends JPanel {

	private static final long serialVersionUID = -4568541638376041622L;

	JPanel menu = new JPanel(null);
	
	JButton exit = new JButton();
	JButton setting = new JButton();
	JPanel push = new JPanel(null);
		JLabel pushIndex = new JLabel(AtomNickel.res.getLang("panelPush.index.name"));
	
	public Home() {
		
		this.setBounds(0, 0, 800, 480);
		this.setBackground(new Color(0xff, 0xff, 0xff, 0));
		menu.setBounds(740, 0, 60, 480);
		menu.setBackground(new Color(0x5a, 0x5a, 0x5a, (int)(256*0.75f)));
		
		push.setBounds(60, 40, 200, 400);
		push.setBackground(new Color(0xbb, 0xff, 0xff, (int)(256*0.5f)));
		pushIndex.setFont(new Font("等线 Light", 0, 20));
		pushIndex.setBounds(20, 20, 160, 40);
		
		exit.setBounds(10, 10, 40, 40);
		exit.setBackground(new Color(0xff, 0xaa, 0xaa));
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Logger("Exiting by button...");
				System.exit(0);
				
			}
		});
		
		setting.setBounds(10, 430, 40, 40);
		setting.setBackground(new Color(0xff, 0xff, 0xaa, 255));
		setting.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Logger("user:open settiing");
				AtomNickel.window.setPanel("setting");
			}
		});
		
		menu.add(setting);
		menu.add(exit);
		push.add(pushIndex);
		this.add(push);
		this.add(menu);
	}
	
}
