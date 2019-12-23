package model.chef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chef_RSIGNS {
	public static void code() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int testCase = Integer.parseInt(br.readLine().trim());
			while (testCase-- > 0) {
				int input = Integer.parseInt(br.readLine().trim());
				// 09 18 27 36 45 54 63 72 81 90
				//0099 0198 
				//000+999 001998
				//6 digit 2 digit 
				
				int sum = 0;
				int temp = input;

				while (temp != 0) {
					sum += temp % 10;
					temp = temp / 10;
				}

				int output = (sum / 10 + 1) * 10 - sum;
				System.out.println(input * 10 + output);

			}
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
