package model;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Rank_StrIntro {
	public static void code() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out);
		try {

			String test1 = br.readLine().trim();
			String test2 = br.readLine().trim();
			
			Scanner scan = new Scanner(System.in);
			//Double d=scan.nextDouble();
			String s=scan.nextLine();
			System.out.println(s);
			System.out.println(test1.length() + test2.length());
			System.out.println(test1.compareTo(test2) >0?"Yes":"No");
			System.out.println(test1.substring(0,1).toUpperCase()+test1.substring(1)+" "+test2.substring(0,1).toUpperCase()+test2.substring(1));
		} catch (Exception ex) {
			wr.println(ex.getMessage());
		}
	}
}
