package day1;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
        for(int i=0;i<n.length()/2;i++){
            if(n.charAt(i)!=n.charAt(n.length()-i-1)) {
            	System.out.print(false);
            	return ;
            }
        }
        System.out.print(true);
	}

}
