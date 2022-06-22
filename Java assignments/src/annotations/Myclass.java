package annotations;

@interface Execute
{
	int Sequence();
}


class Myclass {
 
	

	
	
	
@Execute(Sequence=2)	
public  void myMethod1()
{
	
}
@Execute(Sequence=1)
public void myMethod()
{
	
}
@Execute(Sequence=3)
public void mymethod()
{
	
}



}
