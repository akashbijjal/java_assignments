package lambdaexpression;

import java.util.function.Consumer;

class movies
{
	String name;
	int year;
	public movies(String name,int year)
	{
		this.name=name;
		this.year=year;
	}
}





public class consumer {
public static void main(String[] args) {
	movies m=new movies("Doctor Strange", 2022);
	Consumer<movies> c=p->System.out.println(p.name+" "+p.year);
	c.accept(m);//Consumer contains accept method
}
}
