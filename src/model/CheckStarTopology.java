package model;

import java.util.Arrays;
import java.util.Scanner;

public class CheckStarTopology {
	// input
	/*
	 * 5 4 1 2 1 3 1 4 1 5
	 */
	// output yes/no
	// static FastReader in;
	static int[] ve;
	static int[][] graph;

	static void main() {
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextLine()) {

			ve = Arrays.asList(sc.nextLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray();
			graph = new int[ve[0] + 1][ve[0] + 1];
			for (int i = 0; i < ve[1]; i++) {
				int[] param = Arrays.asList(sc.nextLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray();
				graph[param[0]][param[1]]++;
				graph[param[1]][param[0]]++;
			}
			System.out.println(checkStartTopology(graph));
		}

	}

	static boolean checkStartTopology(int[][] g) {

		if (ve[1] != ve[0])
			return false;
		if(ve[0]==1) return true;
		
		
		return true;
	}

}
