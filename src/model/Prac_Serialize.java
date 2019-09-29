package model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Prac_Serialize {
	public static void code() {
		b B = new b(1, 2);
		B.derived = 10;
		B.base = 20;

		FileOutputStream fos;
		try {
			fos = new FileOutputStream("ts.txt", false);

			ObjectOutputStream obj = new ObjectOutputStream(fos);
			obj.writeObject(B);
			FileInputStream fis = new FileInputStream("ts.txt");
			ObjectInputStream objin = new ObjectInputStream(fis);
			b bc = (b) objin.readObject();
			System.out.println(bc.base);
			System.out.println(bc.derived);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
interface abcd{
	public  int base=10;
	public default  void display() {};
}
class abc {
	public int base = 0;

	abc() {
		System.out.println("parent abc");
		base = 12;
	}

	abc(int b) {
		base = b;
	}
	public void display() {
		System.out.println("abc");
	}

	// @Override
	// public boolean equals(Object obj) {
	// // TODO Auto-generated method stub
	// return true;
	// }

	// @Override
	// public int hashCode() {
	//
	// return 21;
	// }
}

class b extends abc implements abcd,Serializable {
	int derived = 6;
	public int base = 1;

	b() {
		System.out.println("child b");
		base = 3;
	}

	b(int m, int n) {
		super(m);
		base = 2;
		derived = 7;

	}
	public void display() {
		System.out.println(this.base);
		System.out.println(super.base);
		System.out.println("bdc");
	}
	class Animal {
		int i = 10;

		Animal() {
			System.out.println("Parent class cons");
		}
	}

	class Dogy extends Animal implements Serializable {
		Dogy() {
			System.out.println("Child class constructor");
		}

		int j = 20;
	}

}
