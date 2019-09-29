package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Chef_CATFEED {

	static void code() {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int testCase = Integer.parseInt(br.readLine().trim());
			int[] match = new int[] { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 };
			while (testCase-- > 0) {

				String input1 = br.readLine().trim();
				String[] inp1 = input1.split(" ");
				String input2 = br.readLine().trim();
				String[] inp2 = input1.split(" ");
				int[] val = Arrays.stream(inp1).mapToInt(Integer::parseInt).toArray();
				int[] val2 = Arrays.stream(inp2).mapToInt(Integer::parseInt).toArray();
				 
				 int[] v=new int[val[0]+1];
				 int count=0;
				 int piv=1;
				 boolean isyes=true;
				 for(int i=0;i<val[1];i++) {
					
					 int min=piv;
					 for(int j=0;j<val[1];j++) {
						 if( v[j]<min) {
							 min=v[val2[j]];
							 break;
						 }
						 
					 }
					 v[val2[i]]++;
					 
					 if(min==piv) {
						 piv++;
					 }
					 if(v[val2[i]]>piv) {
						 isyes=false;
						 break;
					 }
				 }
				 if(isyes) {
					 System.out.println("YES");
				 }else {
					 System.out.println("NO");
				 }

			} 
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
