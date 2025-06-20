import java.util.Scanner;

/**
 * project: Assignment 1
 * course: Object-Oriented Programming
 * @author Dennis Nsi
 * Date: 1/28/2025
 *
 */

public class Person {
	public String firstName;
	public String lastName;
	public String email;
	public String phoneNumber;
	
	Person () {
		firstName = "";
		lastName = "";
		email = "";
		phoneNumber = "";
	}
	
	Person (String firstName, String lastName, String email, String phoneNumber){
		firstName = this.firstName;
		lastName = this.lastName;
		email = this.email;
		phoneNumber = this.phoneNumber;
	}
//	getter method for first name
	public String getfirstName() {
		return firstName;
	}
//	setter method for first name
	void setfirstName (String firstName) {
	   firstName = this.firstName;	
	}
//	getter method for last name
	public String getlastName() {
		return lastName;
	}
//	setter method for last name
	void setlastName (String lastName) {
		   lastName = this.lastName;	
		}
//	getter method for email
	public String getemail() {
		return email;
	}
//	setter method for email
	void setemail (String email) {
		email = this.email;	
	}
//	getter method for phone number	
	public String getphoneNumber() {
		return phoneNumber;
	}
//	setter method for phone number
	void setphoneNumber (String phoneNumber) {
		phoneNumber = this.phoneNumber;	
		}
//	read method reads the person's details
	public void read(Scanner obj) {
		 System.out.print("Enter first name: ");
	     this.firstName = obj.nextLine();
	     System.out.print("Enter last name: ");
	     this.lastName = obj.nextLine();
	     System.out.print("Enter email address: ");
	     this.email = obj.nextLine();
	     System.out.print("Enter phoneNumber: ");
	     this.phoneNumber = obj.nextLine();
	}
}