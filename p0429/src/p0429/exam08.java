package p0429;

import java.util.Scanner;

public class exam08 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("삼각형의 넓이를 구합니다.");
		float num1;
		float num2;
		System.out.print("밑변  :  ");
		num1=s.nextFloat();
		System.out.print("높이 :  ");
		num2=s.nextFloat();
		System.out.printf("넓이는 %.3f입니다.",(num1*num2)/2);
		
				
		
		
		

	}

}
