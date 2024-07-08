package Java_8;


import java.util.Objects;

public class Employee {
	private String empId;
	private String name;
	private Double salary;
	private int age;
	public Employee(String empId, String name, double salary, int age) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.age = age;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
