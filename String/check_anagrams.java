import java.util.HashMap;


public class check_anagrams {

	HashMap<Integer, Integer> hm;
	
	public check_anagrams(){
		hm = new HashMap<Integer, Integer>();
	}
	
	public boolean check(String x,String y){
		for(int i=0;i<x.length();i++){
			int val = x.charAt(i);
			if(hm.get(val) == null){
				hm.put(val, 1);
			}
			else{
				int v = hm.get(val);
				hm.put(val, ++v);
			}
		}
		//next string
		for(int i=0;i<y.length();i++){
			int val = x.charAt(i);
			if(hm.get(val) == null){
				return false;
			}
			else{
				int v = hm.get(val);
				hm.put(val, --v);
			}
		}
		//now check if all values in hashmap are 0
		for(int key:hm.keySet()){
			if(hm.get(key) != 0){
				return false;
			}
		}
		return true;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check_anagrams x = new check_anagrams();
		System.out.println(x.check("Naval", "lvan"));
	}

}
