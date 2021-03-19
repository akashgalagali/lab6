package lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class SecondSmallest {

	public static void main(String[] args) {
		SecondSmallest obj=new SecondSmallest();
		System.out.println("Enter the length of array: ");
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int res;
		System.out.println("Enter the elements:");
		int arr[]= new int[n];
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		res=obj.getSecondSmallest(arr);
		System.out.println("second smallest number :"+res);
		
	}
	public int getSecondSmallest(int[] a) {
		ArrayList<Integer> arr= new ArrayList<Integer>();
		for (Integer integer : a) {
			arr.add(integer);
		}
		Collections.sort(arr);
		return arr.get(1);
	}

}
