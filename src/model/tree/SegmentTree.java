package model.tree;

public class SegmentTree {
	public static void code() {
		A c=new Coll();
		c.d();
		
		//int[] inp = { -1, 2, 4, 0 };
		//createTree(inp, inp.length);

	}

	static Integer[] st;

	// init tree
	static void createTree(int[] arr, int n) {
		int pow = (int) Math.ceil(Math.log(n) / Math.log(2));

		int size = (int) Math.pow(2, pow) * 2 - 1;
		st = new Integer[size];
		construct(arr, 0, n - 1, 0);
		for (Integer s : st)
			System.out.print(s+",");
	}

	static int construct(int[] arr, int startindex, int lastindex, int currindex) {

		if (startindex == lastindex) {
			System.out.println("(s,e,c,line)" + startindex + "," + lastindex + "," + currindex + "," + "return");
			System.out.println("assign index value" + currindex + ">" + arr[startindex]);
			st[currindex] = arr[startindex];

			return arr[startindex];
		}
		int mid = startindex + (lastindex - startindex) / 2;
		System.out.println("(s,e,c,line)" + startindex + "," + lastindex + "," + currindex + "," + 1);
		int a = construct(arr, startindex, mid, currindex * 2 + 1);
		System.out.println("(s,e,c,line)" + startindex + "," + lastindex + "," + currindex + "," + 2);
		int b = construct(arr, mid + 1, lastindex, currindex * 2 + 2);
		System.out.println("assign min value for index " + currindex);
		if (a < b)
			st[currindex] = a;
		else
			st[currindex] = b;
 
		return arr[currindex];

	}

	static int getmid(int start, int end) {
		return 0;
	}
}
interface A{
	default void d() {
		System.out.println("A");
	};
}
interface B{
	default void d() {
		System.out.println("B");
	}
}
class Coll implements A,B{

	@Override
	public void d() {
		// TODO Auto-generated method stub
		A.super.d();
	}
 	
}
