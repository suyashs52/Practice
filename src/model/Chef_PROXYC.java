package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chef_PROXYC {
	public static void code() {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {

			int testCase = Integer.parseInt(br.readLine().trim());
			// int MinNum=0;//(int) Math.ceil(testCase*0.75);
			int len = 0;// Integer.parseInt(br.readLine());
			int MinNum = 0;// (int) Math.ceil(len*0.75);
			String input = "";// br.readLine();
			int pc = 0;
			int ac = 0;
			char [] c;
			boolean acFound = false;
			for (int i = 0; i < testCase; i++) {
				len = Integer.parseInt(br.readLine());
				MinNum = (int) Math.ceil(len * 0.75);
				input = br.readLine();
				MinNum = (int) Math.ceil(input.length() * 0.75);
				pc = 0;
				ac = 0;
				c=input.toCharArray();
				if (c[0] == 'P')
					pc++;
				if (c[1] == 'P')
					pc++;
				if (c[len - 2] == 'P')
					pc++;
				if (c[len - 1] == 'P')
					pc++;

				for (int j = 2; j < len - 2; j += 5) {
					acFound = false;

					if (c[j - 2] == 'P') {
						pc++;
						acFound = true;
					}
					if (c[j - 1] == 'P') {
						pc++;
						acFound = true;
					}
					if (c[j + 1] == 'P') {
						pc++;
						acFound = true;
					}
					if (c[j + 2] == 'P') {
						pc++;
						acFound = true;
					}
					if (c[j] == 'P') {
						pc++;
						acFound = false;
					} else
						acFound = true;

					/*
					 * if(input.substring(j-2, j+2).indexOf('P')>-1) { ac++; }
					 */
					if (acFound)
						ac++;
				}

				if (MinNum - pc <= ac) {
					System.out.println(MinNum - pc);
				} else
					System.out.println("-1");

			}

		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
