/* Write a Java program to determine the grade for a student based on their test score. The grading system is as follows:


A: 90 - 100

B: 80 - 89

C: 70 - 79

D: 60 - 69

E: 50 - 59

F: Below 50

Instructions:


Create a class called "GradeCalculator".

Inside the main method, prompt the user to enter their test score.

Read the input from the user and store it in a variable.

Use conditional statements (if-else) and logical operators to determine the grade based on the test score.

Print the grade to the console.

Bonus:

6. Implement the same program using a switch statement instead of if-else statements. */


//Source Code:

import java.util.*;

class GradeCalculator {
    public static void main(String[] args) {
    	Scanner sc= new Scanner(System.in);  
    	System.out.println("METHOD 1 - IF.. ELSE STATEMENT");
	System.out.print("Enter the mark : ");  
	int mark = sc.nextInt();  
    	if(mark <= 100 && mark >= 90){
        	System.out.println("Your Grade is A");
        } else if (mark <= 89 && mark >= 80) {
        	System.out.println("Your Grade is B");
        } else if (mark <= 79  && mark >= 70) {
        	System.out.println("Your Grade is C");
        }
        else if(mark <=69 && mark >= 60 ) {
        	System.out.println("Your Grade is D");
        }
        else if(mark <=59 && mark >=50){
        	System.out.println("Your Grade is E");
        }
        else if (mark <=49 && mark >= 0){
        	System.out.println("Your Grade is F");
        } else {
        	System.out.println("Enter the Proper Mark");
        }
        
        System.out.println("METHOD 2 - SWITCH CASE");
        System.out.print("Enter the mark : ");  
	int mark1 = sc.nextInt();
	int avg = (mark1 / 10);
	switch(avg){
	   case 10:
	   	System.out.println("Your Grade is A");
	   	break;
           case 9:
   	        System.out.println("Your Grade is B");
   	        break;
	   case 8:
	   	System.out.println("Your Grade is C"); 
	   	break;
	   case 7:
	   	System.out.println("Your Grade is D"); 
	   	break;
	   case 6:
	   	System.out.println("Your Grade is E"); 
	   	break;
	   case 5:
	   	System.out.println("Your Grade is F");
	   	break; 
	   case 4:
	   	System.out.println("Your Grade is F"); 
	   	break;
	   case 3:
	   	System.out.println("Your Grade is F"); 
	   	break;
	   case 2:
	   	System.out.println("Your Grade is F"); 
	   	break;
	   case 1:
	   	System.out.println("Your Grade is F"); 
	   	break; 
	   case 0:
	   	System.out.println("Your Grade is F");
	   	break;
	   default:
	   	System.out.println("Enter the proper Mark");
	  }
    }
}
