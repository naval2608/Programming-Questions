
public class create_anagram {

	public static void permutation(String str) { 
	    permutation("", str); 
	}

	private static void permutation(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) System.out.println(prefix);
	    else {
	        for (int i = 0; i < n; i++){
	        	//System.out.println("calling:" +prefix+  str.charAt(i) + ","+str.substring(0, i) + str.substring(i+1, n));
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	        }
	    }
	}
	
	public static void main(String[] args){
		String x = "1231";
		permutation("",x);
	}
	
}
