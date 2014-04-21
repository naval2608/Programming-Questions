
public class merge_sort {

	/**
	 * @param args
	 */
	public int[] merge(int lwr[],int uppr[],int mid[]){
		int lwr_pointer = 0;
		int uppr_pointer = 0;
		int mid_pointer = 0;
		int srtd_arr[] = new int[lwr.length + uppr.length + mid.length];
		int index=-1;
		while(true)
		{
			if(lwr_pointer >= lwr.length && uppr_pointer >= uppr.length)
				break;
			else if(lwr_pointer == lwr.length && uppr_pointer < uppr.length){
				index++;
				srtd_arr[index] = uppr[uppr_pointer];
				uppr_pointer++;
			}
			else if(lwr_pointer < lwr.length && uppr_pointer == uppr.length){
				index++;
				srtd_arr[index] = lwr[lwr_pointer];
				lwr_pointer++;
			}
			else if((lwr_pointer < lwr.length && uppr_pointer < uppr.length){
				index++;
				if(lwr[lwr_pointer] <= uppr[uppr_pointer]){
					srtd_arr[index] = lwr[lwr_pointer];
					lwr_pointer++;
				}
				else if(uppr[uppr_pointer] <= lwr[lwr_pointer]){
					srtd_arr[index] = uppr[uppr_pointer];
					uppr_pointer++;
				}
			}
			
		}
	for(int i=0;i<srtd_arr.length;i++)
		System.out.print(srtd_arr[i]+":");
	System.out.println();
	return srtd_arr;	
	}
	
	public int[] mrg_sort(int arr[]){
		if(arr.length > 1){
			int start = 0;
			int end = arr.length - 1;
			int mid = (start+end)/2;
			int lwr[] = new int[mid-start+1];
			int upr[] = new int[end-mid];
			for(int i=start;i<=mid;i++){
				lwr[i] = arr[i];
			}
			for(int i=mid+1;i<=end;i++){
				upr[i-mid-1] = arr[i];
			}	
			lwr = mrg_sort(lwr);
			upr = mrg_sort(upr);
			return merge(lwr, upr); 
		}
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[5];
		for(int i=0;i<5;i++){
			a[i] = 4-i;
		}
		for(int i=0;i<a.length;i++)
			System.out.println("bfr sorting:"+a[i]);
		merge_sort x = new merge_sort();
		a = x.mrg_sort(a);
		for(int i=0;i<a.length;i++)
			System.out.println("After sorting:"+a[i]);
		
		
	}

}
