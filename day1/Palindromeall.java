package day1;
import java.util.Scanner;
public class Palindromeall {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			String num=String.valueOf(i);
			boolean check=true;
			for(int j=0;j<num.length()/2;j++) {
				if(num.charAt(j)!=num.charAt(num.length()-j-1)) {
					check=false;
					break;
				}
			}
			if(check) System.out.println(i);
		}
	}
}
