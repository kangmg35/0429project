package p0429;

import java.util.Scanner;

public class exam28 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int num1;
		
		
		do{
			System.out.print("세 자리의 정숫값:");
			num1=s.nextInt();
		}while(num1<100 ||num1>1000);
		System.out.printf("입력된 값은 %d입니다.",num1);
		
		
		
		
		

	}

}
