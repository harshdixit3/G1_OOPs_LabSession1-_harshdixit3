package com.greatlearning.sevice;

import com.greatlearning.modal.Employee;

public interface EmpCredentials {
	String generateEmailId(String fname, String lname, String dept);

	String generatePassword();

	void showDetails(Employee e);
	
}
