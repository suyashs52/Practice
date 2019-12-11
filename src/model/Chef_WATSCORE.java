package model;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class Chef_WATSCORE {
	public static void code() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out);
		try {

			int testCase = Integer.parseInt(br.readLine().trim());
			for (int i = 0; i < testCase; i++) {
				int input = Integer.parseInt(br.readLine().trim());
				int[] arr = new int[12];
				for (int j = 0; j < input; j++) {

					int[] line1 = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
					arr[line1[0]] = Math.max(arr[line1[0]], line1[1]);
				}
				int sum = 0;
				for (int j = 1; j < 9; j++) {
					sum += arr[j];
				}
				System.out.println(sum);
			}
		} catch (Exception ex) {
			wr.println(ex.getMessage());
		}

	}
}
