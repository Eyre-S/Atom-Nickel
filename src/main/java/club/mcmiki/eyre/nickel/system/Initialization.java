package club.mcmiki.eyre.nickel.system;

import club.mcmiki.eyre.nickel.AtomNickel;

public class Initialization {
	
	public Initialization() {
		
		new Logger("Initializating");
		preferenceInit();
		windowInit();
		
	}
	
	void preferenceInit() {
		
	}
	
	void windowInit() {
		
		AtomNickel.window.init();
		AtomNickel.window.loadLanguage();
		
		AtomNickel.window.setVisible(true);
	}
	
	public static void preInit() {
		
	}

}
