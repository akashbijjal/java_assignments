package javaoops;

public class singleton {
private static singleton t=null;
public String s;
private singleton() {
	s="this is singleton";
}
public static singleton getSingle() {
	if(t==null)
	{
		t=new singleton();
	}
	return t;
}
public static void main(String[] args) {
	singleton s=singleton.getSingle();
	System.out.println(s.s);
}

}
