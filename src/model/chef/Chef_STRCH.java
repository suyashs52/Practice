package model.chef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Chef_STRCH {
	public static void code() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int testCase = Integer.parseInt(br.readLine().trim());
			while (testCase-- > 0) {
				int inp = Integer.parseInt(br.readLine().trim());
				String inp1 = br.readLine().trim();
				String[] t = inp1.split(" ");

				char[] c1 = t[0].toCharArray();
				char c2 = t[1].charAt(0);

				int count = 0;
				for (int i = 1; i <= c1.length; i++) {

					for (int j = 0; j <= c1.length - i; j++) {
						// System.out.println("i>"+i);

						boolean b = false;
						for (int k = j; k <= j - 1 + i; k++) {
							// System.out.println(j +"," + k);

							if (!b && c1[k] == c2) {
								b = true;
								count++;
								break;
							}
						}

					}

				}
				System.out.println(count);

			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void code1() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int testCase = Integer.parseInt(br.readLine().trim());
			while (testCase-- > 0) {
				int inp = Integer.parseInt(br.readLine().trim());
				String inp1 = br.readLine().trim();
				String[] t = inp1.split(" ");

				int n = t[0].length();
				int count = 0;
				for (int i = 0; i < n; i++)
					for (int j = i + 1; j <= n; j++) {
						if (t[0].substring(i, j).contains(t[1])) {
							count++;
						}
					}

				System.out.println(count);

			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	static String inputStr;
	static char ch;
	static int count;

	public static void code2() {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int testCase = Integer.parseInt(br.readLine().trim());
			while (testCase-- > 0) {
				int inp = Integer.parseInt(br.readLine().trim());
				String inp1 = br.readLine().trim();
				String[] t = inp1.split(" ");
				inputStr = t[0];
				ch = t[1].charAt(0);
				int n = inputStr.length();
				count = 0;
				combine();
				System.out.println(count);

			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	static void combine() {
		combine(0);
	}

	static void combine(int start) {
		for (int i = start; i < inputStr.length(); ++i) {
			if (inputStr.charAt(i) == ch) {
				count++;
				break;
			}

			if (i < inputStr.length())
				combine(i + 1);

		}
	}
}
