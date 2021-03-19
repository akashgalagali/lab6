package lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Medal {

	public static void main(String[] args) {
		HashMap<Integer,Integer> students=new HashMap<Integer,Integer>();
		HashMap<Integer,String> medalForStudents=new HashMap<Integer,String>();
		System.out.println("Enter Number of Students: ");
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int marks,id;
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the ID  ");
			id=sc.nextInt();
			System.out.println("Enter the Marks  ");
			marks=sc.nextInt();
			students.put(id,marks);
		}
		medalForStudents=studentsMedalList(students);
		for (Map.Entry<Integer,String> ele:medalForStudents.entrySet()) 
		{
			System.out.println(ele.getKey()+" : "+ele.getValue());
		}
	}
	public static HashMap<Integer,String> studentsMedalList(HashMap<Integer,Integer> hm){
		HashMap<Integer,String> stu= new HashMap<Integer,String>();
		for (Map.Entry<Integer, Integer> student:hm.entrySet()) {
			if(student.getValue()>=90 && student.getValue()<100) {
				stu.put(student.getKey(),"Gold");
			}
			else if(student.getValue()>=80 && student.getValue()<90) {
				stu.put(student.getKey(),"Silver");
			}
			else if(student.getValue()>=70 && student.getValue()<80) {
				stu.put(student.getKey(),"Bronze");
			}
			
		}
		return stu;
	}
}
