package day1;
import java.util.*;

public class Words {
	public static String converttowordrec(int n,String[] strings,int[] numbers) {
		String res="";
		for(int i=0;i<numbers.length;i++) {
			String word=strings[i];
			int number=numbers[i];
			if(n>=number) {
				if(n>=100) {
					res+=converttowordrec(n/number,strings,numbers);
				}
				res+=word;
				if(n%number>0) res+=" "+converttowordrec(n%number,strings,numbers);
				return res;
			}
			
		}
		return res;
	}
	public static String converttoword(int n) {
		if(n==0) 
		return "Zero";
		String[] strings= {"Billion","Million","Thousand","Hundred","Ninety","Eighty","Seventy","Sixty","Fifty","Forty","Thirty","Twenty","Ten","Nine","Eight","Seven","Six","Five","Four","Three","Two","One"};
		int[] numbers= {1000000000,1000000,1000,100,90,80,70,60,50,40,30,20,10,9,8,7,6,5,4,3,2,1};
		return converttowordrec(n,strings,numbers);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(converttoword(n));
		
	}
}
