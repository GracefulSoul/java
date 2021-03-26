package java8.lambda;

import java.util.stream.IntStream;

public class Lambda {

	public static void main(String[] args) {
		int sum = IntStream.range(0, 11) // 0 ~ 10
				.filter(num -> num % 2 == 0) // If number is even.
				.sum();
		System.out.println(sum);
	}

}
