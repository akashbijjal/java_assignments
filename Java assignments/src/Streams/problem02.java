package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class problem02 {
public static void main(String[] args) {
	List<Fruit>list=new ArrayList<Fruit>();
	list.add(new Fruit("Apple", 55, 100, "Red"));
	list.add(new Fruit("banana", 105, 50, "yellow"));
	list.add(new Fruit("orange", 80, 20, "orange"));
	list.add(new Fruit("mango", 90, 35, "yellow"));
	list.add(new Fruit("watermelon", 200, 35, "green"));
	list.add(new Fruit("sapota", 25, 15, "brown"));
	list.add(new Fruit("StrawBerry", 68, 60, "Red"));
	
	
	List<Fruit>list1=list.stream().filter(p->p.color.equals("Red")).sorted((p1,p2)->(p1.price<p2.price)?-1:(p1.price>p2.price)?1:0).collect(Collectors.toList());
	System.out.println(list1);
	
}
}
