package warmup;

import java.util.Scanner;

public class SolveMeSecond {
	static int solveMeSecond(int a, int b) {
        return a+b;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		int sum=0;
		int a,b;
		for(int i=0;i<t;i++){
			a=in.nextInt();
			b=in.nextInt();
			sum=solveMeSecond(a,b);
			System.out.println(sum);
			
		}

	}

}
