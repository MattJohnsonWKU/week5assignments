package week05CodingAssignment;

public class SpacedLogger implements Logger {
	
    @Override
    public void log(String log) {
        StringBuilder spacedOut = new StringBuilder();
        for (char i : log.toCharArray()) {
            spacedOut.append(i).append(" ");
        }
        System.out.println(spacedOut.toString().trim());
    }
    
    @Override
    public void error(String error) {
        StringBuilder spacedOut = new StringBuilder();
        for (char i : error.toCharArray()) {
            spacedOut.append(i).append(" ");
        }
        System.out.println("ERROR: " + spacedOut.toString().trim());
    }
}

