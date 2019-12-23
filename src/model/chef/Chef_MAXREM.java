package model.chef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Chef_MAXREM {
	public static void code() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int testCase = Integer.parseInt(br.readLine().trim());
			//while(testCase-->0) {
				String input=br.readLine().trim();
				String[] inp = input.split(" ");
				int[] val=Arrays.stream(inp).mapToInt(Integer::parseInt).toArray();
				int max1,max2;
				max1=max2=0;
				for(int i:val) {
					if(max1<i) {
						max2=max1;
						max1=i;
					}else if(max2<i && i!=max1) {
						max2=i;
					}
				}
				System.out.println(max2);
				
			//}
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
