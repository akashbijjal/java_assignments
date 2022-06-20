package generics;

import java.util.ArrayList;
import java.util.Collections;

public class problem3 {
public static void main(String[] args) {
	ArrayList<String> arr=new ArrayList<>();
	arr.add("Item 1");
	arr.add("Item 2");
	arr.add("Item 3");
	arr.add("Item 4");
	arr.add("Item 5");
	System.out.println("Before swapping");
	System.out.println(arr);
	
	
	Collections.swap(arr, 2, 3);
	System.out.println("Afer swapping");
	System.out.println(arr);
}
}
