package day1;
import java.util.Scanner;

public class Allarmstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int temp=i;
			String num=String.valueOf(i);
			int sum=0;
			while(temp>0) {
				int rem=temp%10;
				sum+=Math.pow(rem, num.length());
				temp/=10;
			}
			if(sum==i)System.out.println(sum);
		}
	}

}
