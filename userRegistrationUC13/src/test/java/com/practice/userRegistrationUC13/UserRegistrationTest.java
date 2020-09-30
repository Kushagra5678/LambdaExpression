package com.practice.userRegistrationUC13;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
public class UserRegistrationTest {
	public static UserRegistration ur=null;
	@Test
	public void TestFirstName_trueCase() {
		ur = new UserRegistration();
		boolean result = ur.firstName.validate("Sunny");
		assertTrue(result);
	}
	@Test
	public void TestFirstName_falseCase() {
		ur = new UserRegistration();
		boolean result = ur.firstName.validate("sunny");
		assertFalse(result);
	}
	@Test
	public void TestLastName_trueCase() {
		ur = new UserRegistration();
		boolean result = ur.lastName.validate("Agg");
		assertTrue(result);
	}
	@Test
	public void TestLastName_falseCase() {
		ur = new UserRegistration();
		boolean result = ur.lastName.validate("agg");
		assertFalse(result);
	}
	@Test
	public void TestEmail_trueCase() {
		ur = new UserRegistration();
		boolean result = ur.email.validate("abc@gmail.com");
		assertTrue(result);
	}
	@Test
	public void TestEmail_falseCase() {
		ur = new UserRegistration();
		boolean result = ur.email.validate("abc.gmail.com");
		assertFalse(result);
	}
	@Test
	public void TestPhoneNumber_trueCase() {
		ur = new UserRegistration();
		boolean result = ur.phNo.validate("919876543456");
		assertTrue(result);
	}
	@Test
	public void TestPhoneNumber_falseCase() {
		ur = new UserRegistration();
		boolean result = ur.phNo.validate("9198765434");
		assertFalse(result);
	}
	@Test
	public void TestPassword_trueCase() {
		ur = new UserRegistration();
		boolean result = ur.password.validate("Boo9@123467");
		assertTrue(result);
	}
	@Test
	public void TestPassword_falseCase() {
		ur = new UserRegistration();
		boolean result = ur.password.validate("Boo9123467");
		assertFalse(result);
	}
}
