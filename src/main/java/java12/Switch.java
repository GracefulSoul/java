package java12;

public class Switch {

	public static void main(String[] args) {
		System.out.println(getMessageInJava11(args.length));
		System.out.println(getMessageInJava12(args.length));
	}
	
	// Java11
	private static String getMessageInJava11(int count) {
		switch(count) {
			case 1:
				return "have one args.";
			case 2:
				return "have two args.";
			default:
				return "have more than two args.";
		}
	}
	
	// Java12
	private static String getMessageInJava12(int count) {
		return switch(count) {
			case 1 -> "have one args.";
			case 2 -> "have two args.";
			default -> "have more than two args.";
		}
	}

}
