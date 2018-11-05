package club.mcmiki.eyre.nickel;

import club.mcmiki.eyre.nickel.system.Initialization;
import club.mcmiki.eyre.nickel.system.Logger;
import club.mcmiki.eyre.nickel.system.Preference;
import club.mcmiki.eyre.nickel.system.resource.Resource;
import club.mcmiki.eyre.nickel.visual.NickelWindow;

public class AtomNickel {
	
	public static NickelWindow window = null;
	public static Preference preference = null;
	public static Resource res = null;
	
	public static final String NAME = "Atom Nickel";
	public static final String ID = "nickel";
	public static final String VERSION = "0.1.0";
	public static final int BUILD_VERSION = 1;

	public static void main(String[] args) {
		new Logger("System starting...");
		
		new Initialization();
		
		new Logger("System started");
	}

}
