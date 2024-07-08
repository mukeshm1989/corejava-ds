package com.corejava.basicPractice;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MajorityOfElement {
	// wrong solution
	public static void main(String[] args) {
		int arr[] = {3,1,3,3,2,2};
		
		Arrays.stream(arr).boxed().collect(Collectors.groupingBy(x->x,Collectors.counting())).forEach(
				(k,v)->{
					if(v>1) {
						System.out.println(k);
					}
				});
		//System.out.println(-1);
	}

}
