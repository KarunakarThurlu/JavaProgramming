package oops.inheritance;

/*
 * Key Points:- 
 * ------------ 
 * 1. Inheritance is not applicable for constructor. 
 * 2. Private members are not inherited.
 * 3. Cyclic Inheritance is NOT permitted in Java.
 * 4. Object is the base class of all classes in Java
 * 5. Type Reference and Declaration
 * 6. Inheritance is not applicable for final classes
 * 7. We can't extend more than one class
 * 8. Multiple inheritance is not applicable in java
 * 9. We can't override final methods
 * 10. Implementing the Serializable interface in a superclass allows its subclasses to be serialized automatically  
 */



class Parent{
	int a = 10;
	int b = 20;
	
	public Parent() {
		this(22);
		System.out.println("0 Args Parent Class Constructor");
	}
    public Parent(int i) {
		this("Parent",23.0);
		System.out.println("1 Args Parent Class Constructor");
	}
    
    public Parent(String s,double d) {
		System.out.println("2 Args Parent Class Constructor");
	}
	
}
class Child extends Parent{
	int a = 100;
	int b = 200;
	
	public Child(){
		super(19);
		System.out.println("0 Args Child Construcor");
	}
    public Child(int i){
		this(20,30);
		System.out.println("1 Args Child Construcor");
	}
    public Child(int i,int j){
		System.out.println("2 Args Child Construcor");
   	}
	
	public void sumOfParentVars() {
		System.out.println(super.a+super.b);//30
	}
	
	public void sumOfChildVars() {
		System.out.println(this.a+this.b);//300
	}
	
	public void sumOfCurrentClassVars(int a,int b) {
		System.out.println(this.a+this.b);//33
	}
}




public class InheritanceExample {

	public static void main(String... inheritance) {
		Child c=new Child();
		c.sumOfParentVars();
		c.sumOfChildVars();
		c.sumOfCurrentClassVars(11,22);
	}
}













