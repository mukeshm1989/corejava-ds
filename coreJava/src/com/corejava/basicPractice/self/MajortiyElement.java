package com.corejava.basicPractice.self;

public class MajortiyElement {
	
//	Input:
//	N = 3 
//	A[] = {1,2,3} 
//	Output:
//	-1
//	Explanation:
//	Since, each element in 
//	{1,2,3} appears only once so there 
//	is no majority element.
	
//	Input:
//	N = 5
//	A[] = {3,1,3,3,2} 
//	Output:
//	3
//	Explanation:
//	Since, 3 is present more 
//	than N/2 times, so it is  
//	the majority element.

	
	public static void main(String[] args) {
		
		int[] arr = {1,3,2};
		int result = 0;
		//System.out.print("Majority Element is : ");
		for(int i=0; i < arr.length; i++) {
			int abs_val  = Math.abs(arr[i]);
			if(arr[abs_val-1] > 0) {
				arr[abs_val-1] = -arr[abs_val-1];
			}else {
				result = abs_val;
			}
		}
		if(result<=0) {
			System.out.println("-1");
		}else {
			System.out.println(result);
		}
	}
}
