package Task6;

import java.io.File;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Year");
		int a=sc.nextInt();
		boolean x=(a%4==0);
		boolean y=(a%100==0);
		boolean z=((a%100==0)&&(a%400==0));
		if(x&&(y||z)) {
		System.out.println(a +"is leap year");	
		}
		else 
		{
		System.out.println(a+"is not leap year");
			}

}
}