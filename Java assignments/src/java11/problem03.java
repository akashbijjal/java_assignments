package java11;

import java.util.ArrayList;
import java.util.Arrays;

public class problem03 {
public static void main(String[] args) {
	ArrayList<String> list=new ArrayList();
	list.add("A quick brown fox jumps over the lazy dog");
	System.out.println(list);
	
	
	System.out.println("******************");
	System.out.println("converted to Array");
	System.out.println("******************");
	String [] arr=list.toArray(String[]::new);
	System.out.println(Arrays.toString(arr));
	
	
}
}
