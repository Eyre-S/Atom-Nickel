package club.mcmiki.eyre.nickel.system.resource;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Properties;

public class Lang extends Properties {
	
	private static final long serialVersionUID = -1077082851122084687L;
	
	String location = null;
	
	String get(String key) {
		return this.getProperty(key, key);
	}
	
	public Lang(String l) {
		
		try {
			
			URL u = this.getClass().getClassLoader().getResource("nickel/lang/" + l + ".lang");
			String location = java.net.URLDecoder.decode(u.getPath(),"utf-8");  
			
			this.load(new InputStreamReader(new FileInputStream(location), "UTF-8"));
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
	}
}
