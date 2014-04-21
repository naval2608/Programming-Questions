
public class linked_list_n_to_last extends linked_list {
	
	public void print_n_to_last(int n){
		if(n<1){
			System.out.println("fuck u");
		}
		else{
			if(head == null){
				System.out.println("Empty");
			}
			int counter = 1;
			Node cur = head;
			while(counter < n){
				if(cur == null){
					System.out.println("less than n elements");
					return;
				}
				cur = cur.getNext();
				counter++;
			}
			while(cur != null){
				System.out.println("data:"+cur.getData());
				cur = cur.getNext();
			}
			//System.out.println("fuck u");
		}
	}
	
	public static void main(String[] args) {
		linked_list_n_to_last l = new linked_list_n_to_last();
		l.insert(10);
		l.delete(20);
		l.insert(20);
		l.insert(30);
		l.insert(40);
		l.insert(10);
		l.insert(20);
		//l.display();
		//l.delete(20);
		//l.display();
		//l.delete_duplicates_unsorted();
		//l.display();
		l.print_n_to_last(8);
	}
}
