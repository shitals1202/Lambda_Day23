package Bridgelabz.Lambdaexp;

import java.util.regex.*;

public class UserData {

	public void firstName() {

		UserInterface firstName = (data) -> {
			String Name = data;
			String reg = "^[A-Z][a-z][A-Za-z]$";
			Pattern pattern = Pattern.compile(reg);
			Matcher matcher = pattern.matcher(Name);
			return matcher.matches();
		};

	}

	public void LastName() {
		UserInterface lastName = (data) -> {
			String Name = data;
			String reg = "^[A-Z][a-z][A-Za-z]*$";
			Pattern pattern = Pattern.compile(reg);
			Matcher matcher = pattern.matcher(Name);
			return matcher.matches();
		};

	}

	public void EmailId() {
		UserInterface emailId = (data) -> {
			String email = data;
			String reg = "^[A-Za-z0-9+_.-]+@(.+)$";
			Pattern pattern = Pattern.compile(reg);
			Matcher matcher = pattern.matcher(email);
			return matcher.matches();
		};

	}

	public void password() {

		UserInterface password = (data) -> {
			String pass = data;
			String reg = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{7,}$";
			Pattern pattern = Pattern.compile(reg);
			Matcher matcher = pattern.matcher(pass);
			return matcher.matches();
		};

	}
	
	public void phonenumber() {
		UserInterface phoneNumber = (data) -> {
			String phoneNo = data;
			String reg = "(0/91)?[6-9][0-9]{9}";
			Pattern pattern = Pattern.compile(reg);
			Matcher matcher = pattern.matcher(phoneNo);
			return matcher.matches();
		};

	}

}