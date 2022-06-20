package Stringbuilder;

public class Stringbuilder03 {
public static void main(String[] args) {
	StringBuilder sb=new StringBuilder();
	sb.append("This method returns the reversed object on which it was called");
	System.out.println(sb);
	System.out.println("******after reversed******");
	System.out.println(sb.reverse());
}
}
