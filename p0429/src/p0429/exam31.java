package p0429;

import java.util.Scanner;

public class exam31 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("1부터 n까지의 합을 구합니다. n의값: ");
		int num1=s.nextInt();
		int sum=0;
		
		for(int i=1;i<=num1;i++){
		sum=sum+i;
		}
		System.out.printf("1부터 %d까지의 합은 %d입니다.",num1,sum);
		
	}

}
