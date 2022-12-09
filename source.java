package prac;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class source {
	
	
	Logger log = Logger.getLogger("source");
	public void test() {
		 PropertyConfigurator.configure("log4j.properties");
		 log.info("khjkhk");
	}
}
