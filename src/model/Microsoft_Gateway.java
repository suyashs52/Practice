package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Microsoft_Gateway {

	public static void code() {
		// TODO Auto-generated method stub
		List<Integer> a = new ArrayList<Integer>(Arrays.asList(1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 5, 5, 5, 6, 6, 6, 6,
				7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 9, 10, 10, 11, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 12, 12, 13, 13,
				13, 13, 14, 14, 14, 14, 14, 16, 16, 16, 16, 16, 16, 17, 17, 17, 18, 18, 18, 18, 18, 18, 18, 18, 19, 19,
				19, 19, 19, 19, 19, 20, 20, 20, 20, 20));
	//	a = new ArrayList<Integer>(Arrays.asList(1, 1, 1, 1, 2));
		// second <3, 10sec <20, 60 < 60
	//	a = new ArrayList<Integer>(Arrays.asList(1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7));
		Collections.sort(a);
		Map<Integer, Integer> m = new TreeMap<>();

		for (Integer a1 : a) {
			if (!m.containsKey(a1)) {
				m.put(a1, 1);
			} else {
				m.put(a1, m.get(a1) + 1);

			}
		} 

	}

}
