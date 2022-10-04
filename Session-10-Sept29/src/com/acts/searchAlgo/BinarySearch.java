package com.acts.searchAlgo;

public class BinarySearch {
	public static int searchRecursive(int[] arr,int low,int high,int num) {
		if(high >= low) {
			int mid = (low+high)/2;
			System.out.print("\tMid : "+mid);
			if(arr[mid] == num) return mid;
			if(arr[mid] > num) {
				return searchRecursive(arr, low, mid-1, num);
			} 
			return searchRecursive(arr, mid+1, high, num);
			
		}
		return -1;
	}
	
	public static int searchIterative(int[] arr,int low, int high, int num) {
		while(high > low) {
			int mid = (high+low)/2;
			if(arr[mid] < num) {
				low = mid+1;
			} else {
				high = mid-1;
			}
		}
		System.out.println("High : "+high+"Low : "+low);
		if(arr[low] == num) return low;
		else if (arr[high] == num) return high;
		return -1;
	}
}
