package demo4;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		int[] arr= new int[] {5,7,2,9,4,0,5,7};
		System.out.println(Arrays.toString(arr));
		BubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void BubbleSort(int[] arr) {
		for (int i=0;i<arr.length-1;i++) {
			for (int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
		}
		
	}
}
