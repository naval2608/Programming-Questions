import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class s {
	public HashMap<String, Integer> x = new HashMap<String, Integer>();

	public void add_hash(String key) {
		if (x.containsKey(key)) {
			int val = x.get(key);
			x.put(key, ++val);
		} else {
			x.put(key, 1);
		}
	}
	
	public void sort() {
		ArrayList<Map.Entry<String, Integer>> l = new ArrayList(x.entrySet());
		Collections.sort(l, new Comparator<Map.Entry<String, Integer>>() {

			public int compare(Map.Entry<String, Integer> o1,
					Map.Entry<String, Integer> o2) {
				return (o1.getKey().compareTo(o2.getKey()));
			}
		});
		sortValue(l);
		/*for (Map.Entry<String, Integer> m : l) {
			System.out.println(m.getKey() + ":" + m.getValue());
		}*/

	}

	public void sortValue(ArrayList<Map.Entry<String, Integer>> l) {
		Collections.sort(l, new Comparator<Map.Entry<String, Integer>>() {

			public int compare(Map.Entry<String, Integer> o1,
					Map.Entry<String, Integer> o2) {
				return -1 * (o1.getValue().compareTo(o2.getValue()));
			}
		});

		for (Map.Entry<String, Integer> m : l) {
			System.out.println(m.getKey() + ":" + m.getValue());
		}

	}

	public static void main(String args[]) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */

		s x = new s();
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			while (scanner.hasNextLine()) {
				String str = scanner.nextLine();
				x.add_hash(str);
				// System.out.println(str);
			}
		} finally {
			if (scanner != null)
				scanner.close();
			x.sort();
		}
	}
}