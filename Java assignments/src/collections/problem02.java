package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class problem02 {
public static void main(String[] args) {
	TreeSet<String>h1=new TreeSet<String>();
	h1.add("product01");
	h1.add("product02");
	h1.add("product03");
	h1.add("product04");
	h1.add("product05");
	h1.add("product06");
	h1.add("product07");
	h1.add("product08");
	h1.add("product09");
	h1.add("product09");
//	System.out.println(h1);
//	for (String string : h1) {
//		System.out.println(string);
//	}
//	
	
	Iterator itr=h1.iterator();
	while(itr.hasNext())
	{
		String s=(String)itr.next();
		System.out.println(s);
	}
}
}
