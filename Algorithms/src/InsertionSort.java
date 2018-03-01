import java.util.Arrays;

public class InsertionSort {
	
	static int[] numbersToSort = {2,2,4,3,6,1};
	String order = "ascending";
	
	public static void main(String[] args) {
		insertionSort();
		System.out.println(Arrays.toString(numbersToSort));

	}
	
	public static int[] insertionSort() {
		
		for(int i=2; i < numbersToSort.length; i++) {
			//For this for loop I think two in the psuedocode is 1 
			//due to arrays starting with index 0
			for(int j=i; j>=1; j--) {
				if (numbersToSort[j] < numbersToSort[j-1]) {
					Helper.swap(j, j-1, numbersToSort);
				} else {
					break;
				}
			}		
			
		}

		return numbersToSort;
	}
	
	public int[] insertionSort(int[] numeros) {
		
		for(int i=2; i < numeros.length; i++) {
			//For this for loop I think two in the psuedocode is 1 
			//due to arrays starting with index 0
			for(int j=i; j>=1; j--) {
				if (numeros[j] < numeros[j-1]) {
					Helper.swap(j, j-1, numeros);
				} else {
					break;
				}
			}		
			
		}

		return numeros;
	}

}
