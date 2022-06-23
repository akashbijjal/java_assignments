package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Transaction01 {
Traders trade;
int year;
int value;
public Transaction01(Traders trade, int year, int value) {
	super();
	this.trade = trade;
	this.year = year;
	this.value = value;
}
public Traders getTrade() {
	return trade;
}
public void setTrade(Traders trade) {
	this.trade = trade;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public int getValue() {
	return value;
}
public void setValue(int value) {
	this.value = value;
}
@Override
public String toString() {
	return "Transaction [trade city=" + trade.city +", value=" + value + "]\n";
}
}
public class problem13 {
public static void main(String[] args) {
	List<Transaction01>list=new ArrayList<Transaction01>();
	list.add(new Transaction01(new Traders("apple","bengaluru"), 2011, 50000));
	list.add(new Transaction01(new Traders("samsung","indore"), 2010, 98000));
	list.add(new Transaction01(new Traders("idea","delhi"), 2015, 24586));
	list.add(new Transaction01(new Traders("adani","delhi"), 2017, 85555));
	
	List<Transaction01>list1=list.stream().filter(p->p.trade.city.equals("delhi")).collect(Collectors.toList());
	System.out.println(list1);
	
	
}
}
