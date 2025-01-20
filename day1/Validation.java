package day1;
import java.util.*;
import java.util.regex.Pattern;
public class Validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Date now=new Date();
		System.out.println("Enter Name");
		while(true) {
			String name=sc.nextLine();			
			if(Pattern.matches("^[a-zA-Z0-9]+$", name)) {
				System.out.println("Accepted");
				break;
			}
			else {
				System.out.println("Invalid Format Reenter name");
			}
		}
		System.out.println("Enter Email");
		while(true) {
		String email=sc.nextLine();
		if(Pattern.matches("^[a-zA-Z0-9_%+-]+@[a-z]+\\.[a-z]{2,}$", email)) {
			System.out.println("Accepted");
			break;
		}
		else {
			System.out.println("Invalid Format Re Enter Email");
		}
		}
		while(true) {
			System.out.print("Date Format:(DD-MM-YYYY)");
			String date=sc.nextLine();			
		if(Pattern.matches("^(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[012])-((19|2[0-9])[0-9]{2})$", date)) {
			System.out.print("Accepted");
			break;
		}
		else {
			System.out.print("Invalid Format");
		}
		}
	}

}
