package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Chef_MATCHES {

	static void code() {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int testCase = Integer.parseInt(br.readLine().trim());
			int[] match = new int[] { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 };
			while (testCase-- > 0) {

				String input1 = br.readLine().trim();
				String[] inp1 = input1.split(" ");
				int[] val = Arrays.stream(inp1).mapToInt(Integer::parseInt).toArray();
				int count = 0;
				int sum = val[0] + val[1];
				String num=String.valueOf(sum);
				for(int i = 0; i < num.length(); i++) {
				    int j = Character.digit(num.charAt(i), 10);
				   count+=match[j];
				   
				}
				System.out.println(count);

			} 
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
