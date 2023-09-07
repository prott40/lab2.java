 /*<Lab2.java
  * <Preston Rottinghaus / Section: 02B/ Day: Thursday/ Time: 3:30-5:20pm>
  *<This program is designed to collected grade scored in class and credit hours. 
  *<Multiply grade points by credit hours.
  *Add total points together and divide by total credit hours.
  *Resulting in cumulative GPA.> 
  */

 import java.util.*;
 
 
public class Lab2 {

	public static void main(String[] args) {
		//Random r = new Random();
		Scanner s = new Scanner(System.in);
		/*
		System.out.print("Enter your name: ");
		String name = s.nextLine();
		System.out.print(name.charAt(0));
		System.out.print(name.charAt(1));
		System.out.print(name.charAt(2));
		System.out.print(name.charAt(3));
		int val = r.nextInt(100);
		System.out.print(val);
		*/
		
		
		final int A = 4;
		final int B = 3;
		final int C = 2;
		final int D = 1;
		final int F = 0;
		double totHour;
		double pointsf;
		double pointss;
		double pointst;
		double gpa;
		System.out.print("Enter first letter grade of course: ");
		String first = s.next();
		char gradef = first.charAt(0);
		switch (gradef) {
		case('A'):
		case('a'):
			
		case('B'):
		case('b'):
			
		case('C'):
		case('c'):
			
		case('D'):
		case('d'):
			
		case('F'):
		case('f'):
			System.out.print("Enter first course number of credit hours: ");
			break;
		default:
			System.out.print("Invalid grade entered");
			return;
			
		}
													
		
		double firhour = s.nextDouble();
		
		System.out.print("Enter second letter grade of course: ");
		String second = s.next();
		char grades = second.charAt(0);
		switch (grades) {
		case('A'):
		case('a'):
			
		case('B'):
		case('b'):
			
		case('C'):
		case('c'):
			
		case('D'):
		case('d'):
			
		case('F'):
		case('f'):
			System.out.print("Enter first course number of credit hours: ");
			break;
		default:
			System.out.print("Invalid grade entered");
			return;
			
		}
		double sechour = s.nextDouble();
		System.out.print("Enter third letter grade of course: ");
		String third = s.next();
		
		char gradet = third.charAt(0);
		switch (gradet) {
		case('A'):
		case('a'):
			
		case('B'):
		case('b'):
			
		case('C'):
		case('c'):
			
		case('D'):
		case('d'):
			
		case('F'):
		case('f'):
			System.out.print("Enter first course number of credit hours: ");
			break;
		default:
			System.out.print("Invalid grade entered");
			return;
			
		}
		double thirhour = s.nextDouble();
		if((gradef == 'A')|| (gradef == 'a')){
			pointsf = A * firhour;
		}
		else if ((gradef == 'B')||(gradef == 'b')) {
			pointsf = B * firhour;
		}
		else if ((gradef =='C')||(gradef == 'c')) {
			pointsf = C * firhour;
		}
		else if ((gradef =='D')||(gradef == 'd')){
			pointsf = D * firhour;
		}
		else {
			pointsf = F * firhour;
		}
		if((grades == 'A')||(grades == 'a')) {
			pointss = A * sechour;
		}
		else if ((grades == 'B')||(grades == 'b')) {
			pointss = B * sechour;
		}
		else if ((grades == 'C')||(grades == 'c')) {
			pointss = C * sechour;
		}
		else if ((grades == 'D')||(grades == 'd')) {
			pointss = D * sechour;
		}
		else {
			pointss = F * sechour;
		}
		
		if((gradet == 'A')|| (gradet == 'a')) {
			pointst = A * thirhour;
		}
		else if ((gradet == 'B')|| (gradet == 'b')) {
			pointst = B * thirhour;
		}
		else if ((gradet == 'C')|| (gradet == 'c')) {
			pointst = C * thirhour;
		}
		else if ((gradet == 'D')|| (gradet == 'd')) {
			pointst = D * thirhour;
		}
		else {
			pointst = F * thirhour;
		}
		totHour = firhour + sechour + thirhour;
		gpa = ((pointsf + pointss + pointst)/totHour);
		System.out.printf("GPA: %.2f",gpa);
			
	}
	

}
