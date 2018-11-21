/**
 * 
 * @author Atul Wagare
 */
public class MergeSort {
	private int[] arr;
	private int[] tempArr;
	private int length;

	public void sort(int arr[]) {
		this.arr = arr;
		this.length = arr.length;
		this.tempArr = new int[length];
		mergesort(0, length - 1);
	}

	private void mergesort(int lowIndex, int highIndex) {
		if (lowIndex < highIndex) {
			int middle = (lowIndex + highIndex) / 2;
			mergesort(lowIndex, middle);
			mergesort(middle + 1, highIndex);
			merge(lowIndex, middle, highIndex);
		}
	}

	private void merge(int lowIndex, int middle, int highIndex) {
		for (int i = lowIndex; i <= highIndex; i++) {
			tempArr[i] = arr[i];
		}
		int i = lowIndex;
		int j = middle + 1;
		int k = lowIndex;
		while (i <= middle && j <= highIndex) {
			if (tempArr[i] <= tempArr[j]) {
				arr[k] = tempArr[i];
				i++;
			} else {
				arr[k] = tempArr[j];
				j++;
			}
			k++;
		}
		while (i <= middle) {
			arr[k] = tempArr[i];
			k++;
			i++;
		}
	}
	
	public static void main(String a[]) {
		int[] arr = { 67, 89, 32, 76, 41, 99, 12, 05, 40, 53 };
		System.out.println("Array before sorting is ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		MergeSort mers = new MergeSort();
		mers.sort(arr);
		System.out.println("Array after sorting is ");
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
