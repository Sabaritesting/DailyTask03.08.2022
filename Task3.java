package Task6;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); 
		 System.out.print("Input first floating­point number: "); 
		 double a = input.nextDouble(); 
		 System.out.print("Input second floating­point number: "); 
		 double b = input.nextDouble(); 
		 input.close(); 
		 if(Math.abs(a-b)<=0.01) {
			 System.out.println("The numbers remains same");
		 }
		 else {
			 System.out.println("The numbers are different");
		 }
	}

}
