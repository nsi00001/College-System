/**
 * project: Assignment 1
 * course: Object-Oriented Programming
 * @author Dennis Nsi
 * Date: 1/28/2025
 *
 */
import java.util.Scanner;

public class FulltimeStudent extends Student {
      private double tuitionFees;
      
      //Default Constructor for FulltimeStudent
      FulltimeStudent() {
       	  super();
       	  tuitionFees = 0;
         }
      //Custom Constructor for FulltimeStudent
      FulltimeStudent (int studentNumber, String programName, double gpa, double baseFees, double tuitionFees) {
    	  super(studentNumber,programName, gpa, baseFees);
    	  tuitionFees = this.tuitionFees;
      }
      
      //reads all of FulltimeStudent's attributes and invokes super method readInfo()
      public void readInfo(Scanner obj) {
    	  super.readInfo(obj);
    	  System.out.print("Enter tuition fees: ");
    	     this.tuitionFees = obj.nextDouble();
    	     obj.nextLine();
      }
      //displays all of FulltimeStudent's attributes and invokes super method printInfo()
      @Override
 	    public void printInfo() {    	 
    	 double totalFees = tuitionFees + baseFees;
//    	 setbaseFees(totalFees);
    	super.printInfo();
    	  System.out.printf("%10.2f|", totalFees);
    	  System.out.println();
      }
}
