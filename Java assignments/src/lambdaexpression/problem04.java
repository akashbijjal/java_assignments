package lambdaexpression;

import java.util.ArrayList;
import java.util.Collection;

import java.util.function.Predicate;

public class problem04 {
public static void main(String[] args) {
	Collection<String>l1=new ArrayList<String>();
	l1.add("akash");
	l1.add("durgaa");
	l1.add("oppo1");
	l1.add("pushpa");
	System.out.println("Original String---> "+l1);
	
	Predicate<String>p=s->s.length()%2==1;
	l1.removeIf(p);
	System.out.println(l1);
}
}
