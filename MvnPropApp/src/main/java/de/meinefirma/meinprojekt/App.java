package de.meinefirma.meinprojekt;

import java.io.IOException;
import java.util.Properties;

import javax.management.RuntimeErrorException;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println(new App().run() );
    }
    
    public String run() {
    	
    	Properties props = new Properties();
    	try {
    		//Properties einlesen
    		props.load(getClass().getResourceAsStream("/filtered/MeineProps.properties"));
    	} catch(IOException ex) {
    		throw new RuntimeException(ex.getCause());
    	}
    	// Properties in String wandeln
    	String  s = props.toString();
    	if (s.length() > 2 ) {
			s = s.substring(1, s.length() -1); 
		}
    	return s.replace( ", ", "\n" );
    }
}
