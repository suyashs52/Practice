package model.chef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Chef_DSTAPLS {
	static void code() {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int testCase = Integer.parseInt(br.readLine().trim());
			while (testCase-- > 0) {

				String input1 = br.readLine().trim();
				String[] inp1 = input1.split(" ");
				int[] val1 = Arrays.stream(inp1).mapToInt(Integer::parseInt).toArray();
				if (val1[1] == 1) {
					System.out.println("NO");
					continue;
				}

//				int pow = 1;
//				while (pow < val1[0]) {
//					pow *= val1[1];
//				}
				/*
				 * int res1 = (int) Math.log(val1[0]) / (int) Math.log(val1[1]); double res2 =
				 * (double) Math.log(val1[0]) / (double) Math.log(val1[1]);
				 */

//				if (pow == val1[0]) {
//					System.out.println("NO");
//				} else {
//					System.out.println("YES");
//				}

//				int val = val1[0];
//				int[] val2 = new int[val1[1]];
//				int i = 0;
//				while (val > 0) {
//					if (i > val1[1])
//						i = 0;
//					val2[i] = val2[i] + val1[1];
//					val -= val1[1];
//				}
//
//				boolean found = false;
//				int matchval=val1[0]/val1[1];
//				for ( i = 0; i < val1[1]; i++) {
//					if(val2[i]!=matchval) {
//						found=true;
//						break;
//					}
//				}
				if((val1[0]%(val1[1]*val1[1]))==0)
					System.out.println("NO");
				else {
					System.out.println("YES");
				}

			}
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
