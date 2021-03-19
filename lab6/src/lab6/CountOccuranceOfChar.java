package lab6;
import java.util.*;

public class CountOccuranceOfChar {

	public static void main(String[] args) {
		HashMap<Character,Integer> countOcc=new HashMap<Character,Integer>();
		String str = "aaaabbbsshhhkjoo"; 
       char[] ch = str.toCharArray();
       countOcc=countChar(ch);
       for (Map.Entry<Character, Integer> c : countOcc.entrySet()){
		System.out.print(c.getKey()+""+c.getValue());
	}
	}
public static HashMap<Character,Integer> countChar(char[] ch){
	HashMap<Character,Integer> count=new HashMap<Character,Integer>();
	for (char c : ch) { 
        if (count.containsKey(c)) { 
            count.put(c, count.get(c) + 1); 
        } 
        else { 
            count.put(c, 1); 
        } 
    } 
	return count;
	}
}
