package lab6;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class VotingValidation {

	public static void main(String[] args) {
		HashMap<Integer,Integer> people=new HashMap<Integer,Integer>();
		ArrayList<Integer> valid=new ArrayList<Integer>();
		System.out.println("Enter Number of people: ");
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int age,id;
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the ID  ");
			id=sc.nextInt();
			System.out.println("Enter the age  ");
			age=sc.nextInt();
			people.put(id,age);
		}
		valid=votersList(people);
		System.out.println("Valid voters are with ID:"+valid);
	}
	public static ArrayList<Integer> votersList(HashMap<Integer,Integer> hm){
		ArrayList<Integer> validVoters= new ArrayList<Integer>();
		for (Map.Entry<Integer, Integer> person:hm.entrySet()) {
			if(person.getValue()>=18) {
				validVoters.add(person.getKey());
			}
			
		}
		return validVoters;
	}
}
