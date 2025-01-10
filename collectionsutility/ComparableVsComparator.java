package collectionsutility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import pojo.Employee;



public class ComparableVsComparator {
	
	public static void main(String...  comparableVsComparator) {
		
		List<Employee> empList = new ArrayList<>();
		
		empList.add(new Employee(1, "Varun","IT", 23000.0));
		empList.add(new Employee(4, "Tarun","Finance", 29000.0));
		empList.add(new Employee(2, "Karun","Security", 26000.0));
		empList.add(new Employee(3, "Jeevan","IT", 19000.0));
		empList.add(new Employee(5, "Meanon","Finance", 33000.0));
		
		System.out.println("------------Before Sorting--------------------------------------");
		empList.forEach(e->System.out.println(e));
		
		System.out.println("------------Comparable Default Sorting by empName---------------");
		
		empList.stream().sorted(Comparator.comparing(Employee::getName,Comparator.naturalOrder())).forEach(e->System.out.println(e));
		
		System.out.println("------------Comparator Custom Sorting By EmpSal-----------------");
		empList.stream().sorted(Comparator.comparing(Employee::getSalary,Comparator.naturalOrder())).forEach(e->System.out.println(e));
		
		System.out.println("------------Comparator Custom Sorting By EmpId------------------");
		empList.stream().sorted(Comparator.comparing(Employee::getId,Comparator.naturalOrder())).forEach(e->System.out.println(e));
	}
}
