package exercise05;

public class AnsiEncoder {
	
	private static final String ANSI_RESET = "\u001B[0m";
	private static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
	private static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
	private static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	
	
	public static String withRedBG(String text) {
		return ANSI_RED_BACKGROUND + text;
	}
	
	public static String withGreenBG(String text) {
		return ANSI_GREEN_BACKGROUND + text;
	}
	
	public static String withYellowBG(String text) {
		return ANSI_YELLOW_BACKGROUND + text;
	}
	
	public static String withReset(String text) {
		return text + ANSI_RESET;
	}
	

}
