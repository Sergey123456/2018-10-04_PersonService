package telran.persons;

import telran.util.Address;

public class Employee extends Person {
	private String  company;
	private int		salary;
	public Employee() {
	}
	public Employee(int id, String phone, String name, Address address, String company, int salary) {
		super(id, phone, name, address);
		this.company = company;
		this.salary = salary;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [company=" + company + ", salary=" + salary + ", Id=" + getId() + ", Phone="
				+ getPhone() + ", Name=" + getName() + ", Address=" + getAddress() + "]";
	}
}
