package string;

public class Stringclass03 {
public static void main(String[] args) {
	String str="Java String pool refers to collection of Strings which are stored in heap memory";
	System.out.println("a)Lower case : "+str.toLowerCase());
	System.out.println("b)Upper case : "+str.toUpperCase());
	
	
	System.out.println("c)Replace all :"+str.replace("a", "$"));
	
	
	System.out.println("d)contains : "+str.contains("collection"));
	
	
	
	 System.out.println("e) "+str.contains("java string pool refers to collection of strings which are stored in heap memory"));
	 
	 
	 System.out.println("f) "+str.equalsIgnoreCase("java string pool refers to collection of strings which are stored in heap memory"));

	 
}
}
