
public class bitwise {

	public void inverse(int a){
		System.out.println(~a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0xFFFF;
		bitwise test = new bitwise();
		test.inverse(a);
		int bitmask = 0x000F;
        int val = 0x2222;
        // prints "2"
        System.out.println(val & bitmask);
	}

}
