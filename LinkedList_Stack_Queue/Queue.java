
public class Queue {

	int frnt;
	int rear;
	int a[];
	int queue_size;
	
	public Queue(int size){
		this.queue_size = size;
		a = new int[size];
		frnt = 0;
		rear = -1;
	}
	
	public void insert(int val){
		if( rear >= queue_size - 1)
		{
			System.out.println("Data cannot be inserted, it is full:" + val);
		}
		else{
			rear++;
			a[rear] = val;	
		}
	}
	
	public void delete(){
		if(frnt > rear){
			System.out.println("Empty queue.");
		}
		else{
			System.out.println("Delete:" + a[frnt]);
			frnt++;
		}
	}
	
	public void display(){
		if(frnt > rear){
			System.out.println("Empty queue.");
		}
		else{
			for(int i=frnt; i<=rear;i++){
				System.out.println("Ele:" + a[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Queue s = new Queue(5);
				for(int i =1 ; i< 8; i++)
				{
					s.insert(i*10);
					//s.push(20);
				}
				s.display();
				for(int i =1 ; i< 8; i++)
				{
					s.delete();
					//s.push(20);
				}
	}

}
