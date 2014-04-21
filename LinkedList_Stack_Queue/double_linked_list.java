class dl_Node{
	int ele;
	dl_Node prev;
	dl_Node next;
	
	public dl_Node() {
		// TODO Auto-generated constructor stub
	}
	
	public dl_Node(int val) {
		// TODO Auto-generated constructor stub
		this.ele = val;
		this.prev = null;
		this.next = null;
	}
	
	public int getData(){
		return ele;
	}
	
	public void setData(int x){
		this.ele = x;
	}
	
	public void setNext(dl_Node a){
		this.next = a;
	}
	
	public void setPrev(dl_Node a){
		this.prev = a;
	}
	
	public dl_Node getNext(){
		return this.next;
	}
	
	public dl_Node getPrev(){
		return this.prev;
	}
}

public class double_linked_list {

	dl_Node head;
	dl_Node tail;
	
	public void insert(int val){
		dl_Node new_ele = new dl_Node(val);
		if(head == null){
			head = new_ele;
			tail = new_ele;
		}
		else{
			dl_Node cur=head;
			while(cur.getNext() != null){
				cur = cur.getNext();
			}
			cur.setNext(new_ele);
			new_ele.setPrev(cur);
			tail = new_ele;
		}
	}
	
	public void display_from_head(){
		dl_Node cur = head;
		if(head == null){
			System.out.println("Empty");
		}
		while(cur != null){
			System.out.println("Display:"+cur.getData());
			cur = cur.getNext();
		}
	}
	
	public void display_from_tail(){
		dl_Node cur = tail;
		if(tail == null){
			System.out.println("Empty");
		}
		while(cur != null){
			System.out.println("Display reverse:"+cur.getData());
			cur = cur.getPrev();
		}
	}
	
	public void delete(int val){
		if(head == null){
			System.out.println("Empty, delete not possible");
		}
		else if(head.getData() == val){
			System.out.println("Deleted:"+head.getData());
			head = head.getNext();
			head.setPrev(null);
		}
		else{
			dl_Node cur=head;
			dl_Node prev=null;
			while(cur != null){
				if(cur.getData() == val){
					System.out.println("Deleted:"+val);
					break;
				}
				prev = cur;
				cur = cur.getNext();
			}
			if(cur != null){
				prev.setNext(cur.getNext());
				if(cur.getNext() != null){
					cur.getNext().setPrev(prev);
				}
				if(cur == tail){
					tail = prev; 
				}
			}
			else if(cur == null){
				System.out.println("Not found");
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double_linked_list l = new double_linked_list();
		l.insert(10);
		l.insert(20);
		l.insert(30);
		l.insert(40);
		l.display_from_head();
		//l.display_from_tail();
		l.delete(10);
		l.display_from_head();
		l.delete(30);
		l.display_from_head();
		l.delete(40);
		l.display_from_head();
		l.display_from_tail();
		l.insert(100);
		l.display_from_tail();
	}

}
