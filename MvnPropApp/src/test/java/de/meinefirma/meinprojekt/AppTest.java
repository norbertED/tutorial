package de.meinefirma.meinprojekt;

import java.io.IOException;
import java.util.Properties;
import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	
	public void testApp() {
		
		Properties propsApp = new Properties(), propsTst = new Properties();
		try {
			propsApp.load(getClass().getResourceAsStream( "/filtered/MeineProps.properties"));
			propsTst.load(getClass().getResourceAsStream( "/filtered/MeineTestProps.properties"));
			
		} catch(IOException ex ) {
			throw new RuntimeException(ex.getCause());
		}
		assertEquals( "MeinPomProp vor Merge",  "PropAusPom",       propsApp.get( "MeinPomProp"));
		propsApp.putAll(propsTst);
		assertEquals( "MeinPomProp nach Merge", "PropAusTestProps", propsApp.get( "MeinPomProp" ) );
	}
}
