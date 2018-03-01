
public class Heap {

	public MinHeapElement[] heap;
	public MinHeapElement[] madeHeap;
	public int heapSize = heap.length;
	public InsertionSort insertDaTing;
	
	//make heap by sorting array in ascending order parent nodes
	
	public void makeHeap() {
		int[] firstArray = null;
		//creates array of all the leaves
		for (int i=0; i<heapSize; i++) {
			int x = heap[i].first();
			firstArray[i] = x;
		}
		//sorts the head
		int [] sortedFirsts = insertDaTing.insertionSort(firstArray);
	}
	
	
	
}
