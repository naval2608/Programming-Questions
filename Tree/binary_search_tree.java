import java.util.*;
import java.util.Queue;

class tree_Node{
	int ele;
	tree_Node left;
	tree_Node right;
	
	public tree_Node() {
		// TODO Auto-generated constructor stub
	}
	
	public tree_Node(int val) {
		// TODO Auto-generated constructor stub
		this.ele = val;
		this.left = null;
		this.right = null;
	}
	
	public int getData(){
		return ele;
	}
	
	public void setData(int x){
		this.ele = x;
	}
	
	public void setleft(tree_Node a){
		this.left = a;
	}
	
	public void setRight(tree_Node a){
		this.right = a;
	}
	
	public tree_Node getLeft(){
		return this.left;
	}
	
	public tree_Node getRight(){
		return this.right;
	}
}

public class binary_search_tree extends tree_Node{

	tree_Node root;
	
	public void insert(int val){
		tree_Node new_ele = new tree_Node(val);
		if(root == null){
			root = new_ele;
		}
		else{
			tree_Node cur = root;
			tree_Node prev = null;
			while(cur != null){
				prev = cur;
				if(cur.getData() < val){
					cur = cur.right;
				}
				else if(cur.getData() > val){
					cur = cur.left;
				}
				else{
					System.out.println("Element already present");
				}
			}
			if(cur == null){
				if(prev.getData() < val){
					prev.setRight(new_ele);
				}
				else{
					prev.setleft(new_ele);
				}
			}
		}
	}

	public tree_Node search(int val, tree_Node head){
		if(head == null){
			System.out.println("Not found:"+val);
			return null;
		}
		else{
			if(head.getData() == val){
				System.out.println("Ele found:"+val);
				return head;
			}
			else if(head.getData() < val){
				return search(val, head.right);
			}
			else if(head.getData() > val){
				return search(val, head.left);
			}
		}
		return null;
	}
	
	public void display(tree_Node head){
		if(head == null){
			//System.out.println("Empty, cannot display");
		}
		/*else if(head != null && head.left == null && head.right == null){
			System.out.println("Ele:"+head.getData());
		}*/
		else{
			display(head.left);
			System.out.println("Ele:"+head.getData());
			display(head.right);
		}
	}
	
	public int height(tree_Node head){
		if(head == null){
			return -1;
		}
		else{
			int height_left = height(head.left);
			int height_right = height(head.right);
			return 1+(height_left > height_right?height_left:height_right);
		}
	}
	
	public tree_Node delete(int val, tree_Node cur){
		
		if(cur == null){
			System.out.println("not found,can't delete!");
		}
		else if(cur.getData() < val){
			cur.setRight(delete(val,cur.getRight()));
		}
		else if(cur.getData() > val){
			cur.setleft(delete(val,cur.getLeft()));
		}
		else if(cur.getData() == val){
			if(cur.getLeft() == null){
				System.out.println("no child directly delete!");
				//return null;
				return cur.getRight();
			}
			else if(cur.getRight() == null){
				System.out.println("only left child exists!");
				return cur.getLeft();
			}
			else{
				System.out.println("both child exists!");
				cur.setData(getrightmost(cur.left));
				cur.setleft(delete(cur.getData(),cur.getLeft()));
			}
		}
		return cur;
	}
	
	public int getrightmost(tree_Node cur){
		while(cur.getRight() != null){
			cur = cur.getRight();
		}
		return cur.getData();
	}
	
	public void Bfs(){
		Queue<tree_Node> x = new LinkedList<tree_Node>();
		tree_Node item;
		if(root != null){
			x.add(root);
			while(!x.isEmpty()){
				item = x.remove();
				System.out.print(item.getData()+ " ");
				if(item != null){
					if(item.left != null)
						x.add(item.left);
					if(item.right != null)
						x.add(item.right);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binary_search_tree l = new binary_search_tree();
		l.insert(6);
		l.insert(3);
		l.insert(9);
		l.insert(1);
		l.insert(0);
		l.insert(2);
		l.insert(8);
		l.insert(11);
		//l.display(l.root);
		//l.search(20,l.root);
		//l.search(60,l.root);
		System.out.println("height:"+l.height(l.root));
		//l.display(l.root);
		//l.delete(3);
		//l.display(l.root);
		System.out.println("height:"+l.height(l.root));
		l.Bfs();
		l.delete(6,l.root);
		l.Bfs();
	}

}
