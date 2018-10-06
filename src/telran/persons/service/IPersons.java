package telran.persons.service;

import java.util.List;

import telran.persons.Person;

public interface IPersons {
	boolean addPerson(Person person);
	boolean removePerson(int id);
	List<Person> getAllPersons();
}
