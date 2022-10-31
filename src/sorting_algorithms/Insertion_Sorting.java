package sorting_algorithms;

public class Insertion_Sorting {

	public static void main(String[] args) {
		ArrayInput ai=new ArrayInput();
		int[] arr=ai.input();
		
		//Insertion Sorting
		for(int i=1;i<arr.length;i++) {
			int current=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>current) {
				
				//moving index
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=current;
		}
		
		printArray pa=new printArray(arr);
	}

}
