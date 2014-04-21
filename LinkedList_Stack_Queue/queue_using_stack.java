import java.util.Stack;


public class queue_using_stack {

	Stack<Integer> ins;
	Stack<Integer> del;
	
	public queue_using_stack() {
		// TODO Auto-generated constructor stub
		ins = new Stack<Integer>();
		del = new Stack<Integer>();
	}
	public void insert(int val){
		ins.push(val);
		System.out.println("inserted:"+val);
	}
	
	public void delete(){
		while(!ins.isEmpty()){
			del.push(ins.pop());
		}
		System.out.println("deleted"+del.pop());
		while(!del.isEmpty()){
			ins.push(del.pop());
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queue_using_stack l = new queue_using_stack();
		l.insert(10);
		l.insert(20);
		l.insert(30);
		l.delete();
		l.insert(40);
		l.delete();
	}

}
