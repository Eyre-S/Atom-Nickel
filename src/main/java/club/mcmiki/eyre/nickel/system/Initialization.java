package club.mcmiki.eyre.nickel.system;

import club.mcmiki.eyre.nickel.AtomNickel;
import club.mcmiki.eyre.nickel.system.resource.Resource;
import club.mcmiki.eyre.nickel.visual.NickelWindow;

public class Initialization {
	
	public Initialization() {
		
		preferenceInit();
		windowInit();
		
	}
	
	void preferenceInit() {
		
		AtomNickel.preference = new Preference();
		AtomNickel.res = new Resource();
		
	}
	
	void windowInit() {
		
		AtomNickel.window = new NickelWindow();
		AtomNickel.window.c.add(AtomNickel.window.setting, "setting");
		AtomNickel.window.c.add(AtomNickel.window.home, "home");
		AtomNickel.window.setPanel("setting");
	}
	
	public static void preInit() {
		
	}

}
