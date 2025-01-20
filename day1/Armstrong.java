package day1;
import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		 String num=String.valueOf(n);
	        int temp=n;
	        int pow=num.length();
	        int sum=0;
	        while (n>0) {
	            int rem=n%10;
	            sum+=Math.pow(rem,pow);
	            n/=10;
	        }
	        System.out.println(sum == temp? true : false);
	}

}
