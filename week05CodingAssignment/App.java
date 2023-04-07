package week05CodingAssignment;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		 Logger asteriskLogger = new AsteriskLogger();
	     Logger spacedLogger = new SpacedLogger();
	        
	        asteriskLogger.log("Kennedy");
	        asteriskLogger.error("Maverick");
	        
	        spacedLogger.log("Max");
	        spacedLogger.error("Haley");
	    }
	}