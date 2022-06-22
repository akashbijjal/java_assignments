package collections;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;


class SomeObject{
    public String creationDate;
    public SomeObject(){
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date today = Calendar.getInstance().getTime();        
        String creationDate = df.format(today);
    }
    @Override
    public String toString()
    {
    	return creationDate;
    }
}






public class leapyear {
public static void main(String[] args) {
	LinkedList<SomeObject> l1=new LinkedList<SomeObject>();
	l1.add(new SomeObject());
	l1.add(new SomeObject());
	System.out.println(l1);
	
}
}
