package generic.wildcard.capture;

import java.util.List;

public class WildcardError {
	
	void foo(List<?> i) {
		i.set(0, i.get(0)); // The method set(int, capture#1-of ?) in the type List<capture#1-of ?> is not applicable for the arguments (int, capture#2-of ?)
	}

}
