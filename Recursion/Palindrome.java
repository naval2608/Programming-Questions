
public class Palindrome {

	public int reverse_no(int n){
		int rev = 0;
		while(n != 0){
			rev = rev*10 + n%10;
			n = n/10;
		}
		return rev;
	}
	
	public int check_pal(int n){
		return n == reverse_no(n)?1:0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome p =new Palindrome();
		System.out.println(p.check_pal(13331));
		System.out.println(p.check_pal(1));
	}

}
