package telran.persons;

import telran.util.Address;

public class Child extends Person {
	public String kinderGarden;
	public Child(int id, String phone, String name, Address address, String kinderGarden) {
		super(id, phone, name, address);
		this.kinderGarden = kinderGarden;
	}
	public Child() {
	}
	public String getKinderGarden() {
		return kinderGarden;
	}
	public void setKinderGarden(String kinderGarden) {
		this.kinderGarden = kinderGarden;
	}
	@Override
	public String toString() {
		return "Child [kinderGarden=" + kinderGarden + ", Id=" + getId() + ", Phone=" + getPhone()
				+ ", Name=" + getName() + ", Address=" + getAddress() + "]";
	}

}
