import java.util.HashMap;
import java.util.Map;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class hits_psuedohits {

	protected static void displayHits_PsuedoHits(char[] solution, char[] guess) {
        Map<Integer, Character> solutionMap = new HashMap<Integer, Character>();
        for (int i = 0; i < solution.length; i++) {
            solutionMap.put(i, solution[i]);
        }
        int hits = 0, pseudoHits = 0;
        for (int i = 0; i < guess.length; i++) {
            if (guess[i] == solution[i]) {
                hits++;
                //continue;
                //solutionMap.put(i, 'X');
            }
            else if (solutionMap.containsValue(guess[i])) {
                pseudoHits++;
            }
        }

        System.out.println("Hits: " + hits);
        System.out.println("pseudoHits: " + pseudoHits);
    	}
	
	public static void max_sum(int[] a){
		int cur_sum =0;
		int prev_sum = 0 ;
		for(int i =0;i<a.length;i++){
			cur_sum += a[i];
			if(prev_sum < cur_sum){
				prev_sum = cur_sum;
			}
			else if(cur_sum < 0){
				cur_sum = 0;
			}
		}
		System.out.println("max sum"+prev_sum);
	}
	
	public static void main(String[] args) {
        char[] solution = new char[] { 'B', 'R', 'R', 'B' };
        char[] guess = new char[] { 'R', 'R', 'R', 'B' };
        //displayHits_PsuedoHits(solution, guess);
        int[] x = {2,-8,3,-2,4,-10};
        max_sum(x);
    }

}
