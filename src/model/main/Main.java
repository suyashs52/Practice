package model.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import model.chef.Chef_PLMU;
import model.spoj.JNEXT;

public class Main {
	int a = 100;

	private Main(int w) {
		System.out.println(w);
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
		code();

	}

	static void code() {

		// chefcode();
		// interviewcode();
		spojcode();
	}

	static void interviewcode() {
		// Intralink_arrival.code();
		// Navis.code();
		// Sapient_CSVRead.code();
		// Sapient_ExcelRead.processExcel();
		// Sapient_ExcelEmployee.processExcel();
		// hacker
		// Rank_StrIntro.code();
		// CivilEngineer.code();
		// Microsoft_Gateway.code();
		// expedia();
		// System.out.println(missingWords("I am using hackerrank to improve
		// programming", "am hackerrank to improve"));
		// Prac_Serialize.code();
		// Sapient_CSVRead.code();

		// lenscart_largestone();
		// lenscart_chargeup();
		// lenscart_Curve();

	}

	static void chefcode() {

		// Chef_MATCHES.code();
		// Chef_CATFEED.code();
		// Chef_CHEFING.code();

		// Chef_CHDIGER.code1();
		// Chef_MAXREM.code();
		// Chef_STRCH.code2();
		// Chef_DEPCHEF.code();
		// Chef_PROXYC.code();
		// Chef_KS2.code();
		// Chef_WATSCORE.code();
		// Chef_PLMU.code();
		// Chef_Pr_LECANDY.code();
		// Chef_Pr_SALARY.code();
		// Chef_MSNSADM1.code();
		// Chef_DSTAPLS.code();
		// Chef_Pr_COPS.code();
		// Chef_Pr_CSUB.code();
		Chef_PLMU.code();
	}

	static void spojcode() {
		try {
			JNEXT.code1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static void javacode() {
		// System.out.println(inspect("Hello BOx") );
		// System.out.println(1 << 16);

	}

	static <T extends Comparable<T>> int counte(T[] a2, T i) {
		int count = 0;
		for (T e : a2) {
			if (e.compareTo(i) > 0) {
				++count;
			}
		}
		return count;
	}

	static <T extends Number> int inspect(T i) {
		System.out.println("U" + i.getClass().getName());
		return 0;
	}

	static class enumdec {
		enum Color {

		}
	}

	static void perform(long[] b1) {
		throw new RuntimeException();

	}

	static void lenscart_largestone() {
		Scanner s = new Scanner(System.in);
		String n = s.nextLine();
		String str = s.nextLine();
		Map<Integer, Integer> m = new HashMap<>();
		int sum = 0, maxlength = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			sum += c == '1' ? -1 : 1;
			if (sum == 1)
				maxlength = i + 1;
			if (!m.containsKey(sum))
				m.put(sum, i);
			if (m.containsKey(sum - 1)) {
				if (maxlength < (i - m.get(sum - 1))) {
					maxlength = i - m.get(sum - 1);
				}
			}
		}
		System.out.println(maxlength);
	}

	public static void lenscart_chargeup() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out);
		int T = Integer.parseInt(br.readLine().trim());
		for (int t_i = 0; t_i < T; t_i++) {
			int N = Integer.parseInt(br.readLine().trim());
			String[] arr_A = br.readLine().split(" ");
			long[] A = new long[N];
			for (int i_A = 0; i_A < arr_A.length; i_A++) {
				A[i_A] = Long.parseLong(arr_A[i_A]);
			}

			int out_ = solve(A, N);
			System.out.println(out_);
			System.out.println("");
		}

		wr.close();
		br.close();
	}

	static int solve(long[] A, int N) {
		// Write your code here

		Set<Long> s = new HashSet<>();
		for (int i = 0; i < N; i++) {
			s.add(A[i]);
		}
		double combination = Math.pow(2, s.size() - 1);
		int sum = 0;
		for (Iterator<Long> it = s.iterator(); it.hasNext();) {
			Long l = it.next();
			if (l >= combination) {
				sum += l;
			}
		}

		return sum;

	}

	public static void lenscart_Curve() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out);

		int N = Integer.parseInt(br.readLine().trim());
		String[] arr_A = br.readLine().split(" ");
		long[] A = new long[5];
		for (int i_A = 0; i_A < arr_A.length; i_A++) {
			A[i_A] = Long.parseLong(arr_A[i_A]);
		}
		N = Integer.parseInt(br.readLine().trim());
		String[] arr_B = br.readLine().split(" ");
		long[] B = new long[N];
		for (int i_B = 0; i_B < arr_B.length; i_B++) {
			B[i_B] = Long.parseLong(arr_B[i_B]);
		}
		System.out.println(((Math.pow(A[0], 3) * 2) + Math.pow(A[1], 2) - A[3] + A[4]) % 5);
		Map<Double, Double> m = new HashMap<>();
		for (int i_B = 0; i_B < arr_B.length; i_B++) {
			m.put(Double.valueOf(
					((Math.pow(B[i_B], 3) * A[0]) + (Math.pow(B[i_B], 2) * A[1]) + (A[3] * B[i_B]) + A[4]) % 5),
					Double.valueOf(B[i_B]));// = Long.parseLong(arr_A[i_B]);
		}
		int count = 0;
		for (int i_B = 0; i_B < arr_B.length; i_B++) {
			Double d = Double.valueOf(Math.pow(B[i_B], 2) % 5);
			if (m.containsKey(d)) {
				System.out.println(m.get(d));
				count++;
			}
			// m.put(Double.valueOf(((Math.pow(A[0], 3) * 2) + Math.pow(A[1], 2) - A[3] +
			// A[4]) % 5), Double.valueOf(B[i_B])) ;// = Long.parseLong(arr_A[i_B]);
		}
		System.out.println(count);
		br.close();
		wr.close();
	}

	static void expedia() {

		List<Integer> arr = new ArrayList<Integer>() {
			{
				add(5);
				add(3);
				add(1);
				add(2);
				add(2);
				add(4);
			}
		};
		Map<Integer, Integer> m = new HashMap<>();
		for (Integer a : arr) {
			if (m.containsKey(a)) {
				Integer t = m.get(a);
				t++;
				m.put(a, t);

			} else {
				m.put(a, 1);
			}
		}
		System.out.println(m.entrySet());
		List<Map.Entry<Integer, Integer>> list = new LinkedList<Map.Entry<Integer, Integer>>(m.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
			public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
				if (o1.getValue() == o2.getValue())
					return o1.getKey().compareTo(o2.getKey());
				else
					return o1.getValue().compareTo(o2.getValue());
			}
		});

		for (Map.Entry<Integer, Integer> me : list) {
			System.out.println(me.getKey());
			for (Integer i = 0; i < me.getValue() - 1; i++) {
				System.out.println(me.getKey());
			}
		}
	}

	public static List<String> missingWords(String s, String t) {
		// Write your code here
		String[] t1 = t.split(" ");

		for (String test : t1) {

			s = s.replaceFirst(" " + test, "");
			// System.out.println(s);
		}

		List<String> s2 = Arrays.asList(s.split(" "));
		for (String test1 : s2) {
			test1 = test1.replace(" ", "");
			System.out.println(test1);
		}
		/*
		 * BufferedReader bufferedReader = new BufferedReader(new
		 * InputStreamReader(System.in)); BufferedWriter bufferedWriter = new
		 * BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		 * 
		 * String s = bufferedReader.readLine();
		 * 
		 * String t = bufferedReader.readLine();
		 * 
		 * List<String> result = Result.missingWords(s, t);
		 * 
		 * bufferedWriter.write( result.stream() .collect(joining("\n")) + "\n" );
		 * 
		 * bufferedReader.close(); bufferedWriter.close();
		 */
		return s2;
	}

}

class X {
	public static void mains() {
		X x = new X();
		X x2 = m1(x); /* Line 6 */
		X x4 = new X();
		x2 = x4; /* Line 8 */
		System.gc();
		long[] b3 = { 3, 4, 5 };
		m2(b3);
		System.out.println(b3[1]);
	}

	static void m2(long[] i) {
		i[1] = 10;
	}

	static X m1(X mx) {
		mx = new X();
		return mx;
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("ehlo");
	}
}

class Test {
	Test i;

	public static void main() {
		Test t1 = new Test();
		Test t2 = new Test();

		// Object of t1 gets a copy of t2
		t1.i = t2;

		// Object of t2 gets a copy of t1
		t2.i = t1;

		// Till now no object eligible
		// for garbage collection
		t1 = null;

		// now two objects are eligible for
		// garbage collection
		t2 = null;

		// calling garbage collector
		System.gc();

	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(10 / 0);
		System.out.println("Finalize method called");
	}
}

class OddEvenPrint {
	boolean odd;
	int count = 1;
	int Max = 20;

	public void printOdd() {
		synchronized (this) {
			while (count < Max) {
				while (!odd) {
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
				System.out.println("ODD" + count);
				count++;
				odd = false;
				notify();
			}
		}
	}

	public void printEven() {
		try {
			Thread.sleep(10);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		synchronized (this) {
			while (count < Max) {
				while (odd) {
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
				System.out.println("EVEN" + count);
				count++;
				odd = true;
				notify();
			}
		}
	}
}
