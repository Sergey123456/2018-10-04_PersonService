import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import telran.persons.Employee;
import telran.util.Address;

class PersonServiceTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		Employee expected = new Employee
		(123, "1234567", "Vasya", new Address("Lod", "Sokolov", 25, 10),
				"Motorola", 10_000);
		Employee actual = new Employee
				(123, "1234567", "Vasya", new Address("Lod", "Sokolov", 25, 10),
						"Motorola", 10_000);
		assertEquals(expected, actual);
	}

}
