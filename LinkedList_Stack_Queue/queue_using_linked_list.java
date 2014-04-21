
public class queue_using_linked_list extends linked_list{

	public void insert_at_rear(int val){
		insert(val);
	}
	
	public void delete_at_front(){
		if(head == null){
			System.out.println("empty");
		}
		else{
			System.out.println("deleted:"+head.getData());
			head = head.getNext();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queue_using_linked_list l = new queue_using_linked_list();
		l.insert_at_rear(10);
		l.insert_at_rear(20);
		l.display();
		l.delete_at_front();
		l.delete_at_front();
		
	}

}
