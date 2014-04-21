
public class heap_sort {

	static int[] heapify(int[] arr,int index,int start,int end){
		int left_child = -1,right_child = -1;
		//calc left child
		if((2*index + 1) <= end){
			left_child = arr[2*index + 1];
		}
		//calc right child
		if((2*index + 2) <= end){
			right_child = arr[2*index + 2];
		}
		
		if(left_child == -1 && right_child == -1){
			//if no child exists return the arr
			return arr;
		}
		else{
			int flag_left = -1;
			if(left_child >= right_child){
				flag_left = 1;
			}
			
			int max;
			if(flag_left == 1){
				max = left_child;
			}
			else{
				max = right_child;
			}
			int temp = 0;
			
			if(max <= arr[index]){
				return arr;
			}
			
			if(max > arr[index] && flag_left == 1){
				//swap root and left child
				temp = arr[index];
				arr[index] = max;
				arr[2*index+1] = temp;
				index = 2*index+1;
			}
			else if(max > arr[index] && flag_left == -1){
				//swap root and right child
				temp = arr[index];
				arr[index] = max;
				arr[2*index+2] = temp;
				index = 2*index+2;
			}
			arr = heapify(arr, index, start, end);
			return arr;
		}
	}
	
	static int[] build_heap(int[] arr,int start,int end){
		for(int i=end; i>=start; i--){
			arr = heapify(arr, i, start, end);
		}
		return arr;
	}
	
	static int[] hp_sort(int[] arr){
		arr = build_heap(arr, 0, arr.length-1);
		int max_index = arr.length - 1;
		int max_ele = 0;
		while(max_index >= 0){
			max_ele = arr[0];
			arr[0] = arr[max_index];
			arr[max_index] = max_ele;
			max_index--;
			arr = heapify(arr, 0, 0, max_index);
		}
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {90,10,25,20,20,80,15,85,35,30,5};
		arr = hp_sort(arr);
  		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}

}
