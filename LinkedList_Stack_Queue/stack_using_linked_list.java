
public class stack_using_linked_list extends linked_list{

	int top = -1;
	
	public stack_using_linked_list(){
		top = -1;
	}
	
	public void insert_front(int val){
		Node new_ele = new Node(val);
		if(head == null){
			head = new_ele;
			
		}
		else{
			new_ele.setNext(head);
			head = new_ele;
			
		}
		top++;
	}
	
	public void delete_front(){
		if(head == null){
			System.out.println("empty");
		}
		else{
			System.out.println("Deleted:"+head.getData());
			head = head.getNext();
			top--;
		}
	}
	
	public boolean isEmpty()
	{
		return top == -1?true:false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stack_using_linked_list l = new stack_using_linked_list();
		l.insert_front(10);
		l.insert_front(20);
		l.display();
		l.delete_front();
		l.delete_front();
		l.delete_front();
		
	}

}
