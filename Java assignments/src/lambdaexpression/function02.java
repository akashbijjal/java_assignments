package lambdaexpression;

import java.util.function.Function;
import java.util.function.Predicate;

class student
{
	String name;
	int marks;
	public student(String name,int marks)
	{
		this.name=name;
		this.marks=marks;
	}
}



public class function02 {
public static void main(String[] args) {
	student s[]= {new student("akash",100),
			new student("durga",65),
			new student("sunny",55),
			new student("chinny",45),
			new student("vinny",25)
	};
	Function<student, String>f1= s1->{
		int marks=s1.marks;
		String grade="";
		if(marks>=80)grade="A[Distinction";
		else if(marks>=60)grade="B[First class]";
		else if(marks>=50)grade="c[Second class";
		else if(marks>40)grade="d[Third class]";
		else if(marks<35)grade="e[Fail]";
		return grade;
};
	
	
	for (student student1 : s) {
		System.out.println(student1.name+" "+student1.marks+" "+f1.apply(student1));
	}
	
	
	
//	Predicate<student>p=s1->s1.marks>60;
//	for (student student1 : s) {
//		if(p.test(student1))
//		{
//			System.out.println(student1.name+" "+student1.marks);
//			System.out.println(f1.apply(student1));
//		}
//	}
	
	
	
}
}
