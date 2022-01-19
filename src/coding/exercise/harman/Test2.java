package coding.exercise.harman;

public class Test2 {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		int n = arr.length;
		int result = binarySearch(arr,0,n-1,9);
		
		if(result == -1) {
			System.out.println("Not Found");
		}
		else {
			System.out.println("Found at " + result);
		}

	}
	public static int binarySearch(int arr[],int left,int right, int searchItem) {
		
		int index = -1;
		if( right >= left) {
			
			int mid = (left + right)/2;
			
			if(arr[mid] == searchItem) {
				return mid;
			}
			else if(arr[mid] > searchItem) {
				return binarySearch(arr,left,mid -1, searchItem);
			}
			else {
				return binarySearch(arr,mid+1,right, searchItem);
			}	
		}
		return index;
	}

}
