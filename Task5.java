package Task6;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a,b,c;
		   System.out.print("Input number of rows (half of the diamond) : ");
		   Scanner in = new Scanner(System.in);
				    c = in.nextInt();
		   for(a=0;a<=c;a++)
		   {
		     for(b=1;b<=c-a;b++)
		     System.out.print(" ");
		     for(b=1;b<=2*a-1;b++)
		       System.out.print("*");
		     System.out.print("\n");
		   }
		 
		   for(b=c-1;a>=1;a--)
		   {
		     for(b=1;b<=c-a;b++)
		     System.out.print(" ");
		     for(b=1;b<=2*a-1;b++)
		       System.out.print("*");
		     System.out.print("\n");
		   }
		 

}
}