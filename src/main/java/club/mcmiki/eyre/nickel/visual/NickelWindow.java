package club.mcmiki.eyre.nickel.visual;

import java.awt.CardLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import club.mcmiki.eyre.nickel.AtomNickel;
import club.mcmiki.eyre.nickel.system.Logger;
import club.mcmiki.eyre.nickel.system.resource.Setting;
import club.mcmiki.eyre.nickel.visual.label.Home;

public class NickelWindow extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	public Home home = new Home();
	public Setting setting = new Setting();
	
	int xOld = 0;
	int yOld = 0;
	
	public void init() {
		home.init();
		setting.init();
		new Logger("> Initializating Window");
		
		
		this.setLayout(new CardLayout());
		this.setBounds(200, 100, 800, 480);
		this.setUndecorated(false);
		this.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				new Logger("Window opened.");
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO 自动生成的方法存根
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO 自动生成的方法存根
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO 自动生成的方法存根
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				new Logger("System closed.");
				System.gc();
				System.exit(0);
				
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO 自动生成的方法存根
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO 自动生成的方法存根
				
			}
		});
		
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				xOld = e.getX();//记录鼠标按下时的坐标
				yOld = e.getY();
			}
		});
		
		this.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int xOnScreen = e.getXOnScreen();
				int yOnScreen = e.getYOnScreen();
				int xx = xOnScreen - xOld;
				int yy = yOnScreen - yOld;
				NickelWindow.this.setLocation(xx, yy);
//				new Logger(
//						"Location changed by draging mouse\n"
//						+ "\tOld Position:(" + xOnScreen + "," + yOnScreen + ") ;"
//						+ " New Position:(" + xx + "," + yy + ")"
//				);
			}
		});
		
//		this.add(setting);
		this.add(home);
	}
	
	public void loadLanguage() {
		this.setTitle(AtomNickel.res.getLang("window.name"));
//		this.setBg();
		home.loadLanguage();
	}
//
//	public void setBg(){ 
//		((JPanel)this.getContentPane()).setOpaque(false); 
//		ImageIcon img = new ImageIcon
//				(AtomNickel.res.get("nickel/picture/test-bg.png")); 
//		JLabel background = new JLabel(img);
//		this.getLayeredPane().add(background, new Integer(Integer.MIN_VALUE)); 
//		background.setBounds(0, 0, img.getIconWidth(), img.getIconHeight()); 
//	}
}
