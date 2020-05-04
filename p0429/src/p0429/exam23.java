package p0429;

import java.util.Scanner;

public class exam23 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("정수 a:");
		int num1=s.nextInt();
		System.out.print("정수 b:");
		int num2=s.nextInt();
		
		if(num1>num2){
			System.out.printf("작은값은 %d입니다.\n",num2);
			System.out.printf("큰 값은 %d입니다.\n",num1);}
		else if(num1<num2){
			System.out.printf("작은값은 %d입니다.\n",num1);
			System.out.printf("큰 값은 %d입니다.\n",num2);}
			else if(num1==num2){
				System.out.print("두 값이 같습니다.");}
				
			}
		

	}


