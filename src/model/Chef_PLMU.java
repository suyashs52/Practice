package model;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class Chef_PLMU {
	public static void code() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out);
		try {

			int testCase = Integer.parseInt(br.readLine().trim());
			for (int i = 0; i < testCase; i++) {
				int input = Integer.parseInt(br.readLine().trim());
				String inp = br.readLine().trim();

				int[] line1 = Arrays.stream(inp.split(" ")).mapToInt(Integer::parseInt).toArray();
				int i0 = -1;
				int i2 = -1;
				int count = 0;
				boolean is2 = inp.indexOf("2") > -1;
				boolean is0 = inp.indexOf("0") > -1;
				int k = 0, j = input - 1;
				if (is2) {
					while (k < j) {
						while (k < j && line1[j] != 2) {
							j--;
						}
						if (k >= j)
							break;
						i2 = j;
						while (k < j && line1[k] != 2) {
							k++;
						}
						if (k >= j)
							break;
						count++;
						k++;
						j--;
					}

				}
				k = 0;
				j = input - 1;
				if (is0) {
					while (k < j) {
						while (k < j && line1[j] != 0) {
							j--;
						}
						if (k >= j)
							break;
						i2 = j;
						while (k < j && line1[k] != 0) {
							k++;
						}
						if (k >= j)
							break;
						count++;
						k++;
						j--;
					}
				}

				System.out.println(count);
			}
		} catch (Exception ex) {
			wr.println(ex.getMessage());
		}

	}
}
