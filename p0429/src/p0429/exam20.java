package p0429;

import java.util.Scanner;

public class exam20 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("실수 a: ");
		float num1=s.nextFloat();
		System.out.print("실수 b: ");
		float num2=s.nextFloat();
		
		if(num1>num2){
			System.out.printf("큰 쪽의 값은 %.1f입니다",num1);}
		else
			System.out.printf("큰 쪽의 값은 %.1f입니다",num2);}
		
	}


