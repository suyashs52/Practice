package model.spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import javax.swing.text.html.parser.Parser;

public class JNEXT {
	public static void code() {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int testCase = Integer.parseInt(br.readLine().trim());
			while (testCase-- > 0) {
				br.readLine().trim();
				String input1 = br.readLine().trim().replaceAll("\\s", "");
				// String[] inp1 = input1.split(" ");
				// int[] val = Arrays.stream(inp1).mapToInt(Integer::parseInt).toArray();
//				1
//				5
//				1 5 4 8 3
				String result = input1;
				for (int i = input1.length() - 2; i > 0; i--) {

					String s = input1.substring(i, input1.length());
					String[] inp1 = s.split("");
					int[] val = Arrays.stream(inp1).mapToInt(Integer::parseInt).toArray();
					int f = val[0];

					int max = -1;
					Arrays.sort(val, 1, val.length);
					for (int j = 1; j < val.length; j++) {
						if (val[j] > val[0]) {
							max = val[j];
							val[j] = val[0];
							val[0] = max;
							break;
						}
					}
					if (max == -1)
						continue;

					// Arrays.sort(val, 1, val.length);
					// val[0]=f;

					result = result.substring(0, i);
					for (int j = 0; j < val.length; j++) {
						result += val[j];
					}
					break;

				}
				System.out.println(result);

			}
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void code1() throws Exception {

		// get last decreasing sequence, 465432 its 4->6
		// then swap it, now sort ie swap next all element from last to next element
		model.Parser in = new model.Parser(System.in);
		StringBuilder sb = new StringBuilder();

		int num = in.nextInt();

		for (int x = 0; x < num; x++) {
			int t = in.nextInt();
			int k = -1;
			int[] array = new int[t];
			array[0] = in.nextInt();
			// 1 5 4 8 3 15843
			// 573664556 573665456
			// 1 5 1 5 4 8 3 5
			// 1 6 6 6 5 4 5 3
			// 1 6 1 4 8 7 6 5
			for (int y = 1; y < t; y++) {
				array[y] = in.nextInt();
				if (array[y] > array[y - 1])
					k = y - 1;
			}
			if (k == -1)
				sb.append("-1\n");
			else {
				for (int l = array.length - 1; l > k; l--) {
					if (array[l] > array[k]) {
						int temp = array[l];
						array[l] = array[k];
						array[k] = temp;
						int count = 0;
						System.out.println((array.length + k + 1) / 2);
						System.out.println(array.length - k);//remaining+1
						for (int a = k + 1; a < (array.length + k + 1) / 2; a++) {
							// array.length+array.length/2 is array.length remaining
							// remaining=ar.length-(k),2r=2l-2k, l+l-k-k,l+k+l-k-k-k
							//count the remaining element to iterate
							// i:10,n:5,r:10+5+1/2:8
							int s = array[a];
							array[a] = array[array.length - 1 - count];
							array[array.length - 1 - count] = s;
							count++;
						}

						break;
					}
				}

				for (int r = 0; r < array.length; r++) {
					sb.append(array[r]);
				}
				sb.append("\n");
			}
		}

		System.out.println(sb);

	}

}
