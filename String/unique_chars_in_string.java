import java.util.HashMap;

	
public class unique_chars_in_string {

	boolean[] arr;
	HashMap<Integer, Boolean> x;
	
	public unique_chars_in_string(){
		arr = new boolean[256];
		for(int i=0;i<256;i++){
			arr[i] = false;
		}
		x = new HashMap<Integer, Boolean>();
	}
	
	public boolean check_uniq(String s){
		for(int i=0;i<s.length();i++){
			int val = s.charAt(i);
			if(arr[val] == false){
				arr[val] = true;
			}
			else
				return false;
		}
		return true;
	}
	
	public boolean check_uniq_using_hash_map(String s){
		for(int i=0;i<s.length();i++){
			int val = s.charAt(i);
			if(x.get(val) == null)
				x.put(val, true);
			else if(x.get(val)){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		unique_chars_in_string s = new unique_chars_in_string();
		System.out.println(s.check_uniq("gupta"));
		System.out.println(s.check_uniq_using_hash_map("gutpa"));
		
	}

}
