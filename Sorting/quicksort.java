import java.util.ArrayList;


public class quicksort {

	public ArrayList<Integer> quick_sort(ArrayList<Integer> a){
		if(a.size() == 1){
			return a;
		}
		else{
			int pivot = (0+a.size())/2;
			ArrayList<Integer> left = new ArrayList<Integer>();
			ArrayList<Integer> right = new ArrayList<Integer>();
			
			int cur = a.get(pivot);
			for(int i=0;i<a.size();i++){
				if(i==pivot){
					continue;
				}
				else if(a.get(i) <= cur){
					left.add(a.get(i));
				}
				else if(a.get(i) > cur){
					right.add(a.get(i));
				}
			}
			ArrayList<Integer> e = new ArrayList<Integer>();
			e.addAll(quick_sort(left));
			e.add(cur);
			e.addAll(quick_sort(right));
			return e;
		}
		
	}

	public int[] quick_sort(int[] a){
		if(a.length == 1){
			return a;
		}
		else{
			int pivot_ele = a[(0+a.length)/2];
			
		}
		return null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> x = new ArrayList<Integer>();
		x.add(9);
		x.add(8);
		x.add(8);
		x.add(29);
		x.add(4);
		x.add(1);
		x.add(92);
		quicksort l = new quicksort();
		ArrayList<Integer> y = l.quick_sort(x);
		for(int i=0;i<y.size();i++){
			System.out.println(y.get(i));
		}
	}

}
