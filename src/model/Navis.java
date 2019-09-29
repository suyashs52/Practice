package model;

import java.util.HashMap;
import java.util.Map;

public class Navis {
	static void code() {
		// inherit();
		mystry(2437, 875);
	}

	static void inherit() {
		B1 b = new B1();
		C c = new C();
		b = c;
		newprint(b);
	}

	static void newprint(A a) {
		a.name();
	}

	static void mystry(int a, int b) {
		int x = a;
		int y = b;
		while (true) {
			if (x > y)
				x = x - y;
			if (x < y)
				y = y - x;
			if (x == y)
				break;

		}
		System.out.println(x);
		System.out.println(y);
	}
}

class A {
	public void name() {
		System.out.println("A");
	}
}

class B1 extends A {
	public void name() {
		System.out.println("B");
	}
}

class C extends B1 {
	public void name() {
		System.out.println("C");
		student s1=new student();
		student s2=s1;
	}
}
 final class student{
	 final String name;
	 final Map<String,String> sm;
	 student(){
		 this.name="asdf";
		 sm=new HashMap<>();
	 }
	 student(String a){
		  this.name="";
		  sm=new HashMap<>();
	 }
	public String getName() {
		return name;
	}
	 
	 
 }