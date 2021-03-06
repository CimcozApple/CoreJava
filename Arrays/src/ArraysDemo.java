//Using Arrays
public class ArraysDemo {

	public static void main(String[] args) {
		// int arr[] = { 10, 20, 30, 40, 50 };
		int arr[] = new int[5];
		arr[0] = 10;
		// Autoboxing automatically converts wrapper types into integer or
		// primitive types
		arr[1] = new Integer(20);
		// arr[2] = 30.54;
		arr[2] = 30;
		// Index out of bounds error
		// arr[7] = 70;
		System.out.println("Print using for loop");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\nPrint using for each loop");
		// the only disadvantage of foreach loop is that we can only go forward
		// in the array
		for (int element : arr) {
			System.out.print(element + " ");
		}
		System.out.println();
		System.out.println("Assignment: Print array backwards");
		// Assignment
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
	/*
	 * An array variable points to the first elements memory location .length
	 * gives the number of elements in an array
	 */
}
