package lambdaexpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class problem06 {
public static void main(String[] args) {
	List<String>l1=new ArrayList<String>();
	l1.add("akash");
	l1.add("durgaa");
	l1.add("oppo1");
	l1.add("pushpa");
	System.out.println("Original String---> "+l1);
	
	UnaryOperator<String>u=s->s.replaceAll(s, s.toUpperCase());
	System.out.println("Modified String");
	System.out.println("***************");
	for (String string : l1) {
		
		System.out.println(u.apply(string));
	}
}
}
