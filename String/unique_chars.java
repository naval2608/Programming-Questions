import java.util.*;

public class unique_chars {

	//n2 complexity
	public void check_unique(String val){
		for(int i=0;i<val.length();i++){
			for(int y=i+1;y<val.length();y++){
				if(val.charAt(i) == val.charAt(y)){
					System.out.println("duplicate found:"+val.charAt(i));
					break;
				}
			}
		}
	}
	
	//order of n
	public boolean unique(String val){
		HashMap<Integer, Boolean> cmap = new HashMap<Integer, Boolean>();
		for(int i=0;i<val.length();i++){
			int ele = val.charAt(i);
			if(cmap.get(ele) != null && cmap.get(ele).equals(true)){
				return false;
			}
			else{
				cmap.put(ele, true);
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		unique_chars s = new unique_chars();
		s.check_unique("Naval");
		System.out.println(s.unique("Navl"));
		int x = 'a';
		System.out.println(x);
	}

}
