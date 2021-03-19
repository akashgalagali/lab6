package lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class ReturnSquare {

	public static void main(String[] args) {
		ReturnSquare obj=new ReturnSquare();
		HashMap<Integer,Integer> res=new HashMap<Integer,Integer>();
		System.out.println("Enter the length of array: ");
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		System.out.println("Enter the elements:");
		int arr[]= new int[n];
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		
		
		res=obj.square(arr);
		for (Map.Entry<Integer,Integer> ele:res.entrySet()) 
		{
			System.out.println(ele.getKey()+" = "+ele.getValue());
		}
	}

	
	public HashMap<Integer,Integer> square(int a[]){
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for (int i : a) {
			hm.put(i, i*i);
		}
		return hm;
	}
}
