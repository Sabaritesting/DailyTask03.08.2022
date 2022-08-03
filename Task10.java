package Task6;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first  value");
		double a=sc.nextDouble();
		System.out.println("Enter the second value");
		double b=sc.nextDouble();
		System.out.println("Enter the third Value");
		double c=sc.nextDouble();
		if(a<b&&b<c) {
			System.out.println("It is in Incresing order");
		}
		else if(a>b&&b>c) {
			System.out.println("It is in decreasing order");
		}
		else {
			System.out.println("Neither Increasing nor Decreasing order");
		}
	}

}
