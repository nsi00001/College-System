/**
 * project: Assignment 1
 * course: Object-Oriented Programming
 * @author Dennis Nsi
 * Date: 1/28/2025
 *
 */
import java.util.Scanner;

public class ParttimeStudent extends Student {
      private double courseFeesTotal;
      private double credits;
      
      ParttimeStudent() {
       	  super();
       	courseFeesTotal = 0;
       	credits = 0;
         }
      
      ParttimeStudent (int studentNumber, String programName, double gpa, double courseFeesTotal, double credits) {
    	  courseFeesTotal = this.courseFeesTotal;
    	  credits = this.credits;
      }
     
//  readInfo reads all the details of part time student    
      public void readInfo(Scanner obj) {
    	  super.readInfo(obj);
    	  System.out.print("Enter course fees: ");
    	     this.courseFeesTotal = obj.nextDouble();
    	     obj.nextLine();
    	     System.out.print("Enter credit hours: ");
    	     this.credits = obj.nextDouble();
    	     obj.nextLine();
      }
      @Override
      public void printInfo() {
    	  courseFeesTotal = baseFees + (courseFeesTotal * credits);
//      	setbaseFees(courseFeesTotal);
      	super.printInfo();
     	System.out.printf("%10.2f|%10.2f|", courseFeesTotal, credits);
     	System.out.println();
      }
}



