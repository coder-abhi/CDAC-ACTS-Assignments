package com.acts.problemSolving;

public class MaxAndSecondMax {
	public static String FindMaxSecondMax(int[] arr) {
//		int arr[] = {65,65,15,25,11,20,6,32};
		int max = arr[0];
		int secondMax = arr[0];
		if(arr[0]<arr[1]) {
			max = arr[1];
			secondMax = arr[0];
		} else {
			secondMax = arr[1];
			max = arr[0];
		}
		
		for(int i=1;i<arr.length;i++) {
			if(secondMax < arr[i]) {
				if(max < arr[i]) {
					secondMax = max;
					max = arr[i];
				} else {
					secondMax = arr[i];
				}
			}
		}
		
		return "Max : "+ max + "\tSecond Max : "+secondMax;
	}
	
}
