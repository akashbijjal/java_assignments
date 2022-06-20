package Stringbuilder;

public class Stringbuilder02 {
public static void main(String[] args) {
	
	
	
	StringBuilder sb=new StringBuilder();
	sb.append("it is used to_at the specified inde position");
	
	System.out.println(sb);
	System.out.println("after replacing");
	System.out.println("________________");
	System.out.println(sb.replace(13, 14, " insert text "));
	
}
}
