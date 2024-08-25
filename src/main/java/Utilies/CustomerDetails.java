package Utilies;

public class CustomerDetails {

	private String _firstName;
	private String _lastName;
	private String _emailAddress;
	private String _password;
	private String _confirmPassword;

	public CustomerDetails(String firstName, String lastName, String email, String password, String confirmPassword) {
		this._firstName = firstName;
		this._lastName = lastName;
		this._emailAddress = email;
		this._password = password;
		this._confirmPassword = confirmPassword;
	}

	public String FirstName() {
		return _firstName;
	}

	public String LastName() {
		return _lastName;
	}

	public String Email() {
		return _emailAddress;
	}

	public String Password() {
		return _password;
	}

	public String ConfirmPassword() {
		return _confirmPassword;
	}
}
