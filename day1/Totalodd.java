package day1;

public class Totalodd {

	public static void main(String[] args) {
		int sum=0;
        for(int i=1;i<=100;i++){
            if(i%2!=0)
                sum+=1;
        }
        System.out.println(sum);
	}

}
