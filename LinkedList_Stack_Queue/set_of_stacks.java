import java.util.ArrayList;

public class set_of_stacks extends stack_using_linked_list {

	ArrayList<stack_using_linked_list> stacks; 
	int capacity;
	int last_stack;
	
	public set_of_stacks(int cap){
		stacks = new ArrayList<stack_using_linked_list>();
		capacity = cap;
		last_stack = 0;
	}
	
	public void stacks_push(int val){
		if(stacks.size() == 0){
			stack_using_linked_list new_stck = new stack_using_linked_list();
			new_stck.insert_front(val);
			System.out.println(val+" inserted at stack no:" + last_stack);
			stacks.add(new_stck);
		}
		else if(stacks.get(last_stack).top == capacity-1){
			stack_using_linked_list new_stck = new stack_using_linked_list();
			new_stck.insert_front(val);
			stacks.add(new_stck);
			last_stack++;
			System.out.println(val+" inserted at stack no:" + last_stack);
		}
		else if(stacks.get(last_stack).top < capacity){
				stacks.get(last_stack).insert_front(val);
				System.out.println(val+" inserted at stack no:" + last_stack);
		}
		
	}
	
	public void stacks_pop(){
		if((stacks.size() == 0) || (last_stack == 0 && stacks.get(last_stack).isEmpty())){
			System.out.println("Empty");
		}
		else if(!stacks.get(last_stack).isEmpty()){
				stacks.get(last_stack).delete_front();
		}
		else{
			stacks.remove(last_stack);
			last_stack--;
			stacks.get(last_stack).delete_front();
		}
	}
	
	public void stacks_popat(int index){
		stack_using_linked_list l = stacks.get(index);
		l.delete_front();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		set_of_stacks l = new set_of_stacks(2);
		l.stacks_pop();
		l.stacks_push(10);
		l.stacks_push(20);
		l.stacks_push(30);
		l.stacks_push(40);
		l.stacks_pop();
		l.stacks_push(50);
		l.stacks_push(60);
		l.stacks_push(70);
		l.stacks_push(80);
		l.stacks_pop();
		l.stacks_pop();
		l.stacks_pop();
		l.stacks_popat(0);
		l.stacks_pop();
		l.stacks_pop();
		l.stacks_pop();
		l.stacks_pop();
		l.stacks_pop();
		l.stacks_pop();
	}

}
