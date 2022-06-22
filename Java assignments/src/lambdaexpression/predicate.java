package lambdaexpression;

import java.util.function.Predicate;

public class predicate {
public static void main(String[] args) {
	String s[]= {"Nag","chiranjjevi","venkatesh","ballaih","sunny","katrina"};
	Predicate<String>p=s1->s1.length()>5;
	for (String string : s) {
		if(p.test(string))
		{
			System.out.println(string);
		}
	}
}
}
