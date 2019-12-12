package model;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class Chef_Pr_COPS {
	public static void code() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out);
		try {

			int testCase = Integer.parseInt(br.readLine().trim());
			for (int j = 0; j < testCase; j++) {

				int[] line1 = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();

				int[] line2 = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();

				int multi = line1[1] * line1[2];
				int safe = 0;
				int count = 0;
				Arrays.sort(line2);
				int[] home = new int[101];
				int j1 = 1;

				for (int i = 0; i < line1[0] && j1 < 101; i++) {
					j1 = Math.max(line2[i] - multi, j1);
					int jl = Math.min(100, line2[i] + multi);

					for (; j1 < jl + 1; j1++) {
						home[j1] = 1;
					}

				}
				for (int i = 1; i < 101; i++) {
					count += home[i] == 0 ? 1 : 0;
				}
				System.out.println(count);

			}
		} catch (Exception ex) {
			wr.println(ex.getMessage());
		}

	}
}
