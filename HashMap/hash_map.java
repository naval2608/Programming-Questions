class Node{
	int key;
	int val;
	
	public Node(int key,int val){
		this.key = key;
		this.val = val;
	}
	
	public int getkey(){
		return key;
	}
	
	public int getval(){
		return val;
	}
	
}


public class hash_map {

	private final static int size = 100; 
	Node[] nodes;
	
	public hash_map(){
		nodes = new Node[size];
		for(int i=0;i<size;i++)
			nodes[i] = null;
	}
	
	public int get(int key){
		int hash = key%size;
		while(nodes[hash] != null && nodes[hash].getkey() != key){
			hash = (hash+1)%size;
		}
		if(nodes[hash] == null){
			System.out.println(-1);
			return -1;
		}
		else{
			System.out.println("hello" + nodes[hash].getval());
			return nodes[hash].getval();
		}
	}
	
	public void set(int key,int val){
		int hash = key%size;
		while(nodes[hash] != null && nodes[hash].getkey() != key){
			hash = (hash+1)%size;
		}
		nodes[hash] = new Node(key, val);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hash_map x = new hash_map();
		x.set(50, 999);
		x.set(150, 888);
		x.get(40);
		x.get(50);
		x.get(150);
	}

}
