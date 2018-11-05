package club.mcmiki.eyre.nickel.system;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
	
	
	
	public Logger(String info) {
		System.out.println("[" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + "][" + Thread.currentThread().getName() + "/INFO]" + info);
	}

	public Logger(String info, byte level) throws Exception {
		String levelup = null;
		switch (level) {
		case 0:
			levelup = "INFO";
			break;
		case 1:
			levelup = "WARN";
		case 2:
			levelup = "ERROR";
		default:
			throw new NullPointerException("No such a log level.");
		}
		
		System.out.println("[" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + "][" + Thread.currentThread().getName() + "/" + levelup + "]" + info);
		
	}
	
}
