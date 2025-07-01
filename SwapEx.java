package com.arrayex;

public class SwapEx {

	public static void main(String[] args) {
		int[] no= {10,22,44,34,76,56,87,47,26,98};
		
		System.out.println("Original Array:");
		for(int i=0;i<no.length;i++)
		{
			System.out.print(no[i]+" ");
		}
		System.out.println();
		
		//swap elements in pairs
		for(int i=0;i<no.length-1;i+=2)
		{
			int temp=no[i];
			no[i]=no[i+1];
			no[i+1]=temp;
		}
		
		//print array after swapping
		System.out.println("Array After swapping:");
		for(int i=0;i<no.length;i++)
		{
			System.out.print(no[i]+ " ");
		}

		System.out.println();
	}

}
