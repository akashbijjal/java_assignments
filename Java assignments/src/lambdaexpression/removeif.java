package lambdaexpression;

import java.util.ArrayList;
import java.util.List;

public class removeif {
public static void main(String[] args) {
	List<String>l1=new ArrayList<String>();
	l1.add("akash");
	l1.add("durgaa");
	l1.add("oppo1");
	l1.add("pushpa");
	System.out.println("Original String---> "+l1);
	
	l1.removeIf(i->(i.length()%2==1));
	System.out.println(l1);
}
}
