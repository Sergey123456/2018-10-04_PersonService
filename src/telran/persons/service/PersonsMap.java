package telran.persons.service;
import java.util.*;

import telran.persons.Person;
import telran.util.Address;

public class PersonsMap implements IPersons {
	private Map<Integer, Person> persons;
	
	public PersonsMap() {
		persons = new HashMap<>();
	}
	@Override
	public boolean addPerson(Person person) {
		if (person == null)
			return false;
		return persons.putIfAbsent(person.getId(), person) == null;
	}
	@Override
	public boolean removePerson(int id) {
		return persons.remove(id) != null;
	}
	@Override
	public List<Person> getAllPersons() {
		List<Person> list = new ArrayList<>(persons.values());
		return list;
	}
	public static void main(String[] args) {
		PersonsMap personsMap = new PersonsMap();
		Person person1 = new Person(111, "11-11-11", "Sergey", 	
				new Address("Vladimir", "Lenina", 			34, 25));
		Person person2 = new Person(222, "22-22-22", "Andrew", 	
				new Address("Moscow", 	"Pobedy", 			75, 67));
		Person person3 = new Person(333, "33-33-33", "Ilia", 	
				new Address("Ivanovo", 	"Krasnoarmeiskaia", 12, 75));
		
		personsMap.addPerson(person1);
		personsMap.addPerson(person2);
		personsMap.addPerson(person3);
		
		List<Person> list = personsMap.getAllPersons();
		
		for (Person person : list) {
			Address address = person.getAddress();
			System.out.printf("%d %s %s Address: %s %s %d %d\n", 
				person.getId(), person.getPhone(), person.getPhone(), 
				address.getCity(), address.getStreet(), address.getBuilding(),
				address.getAprt());
		}
	}
}
