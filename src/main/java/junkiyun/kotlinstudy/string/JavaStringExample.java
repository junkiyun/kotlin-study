package junkiyun.kotlinstudy.string;

class JavaStringExample {
	private static final String MESSAGE_FORMAT = "price of the book is %s";

	/**
	 * Java 에서도 Java 15 이상은 text block 지원함
	 */
	private static final String MULTILINE_MESSAGE_FORMAT = "id: %s\nname: %s\n"
														   + "price: %s";


	public static void main(String[] args) {
		printFormattedMessage(3000);
		printMultilineMessage("adsf", "my book", 1000);
	}

	private static void printFormattedMessage(int price) {
		var message = String.format(MESSAGE_FORMAT, price);
		System.out.println(message);
		System.out.printf(MESSAGE_FORMAT + "\n", price);
	}

	private static void printMultilineMessage(String id, String name, int price) {
		System.out.printf(MULTILINE_MESSAGE_FORMAT, id, name, price);
	}
}
