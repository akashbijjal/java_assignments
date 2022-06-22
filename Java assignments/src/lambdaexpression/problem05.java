package lambdaexpression;

import java.util.function.Consumer;

public class problem05 {
	public static StringBuilder sb=new StringBuilder();
	
	
	public static String processWords(String input)
	{
		String s[]=input.split("(\\s)+");
		for(String values:s)
		{
			sb.append(values.charAt(0));
		}
		return sb.toString();
	}
public static void main(String[] args) {

	String input="i am groot";
	Consumer<String>c=c1->System.out.println(processWords(input));
	c.accept(input);

}
}
