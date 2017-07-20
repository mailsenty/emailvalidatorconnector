package org.mule.modules.emailvalidator;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmailValidatorConnectorTest {
	
	EmailValidatorConnector emailValidatorConnector= new EmailValidatorConnector();

	@Test
	public void testValidateEmailId() {
		System.out.println(emailValidatorConnector.validateEmailId("john@gmail.com"));
	}

}
