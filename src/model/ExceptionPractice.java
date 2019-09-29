package model;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ExceptionPractice {

	public static void mains(String... args) throws Exception {
		 
		List<String> lstr = Arrays.asList("5", "2");
		List<String> lstr1;

		lstr1 = lstr;

		// throwable();
		//foo();
		try {
			System.out.println("hello");
			return;
		} finally {
			System.out.println("world");
			return;
		}
	}

	static void runtimeException() {
		throw new IndexOutOfBoundsException();

	}

	static void throwable() throws Exception {
		try {

			throw new ArrayIndexOutOfBoundsException();

		} catch (Error e) { // LINE A

			System.out.println("Error" + e);
		} catch (ArrayIndexOutOfBoundsException re) {
			RuntimeException rse = new RuntimeException(re);
			re.initCause(rse);
			System.out.println("Runtim");
			throw re;
		} catch (Exception e) {
			System.out.println("Exception");
		} catch (Throwable t) {
			System.out.println("Throwable");
		} finally {
			System.out.println("file");
			// throw new FileNotFoundException();
		}
	}

	public static void foo() {
		try {
			throw new ArrayIndexOutOfBoundsException();
		} catch (ArrayIndexOutOfBoundsException oob) {
			RuntimeException re = new RuntimeException(oob);
			re.initCause(oob);
			throw re;
		}
	}
}
