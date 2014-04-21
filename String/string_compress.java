
public class string_compress {

	public void compress(String x){
		char last = x.charAt(0);
		int count = 1;
		String y = "";
		for(int i=1;i<x.length();i++){
			if(x.charAt(i) == last){
				count++;
			}
			else{
				y = y + last + count;
				last = x.charAt(i);
				count = 1;
			}
		}
		y = y + last + count;
		System.out.println(y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		string_compress x = new string_compress();
		x.compress("abct");
	}

}
