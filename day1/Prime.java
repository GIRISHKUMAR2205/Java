package day1;
import java.util.*;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=0;
		for(int i=1;i<=Math.sqrt(n);i++) {
			if(n%i==0)c++;
		}

		if(c!=1) {
			System.out.print("Not a Prime");
		}
		else {
			System.out.print("prime");
		}

	}

}
