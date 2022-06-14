package My_Package;

import java.util.Scanner;

public class email {
	
	public static void main(String[] args) {
	System.out.println("Enter email to check whether it is email or not?");
	Scanner scan =new Scanner(System.in);
	String email=scan.next();
	int switchh=0;
	for(int i=2;i<email.length();i++)
	{
	   if(email.charAt(i)=='@') {
	   for(int j=i+1;j<email.length();j++)
	   {        //6
		   if(email.charAt(j)=='.')
		   {
			   switchh=1;
			   System.out.println("Valid Email ID");
			   break;
		   }	
	   }
	   										}
	}
	if(switchh==0)
	System.out.println("Invalid email ID");
	}
}
