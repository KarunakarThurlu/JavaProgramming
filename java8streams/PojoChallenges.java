package java8streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

import pojo.Employee;

public class PojoChallenges {
	public static void main(String[] args) {
		Set<Employee> empList = Set.of(new Employee(1, "Tarun", "IT", 68000.00),
				new Employee(2, "Varun", "IT", 88000.00), new Employee(3, "karun", "Finance", 68000.00),
				new Employee(4, "Meanon", "HR", 48000.00), new Employee(5, "Jeevan", "HR", 37000.00),
				new Employee(6, "Jeevan", "HR", 68000.00), new Employee(7, "Kiran", "Sales", 88000.00),
				new Employee(8, "Tarun", "IT", 78000.00));
		StringBuilder s1=new StringBuilder("Java");
		StringBuilder s2=new StringBuilder("Java");
		System.out.println(s1.equals(s2));
	}

	static Function<Employee, Integer> id = Employee::getId;
	static Function<Employee, Double> salary = Employee::getSalary;
	static Function<Employee, String> department = Employee::getDepartment;
	static Function<Employee, String> name = Employee::getName;

	// Q1. Sort Employee Name if Names are same sort by Salary
	static UnaryOperator<List<Employee>> sortByNameSalary = (empList) -> {
		return empList.stream().sorted(Comparator.comparing(name).thenComparing(salary)).toList();
	};

	// Q2. Find Highest Salary Employee
	static Function<List<Employee>, Employee> highestSalaryEmployee = (empList) -> {
		return empList.stream().max(Comparator.comparing(salary)).get();
	};

	// Q3. Find Employee with lowest salary
	static Function<List<Employee>, Employee> lowestSalaryEmployee = empList -> {
		return empList.stream().min(Comparator.comparing(salary)).get();
	};

	// Q3. Sort Employees by salary
	static UnaryOperator<List<Employee>> sortBySalary = empList -> {
		return empList.stream().sorted(Comparator.comparing(salary, Comparator.reverseOrder())).toList();
	};

	// Q4. Employees count from Department
	static BiFunction<List<Employee>, String, List<Employee>> employeesByDepartment = (empList, department) -> {
		return empList.stream().filter(emp -> emp.getDepartment().equals(department)).toList();
	};

	// Q5. Sum of salaries of all employees
	static Function<List<Employee>, Double> sumOfSalaries = empList -> {
		return empList.stream().map(salary).reduce(Double::sum).get();
	};

	// Q6. Find Highest Salary Employee from Employee List
	static Function<List<Employee>, Employee> higestSalaryEmployee = empList -> {
		return empList.stream().max(Comparator.comparing(salary)).get();
	};

	// Q7. Find Highest Salary Employee from Each Department
	static Function<List<Employee>, Map<String, Optional<Employee>>> higestSalEmpByDept = empList -> {
		Comparator<Employee> comparing = Comparator.comparing(salary);
		return empList.stream().collect(Collectors.groupingBy(department, Collectors.maxBy(comparing)));
	};

	// Q8. Grouping by Employee Department
	static Function<List<Employee>, Map<String, List<Employee>>> groupByDepartment = (empList) -> {
		return empList.stream().collect(Collectors.groupingBy(department));
	};

	// Q9. Find the employee with lowest salary in each department
	static Function<List<Employee>, Map<String, Optional<Employee>>> lowestSalEmpByDept = (empList) -> {
		Comparator<Employee> comparing = Comparator.comparing(salary);
		return empList.stream().collect(Collectors.groupingBy(department, Collectors.minBy(comparing)));
	};

	// Q10. Find the employee with highest salary in each department
	static Function<List<Employee>, Map<String, Optional<Employee>>> highSalaryInDept = empList -> {
		Comparator<Employee> comparing = Comparator.comparing(salary);
		return empList.stream().collect(Collectors.groupingBy(department, Collectors.maxBy(comparing)));
	};

	// Q11. Convert List to Map
	static Function<List<Employee>, Map<Integer, String>> listToMap = empList -> {
		return empList.stream().collect(Collectors.toMap(id, name));
	};
	
	// Q12. Find average salary of each department
	static Function<List<Employee>, Map<String,Double>> findAverageSalryOfDept = empList -> {
		return empList.stream().collect(Collectors.groupingBy(department,Collectors.averagingDouble(Employee::getSalary)));
	};
	
	// Q13. Find Employee count in each department
	static Function<List<Employee>, Map<String,Long>> findEmpCountByDept = empList -> {
		return empList.stream().collect(Collectors.groupingBy(department,Collectors.counting()));
	};
	
	// Q14. Find Sum of Salaries in each department
	static Function<List<Employee>, Map<String,Double>> findSalariesSumByByDept = empList -> {
		return empList.stream().collect(Collectors.groupingBy(department,Collectors.summingDouble(Employee::getSalary)));
	};
	
	// Q15. Group Employee names by department
	static Function<List<Employee>, Map<String,List<String>>> groupEmpNamesByByDept = empList -> {
		return empList.stream().collect(Collectors.groupingBy(department,Collectors.mapping(Employee::getName,Collectors.toList())));
	};
	
	// Q16. Extract All Employee names
	static Function<List<Employee>, List<String>> extractEmployeeNames = empList -> {
		return empList.stream().map(name).toList();
	};
}
