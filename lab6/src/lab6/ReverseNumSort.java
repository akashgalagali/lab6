package lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class ReverseNumSort {

	public static void main(String[] args) {
		ArrayList<Integer> res=new ArrayList<Integer>();
		System.out.println("Enter the length of array: ");
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		
		System.out.println("Enter the elements:");
		int arr[]= new int[n];
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		
		res=getSorted(arr);
		System.out.println("Reversed integer Array after sorting :"+res);
	}
	
	
	
	public static ArrayList<Integer> getSorted(int[] arr){
		ArrayList<Integer> result= new ArrayList<Integer>();
		int[] reversed=new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			
			while(arr[i]!=0) {
				int digit = arr[i] % 10;
		        reversed[i] = reversed[i] * 10 + digit;
		        arr[i] /= 10;
			}
		}
		for (int i : reversed) {
			result.add(i);
		}
		Collections.sort(result);
		return result;
	}
}
