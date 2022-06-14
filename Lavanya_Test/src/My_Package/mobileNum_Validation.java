package My_Package;
import java.util.*;
public class mobileNum_Validation {
	public static void main(String[] args) {

		System.out.println("Enter mobile number to check whether it is number or not?");
		Scanner scan =new Scanner(System.in);
		long phoneNumber=scan.nextLong();

		if(phoneNumber>=6000000000L && phoneNumber<=9999999999L)
		System.out.println("Your phone number is valid in India");
		else
		System.out.println("Invalid Phone Number");

		}

}
