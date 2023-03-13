package gslc1_1;

import java.util.Arrays;

public class RemoveDups1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5, 1, 2, 3, 6, 7, 8, 9, 9};
		int[] arrWithoutDups = removeDups(arr);
		System.out.println("Original array: " + Arrays.toString(arr));
		System.out.println("Array without duplicates: " + Arrays.toString(arrWithoutDups));
	}
	
	public static int[] removeDups(int[] arr) {
		int[] temp = new int[arr.length];
		int index = 0;
		for(int i=0; i<arr.length; i++) {
			boolean isDuplicate = false;
			for(int j=0; j<index; j++) {
				if(arr[i] == temp[j]) {
					isDuplicate = true;
					break;
				}
			}
			if(!isDuplicate) {
				temp[index] = arr[i];
				index++;
			}
		}
		int[] result = new int[index];
		for(int i=0; i<index; i++) {
			result[i] = temp[i];
		}
		return result;
	}
}
