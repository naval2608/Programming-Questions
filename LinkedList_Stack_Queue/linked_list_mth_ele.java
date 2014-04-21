
public class linked_list_mth_ele extends linked_list {
	
	public void mid_ele(){
		Node cur = head;
		Node mid = head;
		while(cur != null){
			cur = cur.getNext();
			if(cur != null){
				cur = cur.getNext();
				mid = mid.getNext();
			}
		}
		System.out.println("Mid data:"+mid.getData());
	}
	
	public void last_nth_ele(int n){
		if(n<1){
			System.out.println("fuck u");
		}
		else{
			if(head == null){
				System.out.println("Empty");
			}
			int counter = 1;
			Node cur = head;
			Node nth = head;
			while(counter <= n){
				if(cur == null){
					System.out.println("less than n elements");
					return;
				}
				cur = cur.getNext();
				counter++;
			}
			while(cur != null){
				//System.out.println("data:"+cur.getData());
				cur = cur.getNext();
				nth = nth.getNext();
			}
			System.out.println("nth data:"+nth.getData());
		}
	}
	
	public linked_list sum(linked_list a, linked_list b){
		linked_list x = new linked_list();
		int sum = 0;
		int carry = 0;
		Node i = a.head;
		Node j = b.head;
		while(i != null && j != null){
			sum = i.getData() + j.getData() + carry;
			carry = sum/10;
			sum = sum%10 ;
			//new_ele = new Node(sum);
			x.insert(sum);
			i = i.getNext();
			j = j.getNext();
		}
		return x;
	}
	
	public static void main(String[] args) {
		linked_list_mth_ele l = new linked_list_mth_ele();
		l.insert(3);
		//l.delete(20);
		l.insert(1);
		l.insert(5);
		linked_list_mth_ele m = new linked_list_mth_ele();
		m.insert(5);
		m.insert(9);
		m.insert(2);
		//l.insert(90);
		//l.display();
		//l.delete(20);
		//l.display();
		//l.delete_duplicates_unsorted();
		l.display();
		m.display();
		//l.print_n_to_last(8);
		//l.mid_ele();
		//l.last_nth_ele(2);
		linked_list t = l.sum(l, m);
		t.display();
		
	}
}
