/**
 * project: Assignment 1
 * course: Object-Oriented Programming
 * @author Dennis Nsi
 * Date: 1/28/2025
 *
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class CollegeSystemTest {
	public static void main(String[] args) {
	 
		Scanner input = new Scanner(System.in);
		String name = "";
		int choice = 0;
		int studentNo = 0;
		int count = 0;
		
		try {
		System.out.print("Enter name of College: ");
		name = input.nextLine();
		System.out.print("Enter number of students: ");
		studentNo = input.nextInt();
		input.nextLine();
		}
		catch(InputMismatchException e) {
			System.out.println("***** Invalid input... Please try again *****");
		}
		
		Student[] student = new Student[studentNo];
		College c1 = new College (name,count,student);
		
		do{
        try{			
        	
        System.out.println("1. Add a student");
        System.out.println("2. Print all students");
        System.out.println("3. Exit");
        System.out.print("Enter your option: ");
        choice = input.nextInt();
        input.nextLine();
        if (choice < 1 || choice > 3) {
        	System.out.println("***** Invalid option... Please try again *****");
        }
        }catch(Exception mismatch){
        	System.out.println("***** Invalid option... Please try again *****");
        }
        switch (choice) {
            case 1:
            	c1.ReadStudentDetails(input);
            	break;
            case 2: 
            	c1.printStudentDetails();
            	break;
            case 3:
            	System.out.println("Goodbye... Have a nice day");
            	System.out.println("Program developed by Dennis Nsi");           	
        }
            
	}while(choice != 3);
}}
 

	
