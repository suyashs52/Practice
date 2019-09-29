package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
  
public class Intralink_arrival {

	static void code() {
		Integer[] a = { 1,1,1,1,4 };
		Integer[] b = {10,3,6,4,2 };

		List<Integer> a1 = Arrays.asList(a);
		List<Integer> b1 = Arrays.asList(b);

		List<Integer> c = new ArrayList<>();
		List<Integer> d = new ArrayList<>();
		c.add(a1.get(0));
		d.add(b1.get(0));
		 
		for (int i = 1; i < a1.size(); i++) {
			if (c.get(c.size() - 1) == a1.get(i)) {
				if (d.get(d.size() - 1) > b1.get(i))
					d.set(d.size() - 1, b1.get(i));
				continue;
			}
			c.add(a1.get(i));
			d.add(b1.get(i));
		}
		System.out.println(c)

		;

		for (int i = 0; i < d.size(); i++) {
			d.set(i, d.get(i) + c.get(i));
		}
		System.out.println(d);

		int count = 0;
		Integer val=0;
		for (int i = 0; i < d.size(); i++) {
			val= d.get(i);
			count++;
			for(int j=i+1;j<c.size();j++) {
				
				i++;
				if(c.get(j)>=val) {
					i--;
					break;
				}
			}
			
		}
		System.out.println(count);

	}
}
