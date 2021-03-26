package exception;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		FileService fileService = new FileService();
		System.out.println("try-catch");
		printList(fileService.usingTryCatch());
		System.out.println("try-with-reousrce");
		printList(fileService.usingTryWithResources());
	}
	
	private static void printList(List<?> list) {
		list.forEach(System.out::println);
	}

}
