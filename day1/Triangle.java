package day1;
import java.util.*;
public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=n-i-1;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<(2*i)+1;k++) {
				System.out.print("*");
			}
			for(int j=n-i-1;j>0;j--) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
