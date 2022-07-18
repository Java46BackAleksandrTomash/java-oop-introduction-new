package telran.people.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.people.Employee;
import telran.people.WageEmployee;
import telran.people.SalesPerson;

class PersonTests {

	@Test
	void Employee() {
		Employee employee = new Employee(12345678, 1985, "abcd@gmail.com", 15000);
		employee.setBasicSalary(15000);
		assertEquals(12345678, employee.getId());
		assertEquals(1985, employee.getBirthYear());
		assertEquals("abcd@gmail.com", employee.getEmail());
		assertEquals(15000, employee.computePay());

	}

	@Test
	void WageEmployee() {
		WageEmployee wageEmployee = new WageEmployee(12345678, 1985, "abcd@gmail.com", 15000, 40, 20);
		assertEquals(15800, wageEmployee.computePay());
		wageEmployee.setWage(60);
		wageEmployee.setHours(20);
		assertEquals(16200, wageEmployee.computePay());
	}

	@Test
	void SalesPerson() {
		SalesPerson salesPerson = new SalesPerson(12345678, 1985, "abcd@gmail.com", 15000, 10000, 10);
		assertEquals(16000, salesPerson.computePay());
		salesPerson.setSales(20000);
		salesPerson.setPercentPay(10);
		assertEquals(17000, salesPerson.computePay());
	}

}