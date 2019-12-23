package model.chef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class Chef_Pr_LECANDY {
	public static void code() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out);
		try {

			int testCase = Integer.parseInt(br.readLine().trim());
			for (int j = 0; j < testCase; j++) {
				int[] line1 = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
				int[] line2 = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
				boolean possible = true;
				for (int i = 0; i < line1[0]; i++) {
					line1[1] -= line2[i];
					if (line1[1] < 0) {
						possible = false;
						break;
					}

					
				}
				if (possible)
					System.out.println("Yes");
				else
					System.out.println("No");

			}
		} catch (Exception ex) {
			wr.println(ex.getMessage());
		}

	}
}
