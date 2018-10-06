package telran.persons;

import telran.util.Address;

public class Person implements Comparable<Person>{
	private int 	id;
	private String 	phone;
	private String	name;
	private Address address;
	public Person() {
	}
	public Person(int id, String phone, String name, Address address) {
		this.id 		= id;
		this.phone 		= phone;
		this.name 		= name;
		this.address 	= address;
	}
	public int getId() {
		return id;
	}
	public String getPhone() {
		return phone;
	}
	public String getName() {
		return name;
	}
	public Address getAddress() {
		return address;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", phone=" + phone + ", name=" + name + ", address=" + address + "]";
	}
	@Override
	public int compareTo(Person o) {
		return id - o.id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
