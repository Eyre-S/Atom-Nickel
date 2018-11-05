package club.mcmiki.eyre.nickel.system.resource;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import club.mcmiki.eyre.nickel.AtomNickel;

public class Resource {
	
	Lang lang = new Lang(AtomNickel.preference.language);
	
	public String get(String source) {
		
		try {
			URL u = this.getClass().getClassLoader().getResource(source);
			return java.net.URLDecoder.decode(u.getPath(),"utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return e.toString();
		}
		
	}
	
	public String getLang(String key) {
		return lang.get(key);
	}

}
