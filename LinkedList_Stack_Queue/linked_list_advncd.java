public class linked_list_advncd extends linked_list {

	public void reverse(){
		if(head == null){
			System.out.println("Empty");
		}
		else{
			Node cur = null;
			Node temp;
			while(head != null){
				temp = head;
				head = head.getNext();
				temp.setNext(cur);
				cur = temp;
			}
			head = cur;
		}
	}
	
	public void insert_sorted(int val){
		Node new_ele = new Node(val);
		if(head == null){
			head = new_ele;
		}
		else if(head.getData() > val){
			new_ele.setNext(head);
			head = new_ele;
		}
		else{
			Node cur = head;
			Node prev = null;
			while(cur != null && cur.getData() < new_ele.getData()){
				prev = cur;
				cur = cur.getNext();
			}
			prev.setNext(new_ele);
			new_ele.setNext(cur);
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linked_list_advncd l = new linked_list_advncd();
		l.insert_sorted(20);
		//l.delete(50);
		l.insert_sorted(10);
		//l.display();
		l.insert_sorted(40);
		//l.display();
		l.insert_sorted(30);
		l.display();
		//l.delete(20);
		l.reverse();
		System.out.println("After reverse");
		l.display();
	}

}
