package Streams;

import java.util.ArrayList;
import java.util.List;

public class problem15 {
public static void main(String[] args) {
	List<Transaction>list=new ArrayList<Transaction>();
	list.add(new Transaction(new Traders("apple","bengaluru"), 2011, 50000));
	list.add(new Transaction(new Traders("samsung","indore"), 2010, 98000));
	list.add(new Transaction(new Traders("idea","delhi"), 2015, 24586));
	list.add(new Transaction(new Traders("adani","delhi"), 2017, 85555));
	
	Transaction t1=list.stream().min((x,y)->x.getValue()-y.getValue()).get();
	System.out.println(t1);
}
}
