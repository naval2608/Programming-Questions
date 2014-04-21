
public class swap {

	public void swap(int a,int b){
		System.out.println("a:"+a+" b:"+b);
		a = b-a;
		b = b-a;
		a = a+b;
		System.out.println("a:"+a+" b:"+b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swap l = new swap();
		l.swap(10, 20);
	}

}
