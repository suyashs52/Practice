package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Map;

public class Chef_CHEFING {
	public static void code() throws NumberFormatException, IOException {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter wr = new PrintWriter(System.out);
			int testCase = Integer.parseInt(br.readLine().trim());
			for (int i = 0; i < testCase; i++) {
				int subCase = Integer.parseInt(br.readLine().trim());
				int[] c = new int[26];
				//Arrays.fill(c, 1);
				int count = 0;
				for (int j = 0; j < subCase; j++) {
					char[] s = br.readLine().trim().toCharArray();
					count++;
					for (int k = 0; k < s.length; k++) {
						  
						if (c[s[k] - 'a'] == count-1) {
							c[s[k] - 'a']=count;
						}
							 
						 

					}
				}
 
				int sum = 0;
				for (int k = 0; k < 26; k++) {
					if (c[k] == count) {
						sum++;
					}
				}
				//System.arraycopy
				System.out.println(sum);
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}
}
