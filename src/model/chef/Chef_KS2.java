package model.chef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Chef_KS2 {

	public static void code() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int testCase = Integer.parseInt(br.readLine().trim());
			while(testCase-->0) {
				int input=Integer.parseInt(br.readLine().trim());
				 //1 9,2 8,3 7,4 6,5 5, 9,
				//109,118,127,136,145,
				//992
				int sum=0;
				int temp=input;
				
				while(temp!=0) {
					sum+=temp%10;
					temp=temp/10;
				}
				
				int output=(sum/10+1)*10-sum;
				System.out.println(input*10+output);
				
				
			 }
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

