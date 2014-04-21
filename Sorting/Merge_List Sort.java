import java.io.*;
import java.util.*;

public class Solution {
	private static int cmp = 0;
	public static List<Integer> merge(List<Integer> list, List<Integer> list2) {
		int lwr_pointer = 0;
		int uppr_pointer = 0;
		List<Integer> srtd_arr = new ArrayList<Integer>();
		int index = -1;
		while (true) {
			if (lwr_pointer >= list.size() && uppr_pointer >= list2.size())
				break;
			else if (lwr_pointer == list.size() && uppr_pointer < list2.size()) {
				index++;
				srtd_arr.add(index, list2.get(uppr_pointer));
				uppr_pointer++;
			} else if (lwr_pointer < list.size()
					&& uppr_pointer == list2.size()) {
				index++;
				srtd_arr.add(index, list.get(lwr_pointer));
				lwr_pointer++;
			} else if ((lwr_pointer < list.size() && uppr_pointer < list2
					.size())) {
				index++;
				if (list.get(lwr_pointer).intValue() <= list2.get(uppr_pointer).intValue()) {
					srtd_arr.add(index, list.get(lwr_pointer));
					lwr_pointer++;
				} else {
					srtd_arr.add(index, list2.get(uppr_pointer));
					uppr_pointer++;
				}
				cmp++;
			}

		}
		/*
		 * for(int i=0;i<srtd_arr.length;i++) System.out.print(srtd_arr[i]+":");
		 * System.out.println();
		 */
		return srtd_arr;
	}

	public static void main(String args[]) throws Exception {

		List<List<Integer>> arrays = new ArrayList<List<Integer>>();
		Scanner scanner = null;
		try {

			scanner = new Scanner(System.in);

			while (scanner.hasNextLine()) {
				String str = scanner.nextLine();
				String[] tokens = str.split(" ");
				List<Integer> array = new ArrayList<Integer>(tokens.length);
				for (int i = 0; i < tokens.length; i++) {
					array.add(Integer.parseInt(tokens[i]));
				}
				arrays.add(array);

			}

			while (arrays.size() > 1) {
				List<Integer> tmp = merge(arrays.get(0), arrays.get(1));
				arrays.remove(0);
				arrays.remove(0);				
				arrays.add(0, tmp);
			}
			
			System.out.println(cmp);

			for (int i = 0; i < arrays.size(); i++) {
				for (int j = 0; j < arrays.get(i).size(); j++) {
					System.out.print(arrays.get(i).get(j) + " ");
				}
				System.out.println();
			}
			/*
			 * Enter your code here. Read input from STDIN. Print output to
			 * STDOUT
			 */
		} finally {
			if (scanner != null)
				scanner.close();
		}
	}
}