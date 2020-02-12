package yayyy;

import java.util.Scanner;

public class SecondLargest {
	public static int seclarg(int[] arr) {
		int largest=arr[0];
		int seclargest=0;
		for(int i=0;i<arr.length;i++) {
			if(largest<arr[i])
			{
				largest=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(seclargest<arr[i] && arr[i]<largest)
			{
			 seclargest=arr[i];	
			}
		}
		return seclargest;
	}
	
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,5,6,4};
		System.out.print(seclarg(arr));
	}

		
		
	}
