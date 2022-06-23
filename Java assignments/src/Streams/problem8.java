package Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class problem8 {
public static void main(String[] args) {
	List<Transaction>list=new ArrayList<Transaction>();
	list.add(new Transaction(new Traders("apple","bengaluru"), 2011, 50000));
	list.add(new Transaction(new Traders("samsung","indore"), 2010, 98000));
	list.add(new Transaction(new Traders("idea","delhi"), 2015, 24586));
	
	List<Transaction>list1=list.stream().filter(p->p.year==2011).sorted(Comparator.comparingInt(Transaction::getValue))
			         .collect(Collectors.toList());
	
	System.out.println(list1);
}
}
