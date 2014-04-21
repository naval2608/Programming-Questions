class Node{
	int ele;
	Node next;
	
	public Node(int val){
		ele = val;
		next = null;
	}
	
	public int getData(){
		//System.out.println(ele);
		return ele;
	}
	
	public void setData(int val){
		this.ele = val;
	}
	
	public Node getNext(){
		return this.next;
	}
	
	public void setNext(Node x){
		this.next = x;
	}
	
}


public class linked_list {
	
	Node head;
	
	public void insert(int val){
		Node new_ele = new Node(val);
		if(head == null){
			head = new_ele;
		}
		else{
			Node cur = head;
			while(cur.getNext() != null){
				cur = cur.getNext();
			}
			cur.setNext(new_ele);
		}
	}
	
	public void display(){
		Node cur = head;
		if(cur == null){
			System.out.println("No ele");
		}
		else{
			while(cur != null){
				System.out.println("Display:"+cur.getData());
				cur = cur.getNext();
			}
		}
	}
	
	public void delete(int val){
		
		if(head == null){
			System.out.println("Empty");
		}
		else{
			if(head.getData() == val){
				head = head.getNext();
			}
			else{
				Node prev,cur;
				int flag = -1;
				cur = head.getNext();
				prev = head;
				while(cur != null){
					if(cur.getData() == val){
						prev.setNext(cur.getNext());
						flag = 1;
						System.out.println("Deleted:" + val);
						break;
					}
					else{
						prev = cur;
						cur = cur.getNext();
					}
				}
				if(flag == -1){
					System.out.println("Element not found");
				}
			}
		}
	}
	
	public void delete_duplicates_unsorted(){
		int count = 1;
		int val;
		Node cur = head.getNext();
		Node prev = head;
		while(cur != null){	
			val = cur.getData();
			int prev_counter = 1;
			count++;
			int del_flag = -1;
			Node iter = head;
			while(prev_counter < count){
				if(iter.getData() == val){
					del_flag = 1;
					break;
				}
				iter = iter.getNext();
				prev_counter++;
			}
			if(del_flag == 1){
				prev.setNext(cur.getNext());
				cur = cur.getNext();
				count--;
			}
			else{
				prev = cur;
				cur = cur.getNext();
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linked_list l = new linked_list();
		l.insert(10);
		l.insert(20);
		l.insert(10);
		l.insert(30);
		l.insert(20);
		l.insert(40);
		l.insert(20);
		l.display();
		//l.delete(20);
		//l.display();
		System.out.println("hello");
		l.delete_duplicates_unsorted();
		l.display();
	}

}
