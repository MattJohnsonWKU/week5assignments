package week05CodingAssignment;

public class AsteriskLogger implements Logger {
	
	 @Override
	    public void log(String log) {
	        System.out.println("***" + log + "***");
	    }
	    
	    @Override
	    public void error(String error) {
	        int length = error.length() + 13;
	        String asterisks = "*".repeat(length);
	        System.out.println(asterisks);
	        System.out.println("***Error: " + error + "***");
	        System.out.println(asterisks);
	    }
	}