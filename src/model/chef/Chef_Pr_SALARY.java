package model.chef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class Chef_Pr_SALARY {
	public static void code() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out);
		try {

			int testCase = Integer.parseInt(br.readLine().trim());
			for (int j = 0; j < testCase; j++) {
				br.readLine().trim();
				int[] line2 = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
				int diff = 0;
				for (int i = line2.length - 1; i > 0; i--) {
					diff += line2[i] - line2[i - 1];
				}
				if (diff > 0) {
					System.out.println(diff + 1);
				} else
					System.out.println(diff);

			}
		} catch (Exception ex) {
			wr.println(ex.getMessage());
		}

	}
}
