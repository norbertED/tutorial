package de.meinefirma.meinprojekt;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class App 
{
	private static final Logger LOGGER = Logger.getLogger(App.class);
	
    public static void main( String[] args )
    {
    	PropertyConfigurator.configure("C:/Software NJA/ws_mars/MvnJarMitLibs/target/log4j.properties");
    	LOGGER.info("--- Hallo Logger! ---");
    }
    
    public static String sayHello(String name) {
    	return("Hello " + name.trim());
    }
}
