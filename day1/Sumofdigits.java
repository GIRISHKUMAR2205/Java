package day1;
import java.util.*;
public class Sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String num=String.valueOf(n);
        int sum=0;
        for(int i=0;i<num.length();i++){
            sum+=Integer.valueOf(num.charAt(i))-'0';
        }
        System.out.println(sum);

	}

}
