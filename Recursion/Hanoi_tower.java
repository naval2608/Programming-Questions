import java.util.Stack;


public class Hanoi_tower {

	Stack<Integer> a,b,c;
	
	public Hanoi_tower(int val){
		a = new Stack<Integer>();
		b = new Stack<Integer>();
		c = new Stack<Integer>();
		for(int i=val;i>=0;i--){
			a.push(i);
		}
	}
	
	
	public void transfer(int val,Stack<Integer> src,
			Stack<Integer> destination,Stack<Integer> temp){
		if(val>0){
			transfer(val-1,src,temp,destination);
			int ele = src.pop();
			destination.push(ele);
			transfer(val-1,temp,destination,src);
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hanoi_tower h = new Hanoi_tower(5);
		h.transfer(6, h.a, h.b, h.c);
		while(!h.b.isEmpty()){
			System.out.println(h.b.pop());
		}
	}

}
