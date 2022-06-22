package lambdaexpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class problem08 {
public static void main(String[] args) {
	List<Integer>list=new ArrayList<Integer>();
	list.add(5);
	list.add(8);
	list.add(2);
	list.add(7);
	list.add(3);
	list.add(9);
	
	Consumer<List<Integer>>c=s->System.out.println(s);
	c.accept(list);

	
}
}
