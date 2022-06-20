package generics;

import java.util.HashSet;

class Employee {
private int id;
private String name;
private int salary;
private String department;
public Employee() {
	
}
public Employee(int id,String name,int salary,String department) {
	this.id=id;
	this.name=name;
	this.salary=salary;
	this.department=department;
}

public String toString() 
{
	return "{"+"id="+id+", name="+name+", salary="+salary+", department="+department+"}";
}
}
class Main{
	public static void main(String[] args) {
		HashSet<Employee> h1=new HashSet<Employee>();
		h1.add(new Employee(1,"abc", 50000, "Java Development"));
		h1.add(new Employee(2,"abc01", 60000, "Python Development"));
		h1.add(new Employee(3,"abc02", 70000, "SAP Development"));
		h1.add(new Employee(4,"abc03", 80000, ".net Development"));
		h1.add(new Employee(5,"abc04", 90000, "c# Development"));
		
		System.out.println(h1);
		
	}
}