public class Fibonacci {

	public int get_n_fibo(int n){
		if(n == 1){
			return 0;
		}
		else if(n==2){
			return 1;
		}
		else{
			return get_n_fibo(n-1) + get_n_fibo(n-2);
		}
	}
	
	public int dyn_get_n_fibo(int n){
		if(n == 1){
			return 0;
		}
		else if(n==2){
			return 1;
		}
		else{
			int n_1= 0;
			int n_2=1;
			int counter = 2;
			int z=0;
			while(counter < n){
				z = n_1 + n_2;
				n_1 = n_2;
				n_2 = z;
				counter++;
			}
			return z;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci x = new Fibonacci();
		for(int i=1;i<11;i++){
			System.out.print(x.get_n_fibo(i) + " ");
		}
		System.out.println();
		for(int i=1;i<11;i++){
			System.out.print(x.dyn_get_n_fibo(i) + " ");
		}
	}

}
