package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Chef_MSNSADM1 {
	static void code() {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int testCase = Integer.parseInt(br.readLine().trim());
			while (testCase-- > 0) {
				br.readLine();
				String input1 = br.readLine().trim();
				String[] inp1 = input1.split(" ");
				int[] val1 = Arrays.stream(inp1).mapToInt(Integer::parseInt).toArray();
				String input2 = br.readLine().trim();
				String[] inp2 = input2.split(" ");
				int[] val2 = Arrays.stream(inp2).mapToInt(Integer::parseInt).toArray();
				int max1 = -1;
				int val = -1;
				for (int i = 0; i < val1.length; i++) {
					val = ((val1[i] << 2) - (val2[i] << 1)) * 5;
					if(val<0)val=0;
					if(val>max1) {
						max1=val;
					}
				}
				System.out.println(max1);

			}
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
