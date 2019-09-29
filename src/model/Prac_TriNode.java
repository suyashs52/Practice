package model;

import java.util.Arrays;
import java.util.Scanner;

public class Prac_TriNode {

}

class TrieNode {
	TrieNode[] child;
	int maxCount;
int prior;
	public TrieNode() {
		maxCount = 0;
		prior=0;
		child = new TrieNode[26];
		Arrays.fill(child, null);
	}

	public void insert(TrieNode node, String value, int p) {
		for (char c : value.toCharArray()) {
			int index=c-'a';
			if(node.child[index]==null) {
				node.child[index]=new TrieNode();
				node.child[index].maxCount++;
				node.child[index].prior=Math.max(p, node.child[index].prior);
				node=node.child[index];
			}
		}
	}
	public static void code() {
		Scanner sc=new Scanner(System.in);
		TrieNode node=new TrieNode();
		int n=sc.nextInt();
		int m=sc.nextInt();
		while(n-->0) {
			String value=sc.next();
			int p=sc.nextInt();
			node.insert(node, value, p);
		}
		
	}
}
