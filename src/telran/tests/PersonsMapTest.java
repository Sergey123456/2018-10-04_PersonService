package telran.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import telran.persons.Person;
import telran.persons.service.PersonsMap;
import telran.util.Address;

class PersonsMapTest {
	PersonsMap persons3Original;
	PersonsMap personsEmpty;
	List<Person> expected;
	@BeforeEach
	void setUp() throws Exception {
		persons3Original 	= new PersonsMap();
		personsEmpty 		= new PersonsMap();
		expected			= new ArrayList<>();
		Person person1 = new Person(111, "11-11-11", "Sergey", 	
				new Address("Vladimir", "Lenina", 			34, 25));
		Person person2 = new Person(222, "22-22-22", "Andrew", 	
				new Address("Moscow", 	"Pobedy", 			75, 67));
		Person person3 = new Person(333, "33-33-33", "Ilia", 	
				new Address("Ivanovo", 	"Krasnoarmeiskaia", 12, 75));
		persons3Original.addPerson(person1);
		persons3Original.addPerson(person2);
		persons3Original.addPerson(person3);
	}
	@Test
	void addPersonTest() {
		// Add first element to empty PersonsMap 
		Person person = new Person(444, "44-44-44", "Natasha", 	
				new Address("Tver", "Mira", 45, 12));
		personsEmpty.addPerson(person);
		expected.add(person);
		assertEquals(expected, personsEmpty.getAllPersons());
		
		// Add second element
		person = new Person(555, "55-55-55", "Pasha", 	
				new Address("Vologda", "Oktiabrskaya", 87, 91));
		personsEmpty.addPerson(person);
		ArrayList<Person> personsEmptyAr = (ArrayList<Person>)personsEmpty.getAllPersons();
		personsEmptyAr.sort((o1, o2) -> o1.getId() > o2.getId() ? 1 : -1);
		expected.add(person);
		expected.sort((o1, o2) -> o1.getId() > o2.getId() ? 1 : -1);
		assertEquals(expected, personsEmptyAr);
	}
	@Test
	public void removeTest() {
		// delete nonexistents elements
		assertFalse(personsEmpty.removePerson(444));
		assertFalse(persons3Original.removePerson(444));
		
		// delete existent element twice
		assertTrue(persons3Original.removePerson(333));
		assertFalse(persons3Original.removePerson(333));
		
		// check remaining
		persons3Original.removePerson(222);
		Person person = new Person(111, "11-11-11", "Sergey", 	
				new Address("Vladimir", "Lenina", 			34, 25));
		expected.add(person);
		assertEquals(expected, persons3Original.getAllPersons());
	}
	
	@Test
	public void getAllPersonsTest() {
		List<Person> expected 	= new ArrayList<>();
		List<Person> actual 	= persons3Original.getAllPersons();
		Person person1 = new Person(111, "11-11-11", "Sergey", 	
				new Address("Vladimir", "Lenina", 			34, 25));
		Person person2 = new Person(222, "22-22-22", "Andrew", 	
				new Address("Moscow", 	"Pobedy", 			75, 67));
		Person person3 = new Person(333, "33-33-33", "Ilia", 	
				new Address("Ivanovo", 	"Krasnoarmeiskaia", 12, 75));
		expected.add(person1);
		expected.add(person2);
		expected.add(person3);
		expected.sort((o1, o2) -> o1.getId() > o2.getId() ? 1 : -1);
		actual.sort((o1, o2) -> o1.getId() > o2.getId() ? 1 : -1);
		assertEquals(expected, actual);
	}
}
