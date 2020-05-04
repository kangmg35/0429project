package p0429;

import java.util.Scanner;

public class exam30 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int num1;
		int sum;
		System.out.print("카운트다운 합니다.\n");
		System.out.print("양의 정숫값 : ");
		num1=s.nextInt();
		
		for(int i=0;i<num1;i++){
			sum=num1-i;
			System.out.printf("%d\n",sum);
			
			
		}
	}

}
