package model;

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

import model.tree.SegmentTree;

public class Main {
	int a = 100;

	private Main(int w) {
		System.out.println(w);
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
		// System.out.println(1 << 16);

		/*
		 * Set h = new HashSet<>(); h.add(1); h.add(2); h.add(3); h.add(4); h.add(1);
		 * 
		 * h.add(4); List l = new ArrayList<>();
		 * 
		 * l.add(1); l.add(2); l.add(3);
		 * 
		 * h.retainAll(l); System.out.println(" " + h.size());
		 */
		// Integer a = 1000, b = 1000;
		// System.out.println(a == b);

		// Integer c = 200, d = 200;
		// System.out.println(c == d);
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// PrintWriter pr = new PrintWriter(System.out);
		// int testcase = Integer.parseInt(br.readLine().trim());
		// for (int i = 0; i < testcase; i++) {
		// int range = Integer.parseInt(br.readLine().trim());
		// //check how to convert string with space to int effective way
		// int[] num= Arrays.stream(br.readLine().trim().split("
		// ")).mapToInt(Integer::parseInt).toArray();
		//
		// Arrays.sort(num);
		//
		// // if(num.length==1)System.out.println(-1);
		//
		// int k=0;
		// for(int j:num) {
		//
		// if(j!=num[0]) {System.out.println(num[0]+" "+j); k++; break;}
		// }
		// if(k==0) System.out.println(-1);
		//
		//
		// }
		/*
		 * for (int i = 0; i < testcase; i++) { String input=br.readLine().trim();
		 * String [] inp=input.split(" "); char[] c1=inp[0].toCharArray(); char []
		 * c2=inp[1].toCharArray(); Arrays.sort(c1); Arrays.sort(c2);
		 * 
		 * if(Arrays.equals(c1, c2)) System.out.println("YES"); else
		 * System.out.println("NO"); }
		 */

		// pr.close();
		// br.close();

		// Prac_Serialize.code();
		// Sapient_CSVRead.code();
		/*
		 * boolean b1 = true; boolean b2 = false; boolean b3 = true; if (b1 & b2 | b2 &
		 * b3 | b2 | b1) { System.out.println("ok"); } System.out.println(b1 & b2 | b2);
		 * 
		 * // System.out.println(new b(4).base); /* long[] b3 = { 3, 4, 5 }; final
		 * long[] b2 = { 10, 11, 23 };
		 * 
		 * try { perform(b3); System.out.println("k"); } catch (RuntimeException ex) {
		 * System.out.println("a"); } catch (Exception ex) { System.out.println("b"); }
		 * finally { System.out.println("c"); } System.out.println("d");
		 */
		/*
		 * Test.main();
		 * 
		 * Map<abc, Integer> x = new HashMap<abc, Integer>(); x.put(new abc(1), 1);
		 * x.put(new abc(2), 2); x.put(new abc(3), 3); x.put(new abc(4), 4);
		 * 
		 * System.out.println(new abc(2)==new abc(3)); for (Entry<abc, Integer> e :
		 * x.entrySet()) { System.out.println(e.getKey().base);
		 * System.out.println(e.getValue()); } x.remove(new abc(3));
		 * System.out.println(x.size()); int j=100000; int k=100000;
		 * System.out.println(j== k);
		 */

		/*
		 * int i='a'; System.out.println(i); System.out.println(IntStream.range('a',
		 * 'z').sum());
		 */
		/*
		 * CountDownLatch cdl=new CountDownLatch(3); TestThread t1 = new
		 * TestThread(1,cdl,"t1"); TestThread t2 = new TestThread(1,cdl,"t2");
		 * TestThread t3 = new TestThread(1,cdl,"t3");
		 * 
		 * if (t1.isAlive() && t2.isAlive() && t3.isAlive()) { tt.flag = false;
		 * System.out.println("All thread stopped successfully"); } t1.start();
		 * t2.start(); t3.start(); cdl.await();
		 * System.out.println("All thread runned successfully");
		 */
		// CyclicBarrier cb=new CyclicBarrier(3);
		/*
		 * TestCyclicBarrier tcb = new TestCyclicBarrier(1, "tcb"); Thread t1 = new
		 * Thread(tcb); t1.start();
		 */
		// System.out.println(Thread.currentThread().getName() + " has finished");
		/*
		 * OddEvenPrint oep = new OddEvenPrint(); oep.odd = true; Thread t2 = new
		 * Thread(new Runnable() {
		 * 
		 * @Override public void run() { // TODO Auto-generated method stub
		 * oep.printEven(); } }); Thread t3 = new Thread(new Runnable() {
		 * 
		 * @Override public void run() { // TODO Auto-generated method stub
		 * oep.printOdd(); } });
		 */
		/*
		 * t2.start(); t3.start(); t2.join(); t3.join();
		 */
		/*
		 * @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
		 * 
		 * @JoinTable(name = "stock_category", catalog = "mkyongdb", joinColumns = {
		 * 
		 * @JoinColumn(name = "STOCK_ID", nullable = false, updatable = false) },
		 * inverseJoinColumns = { @JoinColumn(name = "CATEGORY_ID", nullable = false,
		 * updatable = false) })
		 * 
		 * @ManyToMany(fetch = FetchType.LAZY, mappedBy = "categories")
		 */
		// X.mains();
		// expedia();
		// System.out.println(missingWords("I am using hackerrank to improve
		// programming", "am hackerrank to improve"));
		// lenscart_largestone();
		// lenscart_chargeup();
		// lenscart_Curve();
		// Chef_CHEFING.code();

		// Chef_CHDIGER.code1();
		// Chef_MAXREM.code();
		// Chef_STRCH.code2();
		// Chef_DEPCHEF.code();
		// Chef_PROXYC.code();
		// Chef_KS2.code();

		// Sapient_ExcelRead.processExcel();
		// Sapient_ExcelEmployee.processExcel();
		// hacker
		// Rank_StrIntro.code();
		/*
		 * switch(3) { default: System.out.println(5); case 4: System.out.println(4);
		 * case 3:System.out.println(3); case 5:System.out.println(5);
		 * 
		 * }
		 */

		// Navis.code();
		// Sapient_CSVRead.code();

		// CivilEngineer.code();
		// ThreadPoolTest.code();

		// producer consumer pro testthread.java
		/*
		 * q qu=new q(); producer pr=new producer(qu); consumer co=new consumer(qu);
		 * consumer co1=new consumer(qu);
		 * 
		 * co1.t.start();pr.t.start(); co.t.start();
		 * System.out.println("press ctrl+c to stop.");
		 */

		//Intralink_arrival.code();
		//Chef_MSNSADM1.code();
	//	Chef_DSTAPLS.code();
		//Microsoft_Gateway.code();
		//Chef_MATCHES.code();
		//Chef_CATFEED.code();
		SegmentTree.code();
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
