package pojo;

import java.util.Objects;

public class Employee {

	private Integer id;
	private String name;
	private String department;
	private Double salary;

	public Employee() {
		super();
	}

	public Employee(Integer id, String name, String department, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, department, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Employee employee = (Employee) obj;
		return id.equals(employee.id) && name.equals(employee.name) && department.equals(employee.department)
				&& salary.equals(employee.salary);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "{ id : " + id + ", name : " + name + ", department : " + department + ", salary : " + salary + " }";
	}
}
