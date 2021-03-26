package java10;

import java.util.HashMap;
import java.util.Map;

public class TypeInference {

	public static void main(String[] args) {
		// Java6
		Map<Integer, String> map = new HashMap<Integer, String>();
		// Java7
		Map<Integer, String> map = new HashMap<>();
		// Java10
		var map = new HashMap<Integer, String>();
	}

}
