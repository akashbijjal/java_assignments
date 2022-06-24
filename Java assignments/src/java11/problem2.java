package java11;


interface sample
{
	String add(String a);
}
public class problem2 {

	public static void main(String[] args) {
		var a="akash";
		
		sample s=(var x)->x+x;
		System.out.println(s.add(a));
	}
	
}
