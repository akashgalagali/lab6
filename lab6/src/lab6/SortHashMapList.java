package lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SortHashMapList {
	public static void main(String[] args) {
		HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
		ArrayList<Integer> hmSorted=new ArrayList<Integer>();
		
		h.put(1, 102);
		h.put(2, 45);
		h.put(3, 22);
		h.put(4, 1032);
		h.put(5, 2);
	hmSorted=inputHashMapSort(h);
	System.out.println("After Sorting :");
	for (Integer ele: hmSorted) {
			System.out.println(ele);
	}
	}
public static ArrayList<Integer> inputHashMapSort(HashMap<Integer,Integer> hm){
	ArrayList<Integer> list = new ArrayList<Integer>(); 
     for(Map.Entry ele: hm.entrySet()) {
    	 int value=(int)ele.getValue();
    	 list.add(value);
     }
     Collections.sort(list);
	return list; 
}
}
