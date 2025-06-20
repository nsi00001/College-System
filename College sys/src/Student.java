/**
 * project: Assignment 1
 * course: Object-Oriented Programming
 * @author Dennis Nsi
 * Date: 1/28/2025
 *
 */
import java.util.InputMismatchException;
import java.util.Scanner;

// instance variables of subclass Student
public class Student extends Person {
     protected int studentNumber;
     protected String programName;
     protected double gpa;
     protected double baseFees;
     static final int MAX_MARKS = 100;
     static final double MAX_GPA = 4.0;
     
     /**
      * Default constructor
      */
     Student() {
       	  studentNumber = 0;
       	  programName = "";
       	  gpa = 0;
       	  baseFees = 0;
         }
     
     /**
      * Custom Constructor
      * @param studentNumber
      * @param programName
      * @param gpa
      * @param baseFees
      */
     Student(int studentNumber, String programName, double gpa, double baseFees){
    	studentNumber = this.studentNumber;
    	programName = this.programName;
    	gpa = this.gpa;
    	baseFees = this.baseFees;
     }
     
//     getter method returns the studentNumber
     public int getstudentNumber() {
 		return studentNumber;
 	}
//   setter method sets the studentNumber	
 	void setstudentNumber (int studentNumber) {
 		studentNumber = this.studentNumber;	
 	}
//  getter method returns the programName
 	 public String getprogramName() {
  		return programName;
  	}
//   setter method sets the programName
  	void setprogramName (String programName) {
  		 programName = this.programName;	
  	}
//  getter method returns the gpa 	
  	 public double getgpa() {
  		return gpa;
  	}
 //  setter method sets the gpa	
  	void setgpa (double gpa) {
  		gpa = this.gpa;	
  	}
//  getter method returns the baseFees
  	 public double getbaseFees() {
   		return baseFees;
   	}
 //  setter method returns the baseFees
   	void setbaseFees (double baseFees) {
   		baseFees = this.baseFees;	
   	}
//  Calculates the gpa of the courses
    public void calculateGpa (double[] array) {
    	double sum = 0;
   		for (int i=0; i < array.length; i++) {
   			sum += array[i];
   		}
   	    gpa =(((double) sum/array.length)/MAX_MARKS)*MAX_GPA ;  
   	}
// Stores the course marks and then calls the calculateGpa 
   	private void readMarks(Scanner obj) {
   		int mark =0;
   		int courseNo =0;
   		  
   			try {
   		System.out.print("Enter number of courses: ");
   		courseNo = obj.nextInt();
   		obj.nextLine();
   			}catch(InputMismatchException e) {
	    		System.out.println("Wrong input type");
	    		obj.next();
   			}

   		double[] marksArray = new double[courseNo];
        for (int i=1; i <= courseNo & mark <= MAX_MARKS; i++) {
        	System.out.print("Enter mark " + i + ": ");
        	mark = obj.nextInt();
        	obj.nextLine();
         marksArray[i-1] = mark;
        }
   	
        calculateGpa(marksArray);
   	}
   	
   	// reads all of Student's details
    public void readInfo(Scanner obj) {
   	 
   	 
//   	  Read student information and save to instance variables
   	 System.out.print("Enter program name: ");
     this.programName = obj.nextLine();
   	 System.out.print("Enter student number: ");
     this.studentNumber = obj.nextInt();
     obj.nextLine();  
     super.read(obj);
     readMarks(obj);
     System.out.print("Enter base fees: ");
     this.baseFees = obj.nextDouble();
     obj.nextLine();
     // Call the readMarks method to read marks
    
   	}
    // displays all attributes of Student in format
    public void printInfo() {      
System.out.printf("%7s|%8d|%18s|%18s|%15s| %1.2f|", programName, studentNumber, firstName + " " + lastName, email, phoneNumber, gpa);

    }
}

