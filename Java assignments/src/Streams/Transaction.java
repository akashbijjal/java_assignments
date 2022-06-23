package Streams;

public class Transaction {
Traders trade;
int year;
int value;
public Transaction(Traders trade, int year, int value) {
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
	return "Transaction [trade=" + trade + ", year=" + year + ", value=" + value + "]";
}
}
