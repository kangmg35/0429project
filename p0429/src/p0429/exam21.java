package p0429;

import java.util.Scanner;

public class exam21 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("정수 a:");
		int num1=s.nextInt();
		System.out.print("정수 b:");
		int num2=s.nextInt();
		if(num1>num2){
		System.out.printf("두 값의 차는 %d입니다.",num1-num2);}
		else if(num1<num2){
		System.out.printf("두 값의 차는 %d입니다.",num2-num1);}	
		}
		

	}


