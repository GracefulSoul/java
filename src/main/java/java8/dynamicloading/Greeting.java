package java8.dynamicloading;

public class Greeting {
	
	public void greeting(Language language) {
		try {
			Class<?> _class = this.getClass(language);
			Runnable runnable = (Runnable)_class.newInstance();
			runnable.run();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		
	}
	
	private Class<?> getClass(Language language) {
		switch(language) {
			case KOREAN:
				return KoreanGreeting.class;
			default:
				return EnglishGreeting.class;
		}
	}
	
}
