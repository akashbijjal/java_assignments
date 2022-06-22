package lambdaexpression;

import java.util.function.Function;

public class function {
public static void main(String[] args) {
	Function<Integer, Integer> f1=i->i*i;
	System.out.println(f1.apply(3));
	System.out.println(f1.apply(9));
}
}
