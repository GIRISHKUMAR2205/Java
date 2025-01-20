package day1;
import java.util.*;

public class Floyd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=1;
        for (int i = 1; i <= n; i++) {
            // Print each row
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " "); // Print the current number
                num++; // Increment to the next number
            }
            System.out.println(); // Move to the next line after each row
        }
	}
}
