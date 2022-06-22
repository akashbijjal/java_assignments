package lambdaexpression;

interface math{
	int calculate(int a,int b);
	
}


public class problem01 {
public static void main(String[] args) {
	
	math s=(int x,int y)->x+y;
	math s1=(int x1,int x2)->x1-x2;
	math s3=(int x,int y)->x*y;
	math s4=(int x,int y)->x/y;
	
	
	
	
	
	System.out.println("Addition---> "+s.calculate(5, 10));
	System.out.println("Substraction-----> "+s1.calculate(9, 6));
	System.out.println("Multiplication------> "+s3.calculate(5, 5));
	System.out.println("Division------> "+s4.calculate(8, 4));
}
}
