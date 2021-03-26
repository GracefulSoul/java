package java8.dynamicloading;

public class LoadTimeLoading {

	public static void main(String[] args) {
		Greeting greeting = new Greeting();
		greeting.greeting(Language.DEFAULT);
		greeting.greeting(Language.KOREAN);
	}

}
