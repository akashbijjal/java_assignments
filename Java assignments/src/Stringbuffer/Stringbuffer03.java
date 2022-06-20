package Stringbuffer;

public class Stringbuffer03 {
public static void main(String[] args) {
	StringBuffer sb=new StringBuffer();
	sb.append("This method returns the reversed object on which it was called");
	System.out.println(sb);
	System.out.println("******after reversed******");
	System.out.println(sb.reverse());
}
}
