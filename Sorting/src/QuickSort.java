/**
 * 
 * @author Atul Wagare
 */
public class QuickSort {
	/**
	 * Perform sort recursively.
	 * @param A Array
	 * @param f first index
	 * @param l last index
	 */
	private static void quickSort(int A[], int f, int l) {
		if (f >= l)
			return;
		int pivot_index = partition(A, f, l);
		quickSort(A, f, pivot_index);
		quickSort(A, pivot_index + 1, l);
	}
	
	/**
	 * Swap elements present at given index.
	 * @param A
	 * @param x
	 * @param y
	 */
	public static void swap(int A[], int x, int y) {
		int temp = A[x];
		A[x] = A[y];
		A[y] = temp;
	}

	/**
	 * Partition logic
	 * @param A Array
	 * @param f first index
	 * @param l last index
	 * @return
	 */
	public static int partition(int A[], int f, int l) {
		int pivot = A[f];
		while (f < l) {
			while (A[f] < pivot)
				f++;
			while (A[l] > pivot)
				l--;
			swap(A, f, l);
		}
		return f;
	}
	
	public static void main(String[] args) {
		int arr[] = { 12, 8, 56, 5, 1, 20 };
		quickSort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
}
