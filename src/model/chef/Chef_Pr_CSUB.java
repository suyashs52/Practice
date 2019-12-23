package model.chef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class Chef_Pr_CSUB {

	public static void code() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out);
		try {

			int testCase = Integer.parseInt(br.readLine().trim());
			for (int j = 0; j < testCase; j++) {
				br.readLine().trim();
				String inp = br.readLine().trim();
				double count = 0;
				for (int i = 0; i < inp.length(); i++) {
					if (inp.charAt(i) == '1')
						count++;
				}

//						abcd n=4			
//						a b c d=n-0
//						ab bc cd =n-1
//						abc bcd =n-2
//						abcd n-3
//
//						n*n-(n*(n-1)/2)	/ n+n-1+n-2+n-3+..1
//						2n2-n2+n
//						n(n+1)/2
				String format = String.format("%.0f", (count * (count + 1)) / 2);
				System.out.println(format);

			}
		} catch (Exception ex) {
			wr.println(ex.getMessage());
		}

	}

}
