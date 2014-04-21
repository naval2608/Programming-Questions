
public class print_2d_spiral {

	public void print(int a[][]){
		try{
			int rows = a.length;
			int cols = a[0].length;
						
			int layers = (rows/2);
			if(2*layers < rows)
				layers++;
			//System.out.print(layers);
			 
			for(int i=0;i<layers;i++){
				//print top
				for(int j=i;j<(cols-i);j++)
					System.out.print(a[i][j] + " ");
				//System.out.print("|");
				for(int j=i+1;j<(rows-i);j++)
					System.out.print(a[j][cols-i-1] + " ");
				//System.out.print("|");
				for(int j=cols-i-2;j>(i);j--)
					System.out.print(a[rows-i-1][j] + " ");
				//System.out.print("|");
				for(int j=rows-i-1;j>(i);j--)
					System.out.print(a[j][i] + " ");
				//System.out.print("|");
			}
		}
		catch(Exception e){
			System.out.print("Not possible");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[][]{ {1,  2,  3,  4},
		        {5,  6, 7,  8},
		        { 9,  10, 11, 12},
		        //{13, 14, 15, 16, 17, 18}
		    };
		
		int[][] b = new int[][]{ {1,  2,  3,  4,  5,  6},
	        {7,  8,  9,  10, 11, 12},
	        {13, 14, 15, 16, 17, 18},
	        {19, 20, 21, 22, 23, 24}
	    };
		int[][] c = new int[][]{};
		print_2d_spiral x = new print_2d_spiral();
		x.print(a);
	}

}
