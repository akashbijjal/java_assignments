package javaoops;


class Employee {

  int id;
int salary;
  public Employee() {

  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
  public int getsal() {
	  return salary;
  }
  public void setsal(int salary)
  {
	  this.salary=salary;
  }
}

class Manager extends Employee {

  int bonus;

  public Manager() {
    super();
  }

  public double getBonus() {
    return bonus+salary;
  }

  public void setBonus(int bonus) {
    this.bonus = bonus;
  }
  
}

class labour extends Employee{
	
	double overtime=0;
public labour() {
	super();
}
if(hoursWorked <= 8) {
    totalPay = hoursWorked * rateOfPay;
}  else {
     totalPay = (8 * rateOfPay) + ((hoursWorked - 8) * (rateOfPay*1.5);
}



    class Main{
    public static void main(String[] args) {
        // TODO code application logic here
        Manager m = new Manager();
        m.setId(1);
        m.setsal(4000);
        m.setBonus(100);
        
        System.out.println("Manger has an ID of " + m.getId() + " with a bonus of " + m.getBonus());
    }

}