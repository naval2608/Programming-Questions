
public class circular_queue {

	int queue_size;
	int r;
	int f;
	int arr[];
	int count;
	
	public circular_queue(int s){
		this.queue_size = s;
		this.r = -1;
		this.f = 0;
		this.arr = new int[s];
		this.count = 0;
	}
	
	public void insert(int ele){
		if(count == queue_size){
			System.out.println("queue full");
		}
		else{
			r = (r+1)%queue_size;
			arr[r] = ele;
			count++;
		}
	}
	
	public void delete(){
		if(count == 0){
			System.out.println("queue empty");
		}
		else{
			System.out.println("Deleted"+ arr[f]);
			arr[f] = 0;
			f = (f+1)%queue_size;
			count--;
		}
	}
	
	public void display(){
		if(count == 0){
			System.out.println("display queue empty");
		}
		else{
			int cur = f;
			for(int i=1;i<=count;i++){
				System.out.println("Print:"+ arr[cur]);
				cur = (cur+1)%queue_size;
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circular_queue s = new circular_queue(5);
		for(int i =1 ; i< 8; i++)
		{
			s.insert(i*10);
			//s.push(20);
		}
		//s.display();
		s.delete();
		//s.display();
		s.insert(100);
		//s.display();
		s.delete();
		s.display();
		for(int i =1 ; i< 8; i++)
		{
			//s.delete();
			//s.push(20);
		}
	}

}
