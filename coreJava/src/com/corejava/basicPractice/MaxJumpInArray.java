package com.corejava.basicPractice;

public class MaxJumpInArray {
	public static void main(String[] args) {
		//int arr[] = {0, 10, 20}; //n = 11
		int[] arr ={1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		int n = arr.length;
		int jump = 0;
		int count =0;
		
		for(int i=jump;i<n;i=jump) {
			if(arr[jump] == 0) {
				System.out.println(-1);
				return;
			}
			if(jump<n) {
				jump+=arr[jump];
				n= n-jump;
				count++;
			}
		}
		System.out.println(count);
	}

}
