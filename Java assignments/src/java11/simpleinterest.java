package java11;


interface interest
{
	int caluculate(int p,int r,int t);
}


public class simpleinterest {
public static void main(String[] args) {
	var p=10000;
	var r=10;
	var t=12;
	
	
	interest i=( p1, r1, t1)->(p1*r1*t1)/100;
	System.out.println(i.caluculate(p, r, t));
}
}
