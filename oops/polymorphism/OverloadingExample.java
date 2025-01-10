package oops.polymorphism;

import java.util.Optional;

public class OverloadingExample {
	
	//Different type of arguments
	public OverloadingExample(){
		this("Foo");
		System.out.println("0 Arg Constructor");
	}
	
	public OverloadingExample(String s){
		this(10,20);
		System.out.println("1 Arg Constructor "+ s);
	}
	public OverloadingExample(Integer i,Integer j){
		this('C',false);
		System.out.println("2 Arg Constructor "+ (i+j));
	}
	public OverloadingExample(Character c,Boolean b){
		System.out.println("2 Arg Constructor "+ c+" " + b);
	}
	
	
	
	//Same type of arguments
	public void sum(int i) {
		int j=i+i;
		System.out.println("1 arg sum "+j);
	}
	public void sum(int i,int j) {
		int k=i+j;
		System.out.println("2 arg sum "+k);
	}
	public void sum(int i,int j,double k) {
		double l=i+j+k;
		System.out.println("3 arg sum "+l);
	}
	
	
	//Trickey interview questions
	public static void foo(String string) {
		System.out.println("String arg method");
	}
	
	public static void foo(Object string) {
		System.out.println("Objeect arg method");
	}
	public static void main(String[] args) {
		foo(null);
	}
}
