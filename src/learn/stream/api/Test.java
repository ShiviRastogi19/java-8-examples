package learn.stream.api;

import java.util.Arrays;
import java.util.HashSet;

public class Test {

	public static void main(String[] args) {

		int[][] test = new int[][] { { 1, 1, 2, 2, 3, 4, 5 }, { 1, 1, 1, 1, 1, 1, 1 }, { 1, 2, 3, 4, 5, 6, 7 },
				{ 1, 2, 1, 1, 1, 1, 1 } };

		for (int i = 0; i < test.length; i++) {
			Arrays.sort(test[i]);
			for (int j = 0; j < test[i].length-1; j++) {
				if (test[i][j] == test[i][j + 1]) {
					test[i][j + 1] = 0;
				}
			}
		}
		for (int i = 0; i < test.length; i++) {
			for (int j = 0; j < test[i].length; j++) {
				System.out.print(test[i][j]);
			}
			System.out.println("");
		}

		int arr[] = { 10, 5, 3, 4, 3, 5, 6 };
		HashSet<Integer> hs = new HashSet<>();
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (hs.contains(i)) {
				if (i < index) {
					index = i;
				}
			} else
				hs.add(i);
		}
		if (index > -1) {
			System.out.println(arr[index]);
		}
	}

}
