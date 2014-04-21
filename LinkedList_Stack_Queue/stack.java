public class stack {

	int a[];
	int Stack_size;
	int head;
	
	public stack(int size){
		this.Stack_size = size;
		this.a = new int[size];
		this.head = -1;
	}
	
	public void push(int val){
		if(head >= Stack_size - 1){
			System.out.println("Data cannot be inserted, it is full:" + val);
		}
		else{
			head++;
			a[head] = val;			
		}
	}
	
	public void display(){
		int cur = head;
		for(int i = cur; i>=0 ; i--){
			System.out.println("Ele:" + a[i]);
		}
	}
	
	public void pop(){
		if(head == -1){
			System.out.println("Empty Stack");
		}
		else{
			System.out.println("Pop:" + a[head]); 
			head--;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stack s = new stack(5);
		for(int i =1 ; i< 8; i++)
		{
			s.push(i*10);
			//s.push(20);
		}
		s.display();
		for(int i =1 ; i< 8; i++)
		{
			s.pop();
			//s.push(20);
		}
	}

}
