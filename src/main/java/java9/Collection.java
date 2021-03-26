package java9;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collection {

	public static void main(String[] args) {
		// Java8
		List<String> list = Collections.unmodifiableList(Stream.of("foo", "bar", "baz").collect(Collectors.toList()));
		Set<String> set = Collections.unmodifiableSet(Stream.of("foo", "bar", "baz").collect(Collectors.toSet()));
		// Java9
		List<String> list = List.of("foo", "bar", "baz");
		Set<String> set = Set.of("foo", "bar", "baz");
	}

}
