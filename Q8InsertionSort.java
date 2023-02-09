package org.zoho;
import java.util.Arrays;

public class Q8InsertionSort {

	public static void main(String[] args) {
		int[]arr= {5,8,2,4,3,9};
		InsertionSort(arr);
	}
	public static void InsertionSort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			for(int j=i;j>0;j--) {
				if(arr[i]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
				else
					break;
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
		
		
