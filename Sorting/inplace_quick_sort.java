import javax.naming.PartialResultException;


public class inplace_quick_sort {

	public static int[] qc_srt(int[] arr,int start,int end){
		//partition to add in place the pivot element.
		if(start < end){
			int pivot_ele = arr[start];
			int pivot_index = start;
			int j;
			int temp;
			arr[start] = arr[end];
			arr[end] = pivot_ele;
			for(j=start;j<=end-1;j++){
				if(arr[j] <= pivot_ele){
					temp = arr[pivot_index];
					arr[pivot_index] = arr[j];
					arr[j] = temp;
					pivot_index++;
				}
			}
			//swap pivot element
			temp = arr[pivot_index];
			arr[pivot_index] = arr[end];
			arr[end] = temp;
			
			//call recursion
			arr = qc_srt(arr,start,pivot_index-1);
			arr = qc_srt(arr,pivot_index+1,end);
			return arr;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {60,50,40,35,10,2,5,9};
		arr = qc_srt(arr, 0, arr.length-1);
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}

}
