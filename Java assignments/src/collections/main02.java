package collections;

import java.util.Comparator;
import java.util.TreeSet;

class Employee{
	private long ID;
	private String Name;
	private String Department;
	private long salary;
	
	public Employee() {
		
	}
	public Employee(long ID,String Name,String Department,long salary) {
		this.ID=ID;
		this.Name=Name;
		this.Department=Department;
		this.salary=salary;
	}
	@Override public String toString()
    {
        return "" + this.ID + " " + this.Name + " "
            + this.Department+" "+this.salary;
    }
	
}
class comparator01 implements Comparator<Employee>
{        @Override
		public int compare(Employee e1,Employee e2)
		{
		return (e1.Name).compareTo(e2.Name);	
		}
}


class main02 {
public static void main(String[] args) {
	TreeSet<Employee>set=new TreeSet<Employee>();
	set.add(new Employee(1,"John Cena","WWF",50000));
	set.add(new Employee(2,"Rock","action",60000));
	set.add(new Employee(3,"akash","Thriller",80000));
	set.add(new Employee(4,"Adheera","KGF",20000));
	set.add(new Employee(5,"Dks","kanakapura",70000));
	set.add(new Employee(6,"rocky","kgf",50000));
	System.out.println(set);
	
	
	
}
}
