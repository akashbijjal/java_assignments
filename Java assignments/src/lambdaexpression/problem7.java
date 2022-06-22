package lambdaexpression;

import java.util.LinkedHashMap;
import java.util.Map;

public class problem7 {
public static void main(String[] args) {
	LinkedHashMap<Integer, String> l1=new LinkedHashMap<>();
	l1.put(1, "abc");
	l1.put(2, "aop");
	l1.put(3, "dcv");
	

	StringBuilder sb=new StringBuilder();
	 for (Map.Entry<Integer,String> entry : l1.entrySet())
	 {
		 sb.append(entry);
		 
	 }
	 System.out.println(sb);
	
	
	
}
}
