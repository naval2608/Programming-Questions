import java.util.Stack;


public class sorted_stack extends Stack<Integer>{

	public Stack<Integer> sort(Stack<Integer> a){
		Stack<Integer> x = new Stack<Integer>();
		int val = -1;
		while(!a.isEmpty()){
			val = a.pop();
			while(!x.isEmpty() && x.peek() > val){
						a.push(x.pop());
			}
			x.push(val);
		}
		return x;
	}
	
	public void display(Stack<Integer> a){
		while(!a.isEmpty()){
			System.out.println("display:"+a.pop());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sorted_stack l = new sorted_stack();
		l.push(10);
		l.push(5);
		l.push(30);
		l.push(20);
		l.display(l.sort(l));
	}

}
