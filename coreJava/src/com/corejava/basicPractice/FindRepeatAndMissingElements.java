package com.corejava.basicPractice;

public class FindRepeatAndMissingElements {
	
	public static void main(String[] args) {
		
        int arr[] = { 7, 3, 4, 5, 5, 6, 2 };
        int n = arr.length;
        printTwoElements(arr, n);
	}
	
	public static void printTwoElements(int[] arr,int n) {
		int i;
        System.out.print("The repeating element is ");
		for(i =0 ; i<n;i++) {
			
			int abs_val = Math.abs(arr[i]);
			if(arr[abs_val-1]> 0) {
				arr[abs_val - 1] = -arr[abs_val - 1];
			}else {
				System.out.println(abs_val);
			}
		}
		System.out.print("and the missing element is ");
        for (i = 0; i < n; i++) {
            if (arr[i] > 0)
                System.out.println(i + 1);
        }
	}
}
