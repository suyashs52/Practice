package model;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Chef_CHDIGER {
	
	public static void code() {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int testCase = Integer.parseInt(br.readLine().trim());
			List<String> testCaseli = new ArrayList<>();
			for (int i = 0; i < testCase; i++) {
				testCaseli.add(br.readLine().trim());
			}
			for (int i = 0; i < testCase; i++) {
				String input = testCaseli.get(i);
				String[] inp = input.split(" ");
				StringBuilder sb = new StringBuilder(inp[0]);
				StringBuilder sb1 = new StringBuilder(inp[0]);
				int min = Integer.valueOf(sb.toString());
				char maxChar = '0';
				int highestIndex = -1;
				for (int j = 0; j < sb1.length(); j++) {
					if (sb1.charAt(j) - '0' > maxChar - '0') {
						highestIndex = j;
						maxChar=sb1.charAt(j);
						sb1.setCharAt(highestIndex, ' ');// inp[1].charAt(0));
						sb1.append(inp[1].charAt(0));
						int val = Integer.valueOf(sb1.toString().replaceAll(" ", ""));
						if (val < min) {
							min = val;
							sb1 = new StringBuilder(val+"");
							sb=new StringBuilder(val+"");;
							maxChar = '0';
							j=-1;
						} else
							sb1 =sb;
					}
				}

			/*	sb1.setCharAt(highestIndex, ' ');// inp[1].charAt(0));
				sb.append(inp[1].charAt(0));
*/
				/*int val = Integer.valueOf(sb1.toString().replaceAll(" ", ""));
				if (val < min)
					min = val;
				sb1 = new StringBuilder(inp[0]);*/

				// String output = input.chars().sorted()
				// .collect(StringBuilder::new, StringBuilder::appendCodePoint,
				// StringBuilder::append).toString();
				// output = output.trim().substring(0, inp[0].length());
				System.out.println(min);

			}
			br.close();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		} finally {

		}

	}
	
	public static void code1() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			int testCase = Integer.parseInt(br.readLine().trim());
			while(testCase-->0) {
				String input=br.readLine().trim();
				String[] inp = input.split(" ");
				int n=Integer.parseInt(inp[0]);
				int d=Integer.parseInt(inp[1]);
				
				int[] a=new int[20];
				int [] b=new int[20];
				int i=0;
				int min =11;
				int k=0;
				while(n>0) {
					a[k++]=n%10;
					n/=10;
				}
				int l=0;
				for(int j=0;j<k;j++) {
				 
					if(a[k-j-1]<d) {
						b[l++]=a[k-j-1];
						 System.out.print(k-j-1+">>");
						System.out.print(b[l-1]+"||");
					}
				}
				System.out.println("\n");
				int count=0;
				i=0;
				int index=0;
				if(l!=0) {
					while(true) {
						while(i<l) {
							if(b[i]<min) {
								min=b[i];
								index=i;
							}
							i++;
						}
						if(index!=l-1) {
							System.out.print(min);count++;
							min=11;
							i=index+1;
						}else {
							System.out.print(min); count++; break;
						}
					}
					count=k-count;
					while(count>0) {
						System.out.print(d);count--;
					}
					System.out.println("");
				}
				  
				
				
			}
		}catch(Exception ex) {
			
		}
	}

}
