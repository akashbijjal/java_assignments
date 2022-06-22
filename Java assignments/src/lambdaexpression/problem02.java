package lambdaexpression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class order{
	int id;
	String name;
	int price;
	String status;
	public order(int id,String name,int price,String status)
	{
		this.id=id;
		this.name=name;
		this.price=price;
		this.status=status;
	}
}






public class problem02 {
public static void main(String[] args) {
	List<order> l1=new ArrayList<>();
	l1.add(new order(01,"iphone 6",6000,"COMPLETED"));
	l1.add(new order(02,"iphone 7",11000,"ACCEPTED"));
	l1.add(new order(03,"iphone 8",9000,"SHIPPED"));
	l1.add(new order(04,"iphone XR",15000,"COMPLETED"));
	l1.add(new order(05,"iphone 11",18000,"CART"));
	
	Stream<order> data=l1.stream().filter(p->p.price>10000 && ((p.status.equals("ACCEPTED")) || (p.status.equals("COMPLETED"))));
	data.forEach(order->System.out.println(order.name+" : "+order.price+" : "+order.status));
}
}
