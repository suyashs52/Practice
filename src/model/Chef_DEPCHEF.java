package model;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class Chef_DEPCHEF {
	public static void code() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out);
		try {

			int testCase = Integer.parseInt(br.readLine().trim());
			for (int i = 0; i < testCase; i++) {
				int input = Integer.parseInt(br.readLine().trim());
				int[] line1 = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
				int[] line2 = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
				int sum = -1;
				 
				if (line1[0] + line1[line1.length - 1] < line2[0])
					sum = line2[0];
				for(int j=1;j<line1.length-1;j++) {
					if(line1[j-1]+line1[j+1]<line2[j] && sum<line2[j]) {
						sum=line2[j];
					}
				}
				System.out.println(sum);
			}
		} catch (Exception ex) {
			wr.println(ex.getMessage());
		}

	}
}
