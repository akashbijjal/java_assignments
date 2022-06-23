package Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class problem10 {
public static void main(String[] args) {
	List<Traders>list=new ArrayList<Traders>();
	list.add(new Traders("apple","bengaluru"));
	list.add(new Traders("samsung","indore"));
	list.add(new Traders("Airtel","bengaluru"));
	list.add(new Traders("idea","delhi"));
	list.add(new Traders("tesla","chennai"));
	list.add(new Traders("reliance","mumbai"));
	list.add(new Traders("jio","pune"));
	list.add(new Traders("aakash","pune"));
	
	
	List<Traders>list1=list.stream().filter(s->s.city.equals("pune")).sorted(Comparator.comparing(Traders::getName)).collect(Collectors.toList());
	System.out.println(list1);
	
	
}
}
