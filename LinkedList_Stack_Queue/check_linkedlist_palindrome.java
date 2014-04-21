import java.util.Stack;


public class check_linkedlist_palindrome extends linked_list{

	public boolean check_pal(){
		Node slow = head;
		Node fast = head;
		int count = 0;
		Stack<Integer> stck = new Stack<Integer>();
		stck.push(slow.getData());
		while(fast.getNext() != null){
			System.out.println("fasta:" + fast.getData());
			fast = fast.getNext();
			count++;
			if(fast.getNext() != null){
				System.out.println("fastb:" + fast.getData());
				fast = fast.getNext();
				slow = slow.getNext();
				System.out.println("slow:" + slow.getData());
				stck.push(slow.getData());
				count++;
				
			}
		}
		count++;
		System.out.println("count:" + count);
		if(count%2 != 0){
			stck.pop();
		}
		slow = slow.getNext();
		while(slow != null){
			if(slow.getData() != stck.pop()){
				return false;
			}
			slow = slow.getNext();
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check_linkedlist_palindrome l = new check_linkedlist_palindrome();
		l.insert(1);
		l.insert(2);
		l.insert(3);
		l.insert(3);
		l.insert(2);
		l.insert(1);
		System.out.println(l.check_pal());
		//l.display();
		
	}
}
