
public class power_a_n {
	
	public int pow(int a,int n){
		if(n==1){
			System.out.println("basic");
			return a;
		}
		
		if(n%2 == 0){
			System.out.println("even");
			int t = pow(a,n/2);
			return t*t;
		}
		else{
			System.out.println("odd");
			int t = pow(a,(n-1)/2);
			return t*t*a;
		}
			
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		power_a_n x = new power_a_n();
		System.out.println(x.pow(2, 30));
	}

}
