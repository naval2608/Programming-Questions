
public class array_to_bst extends binary_search_tree{
	
	public void create_tree(int[] x,int start,int end){
		if(start <= end){
			int mid = (start+end)/2;
			insert(x[mid]);
			create_tree(x,start,mid-1);
			create_tree(x,mid+1,end);
		}
	}
		
	public boolean covers(int val, tree_Node head){
		if(head == null){
			return false;
		}
		else if(head.getData() == val){
			System.out.println("Ele found:"+val);
			return true;
		}
		else{
			return covers(val, head.left) || covers(val, head.right);
		}
		
	}
	
	public tree_Node common_ansc(int x,int y,tree_Node cur){
		boolean x_on_left = covers(x, cur.left);
		boolean y_on_left = covers(y, cur.left);
		
		if( x_on_left && y_on_left){
			return common_ansc(x, y, cur.left);
		}
		else if(x_on_left != y_on_left){
			return cur;
		}
		else if( !x_on_left && !y_on_left){
			return common_ansc(x, y, cur.right);
		}
		return null;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {1,4,6,7,9,10,45,67};
		array_to_bst l = new array_to_bst();
		l.create_tree(x, 0, x.length-1);
		l.Bfs();
		System.out.println(l.common_ansc(9, 67, l.root).getData());
	}

}
