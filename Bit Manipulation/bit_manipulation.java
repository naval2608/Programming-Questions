import java.util.ArrayList;


public class bit_manipulation {

	public void compare(int a,int b){
		int c = a-b;
		System.out.println(c+":"+Integer.toBinaryString(c));
		int x = c>>31 & 1; 
		System.out.println(x+":"+Integer.toBinaryString(x));
		System.out.println(a - x*(c));
	}
	
	public void hits(String a,String c){
		int hits = 0;
		char[] b = c.toCharArray(); 
		for(int i=0;i<a.length();i++){
			if(a.charAt(i) == b[i]){
				hits++;
				b[i] = '*';
			}
		}
		for(int i=0;i<b.length;i++){
			if(b[i] != '*'){
				
			}
		}
		System.out.println("hits:"+hits);
	}
	
	 public void copy_bits(int a, int b, int i,int j){
		 int l = ~0;
		 int m = 1;
		 System.out.println(l + ":" + Integer.toBinaryString(l));
		 System.out.println(m + ":" + Integer.toBinaryString(m));
		 m = 1<<(j+1);
		 System.out.println(m + ":" + Integer.toBinaryString(m));
		 m = m -1;
		 System.out.println(m + ":" + Integer.toBinaryString(m));
		 int left = l - m;
		 System.out.println(left + ":" + Integer.toBinaryString(left));
		 m = (1<<i) - 1;
		 System.out.println(m + ":" + Integer.toBinaryString(m));
		 int mask = left | m;
		 System.out.println(mask + ":" + Integer.toBinaryString(mask));
		 int val = (a & mask) | (b<<i);
		 System.out.println(val + ":" + Integer.toBinaryString(val));
	 }

	 public void binary_rep(String a){
		 int b = Integer.parseInt(a);
		 //System.out.println(Integer.toBinaryString(b));
		 String x="";
		 int r;
		 while(b > 0){
			 r = b%2;
			 System.out.println("r:"+r);
			 x = r + x;
			 System.out.println("x:"+x);
			 System.out.println(Integer.toBinaryString(b>>1));
			 b = b>>1;
		 }
		 System.out.println(x);
	 }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = Integer.parseInt("1010101011", 2);
		int j = Integer.parseInt("11111", 2);
		bit_manipulation l = new bit_manipulation();
		l.copy_bits(x, j, 2, 6);
		//l.binary_rep("100");
		//l.compare(10, -20);
		//l.compare(20, 10);
		//l.hits("NAVAL", "NAVLA");
	}

}
