package Task6;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value");
int a = sc.nextInt();
for (int i = a; i > 0; i--) 
{
    for (int spc = a - i; spc > 0; spc--) 
    {
        System.out.print(" ");
    }
    for (int j = 0; j < i; j++) 
    {
        System.out.print("*");
    }
    System.out.println();
}
}

}
