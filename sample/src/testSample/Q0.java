package testSample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import lecturer.lab_1.q0.Employee;

class Q0 {
	@Test
	void test_1() {
		String name = "Kiệt";
		String address = "Kiệt Address";
		String phone = "0123456789";

		Employee solution = new Employee(name, address, phone);
		doanTuanKiet.lab_1.q0.Employee submission = new doanTuanKiet.lab_1.q0.Employee(name, address, phone);

		Assertions.assertEquals(solution.getName(), submission.getName());
//		Assertions.assertEquals(solution.getAddress(), submission.getAddress());
//		Assertions.assertEquals(solution.getPhone(), submission.getPhone());
	}

	@Test
	void test_2() {
		String name = "Kiệt";
		String address = "Kiệt Address";
		String phone = "0123456789";

		Employee solution = new Employee(name, address, phone);
		doanTuanKiet.lab_1.q0.Employee submission = new doanTuanKiet.lab_1.q0.Employee(name, address, phone);

		Assertions.assertEquals(solution.getName(), submission.getName());
		Assertions.assertEquals(solution.getAddress(), submission.getAddress());
//		Assertions.assertEquals(solution.getPhone(), submission.getPhone());
	}
	
	@Test
	void test_3() {
		String name = "Kiệt";
		String address = "Kiệt Address";
		String phone = "0123456789";
		
		Employee solution = new Employee(name, address, phone);
		doanTuanKiet.lab_1.q0.Employee submission = new doanTuanKiet.lab_1.q0.Employee(name, address, phone);
		
		Assertions.assertEquals(solution.getName(), submission.getName());
		Assertions.assertEquals(solution.getAddress(), submission.getAddress());
		Assertions.assertEquals(solution.getPhone(), submission.getPhone());
	}

}
