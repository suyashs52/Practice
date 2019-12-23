package model.chef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class Chef_PLMU {
	public static void code() {
		new Thread(null, new PLMU(), "PLMU", 1 << 26).start();
	}
}

class PLMU implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out);
		try {

			int testCase = Integer.parseInt(br.readLine().trim());
			for (int i = 0; i < testCase; i++) {
				br.readLine().trim();
				String inp = br.readLine().trim();

				int[] line1 = Arrays.stream(inp.split(" ")).mapToInt(Integer::parseInt).toArray();
				int twos = 0, zeros = 0;

				for (int j = 0; j < line1.length; j++) {
					if (line1[j] == 2)
						twos++;
					if (line1[j] == 0)
						zeros++;

				}

				// nc2 n(n-1)/2
				long ans = 0;

				ans += ((twos) * (twos - 1)) / 2;
				ans += ((zeros) * (zeros - 1)) / 2;
				System.out.println(ans);

			}
		} catch (Exception ex) {
			wr.println(ex.getMessage());
		}

	}

}
