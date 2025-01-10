package oops.polymorphism;

class Employee{
	
	int empId;
	String empName;
	
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "{ empId : " + empId + ", empName : " + empName + " }";
	}
}






class Bird{
	public Bird fly() {
		System.out.println("Birds can fly....");
		return new Bird();
	}
}
class Swam extends Bird{

	@Override
	public Swam fly() {
		System.out.println("Swam can fly and swim....");
		return new Swam();
	}
	
}

public class OverridingExample {
 
	public static void main(String... overriding) {
		
		//What is Covariant return type?
	   
		 Swam s = new Swam();
		 s.fly();
	}
}





