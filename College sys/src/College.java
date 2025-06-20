/**
 * project: Assignment 1
 * course: Object-Oriented Programming
 * @author Dennis Nsi
 * Date: 1/28/2025
 *
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class College {

	private String name;
	private Student[] students;
	private int count;

//	College (){
//    	name = "";
//    	students = null;
//    	count = 0;		
//    }
	
    College (String name, int count, Student... students){
    	this.name = name;
    	this.students = students;
    	this.count = count;		
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public void printTitle() {
		System.out.print(name + " - List of Students\n");
		System.out.println("************************************");
System.out.print("Program|Student#|              Name|             Email|          Phone|  GPA|      Fees|   Credits|\n");   
	}
    
    public void ReadStudentDetails(Scanner obj) {
    	int studCount = count+1;
    	int studentType = 0;
    	try {
    	if (students[count] != null || count >= students.length) {
    		System.out.println("Array is full...cannot add more students");
    	}
    		}catch(Exception e) {
        		System.out.println("Array is full...cannot add more students");	
        	}
       if(count < students.length){
    		
    		System.out.println();
    		System.out.println("Enter details of student " + studCount + ":");
    		System.out.println("=======================================");
    		do {
	    		try{
		    		System.out.println("1 - Fulltime Student");
		    		System.out.println("2 - Parttime Student");
		    		System.out.print("Enter Student Type: ");
		    		studentType = obj.nextInt();
		    		obj.nextLine();
		    		if (studentType != 1 && studentType != 2) {
		    			System.out.println("Wrong student type");
		    		}
	    		}catch (InputMismatchException e) {
			    		System.out.println("Wrong student type");
			    		obj.next();
//			    		e.printStackTrace();
			    	}
	    		}while(studentType != 1 && studentType != 2);
		    		
		    		if (studentType == 1) {
		    	
		    			Student ftS = new FulltimeStudent();
		       			students[count] = ftS;
		    			ftS.readInfo(obj);
	
		    			
		    		}
		    		else if (studentType == 2) {
		    			Student ptS = new ParttimeStudent();
		    			students[count] = ptS;
		    			ptS.readInfo(obj);
		    			
		    			
		    		}
		//    		
		    		count++;
//		    		obj.close();
		    	}
    	}
    
    //Prints all of Students' details in array
    public void printStudentDetails() {
    	if (count == 0) {
    		System.out.println();
    		System.out.println("***** No students to print *****");
    		System.out.println();
    	}
    	else {
    		printTitle();
    		for (int i=0; i<count; i++) {
    			students[i].printInfo();
//
    		}
    	}
    }
    
    
}

 
 