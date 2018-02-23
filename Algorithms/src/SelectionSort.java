import java.util.Arrays;

public class SelectionSort {
	static int[] numbersToSort = {2,2,4,3,6,1};
	//just in case I want to add descending in the future
	//the string does nothing, it's a note to say it's ascending order
	String order = "ascending";
	
	public static void main(String args[]) {
		selectionSort();
		System.out.println(Arrays.toString(numbersToSort));
		
	}

	public static int[] selectionSort() {
		for (int i=0; i < numbersToSort.length; i++) {
			int j = i;
			int m = numbersToSort[i];
			
			for(int k=i+1; k < numbersToSort.length; k++) {
				if (numbersToSort[k] < m) {
					m = numbersToSort[k];
					j=k;
				}
				if(m< numbersToSort[i]) {
					swap(i, j, numbersToSort);
				}
			}
		}
		
		//I am iterating on a single array to save memory
		//(even though the java garbage collector will sort us out)
		return numbersToSort;
	}
	
	//array elements swapping method stolen from stackoverflow
	public static void swap(int i, int j, int[] arr) {
		   int t = arr[i];
		   arr[i] = arr[j];
		   arr[j] = t;
		}
	
}
