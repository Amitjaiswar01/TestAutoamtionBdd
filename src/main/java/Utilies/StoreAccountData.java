package Utilies;

import java.util.ArrayList;
import java.util.List;

public class StoreAccountData {

	private CustomerDetails customerDetails;

	// Set customer details
	public void setCustomerDetails(CustomerDetails details) {
		customerDetails = details;
	}

	// Get customer details
	public CustomerDetails getCustomerDetails() {
		return customerDetails;
	}

	// Get first name
	public String getFirstName() {
		return customerDetails != null ? customerDetails.FirstName() : null;
	}

	// Get last name
	public String getLastName() {
		return customerDetails != null ? customerDetails.LastName() : null;
	}

	// Get Email Address
	public String getEmailAddress() {
		return customerDetails != null ? customerDetails.Email() : null;
	}

	// Get Password
	public String getPassword() {
		return customerDetails != null ? customerDetails.Password() : null;
	}

	public List<String> FormData() {
		// Create an ArrayList and add elements manually
		List<String> data = new ArrayList<>();
		data.add("NewAccount@gmail.com");
		data.add("NewAccount#123");

		return data;
	}
}
