package Task6;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int day=sc.nextInt();
switch(day) {
case 1:
	int day1=1;
	System.out.println("Sunday");
	break;
case 2:
	int day2=2;
	System.out.println("Monday");
	break;
case 3:
	int day3=3;
	System.out.println("Wednesday");
	break;
case 4:
	int day4=4;
	System.out.println("Thursday");
	break;
case 5:
	int day5=5;
	System.out.println("Friday");
	break;
case 6:
	int day6=6;
	System.out.println("Saturday");
	break;
case 7:
	int day7=7;
	System.out.println("Sunday");
	break;
default:
	System.out.println("Invalid Operation");
	break;
}
	}

}
