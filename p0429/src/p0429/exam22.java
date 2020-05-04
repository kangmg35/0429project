package p0429;

import java.util.Scanner;

public class exam22 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		System.out.print("정수 a:");
		int num1=s.nextInt();
		System.out.print("정수 b:");
		int num2=s.nextInt();
		System.out.print("정수 c:");
		int num3=s.nextInt();
		
		if(num1<num2&& num1<num3){
			System.out.printf("최솟값은 %d입니다.",num1);}
			else if(num2<num1 && num2<num3){
				System.out.printf("최솟값은 %d입니다.",num2);}
			else if (num3<num1 && num3<num2){
				System.out.printf("최솟값은 %d입니다.",num3);}
			//else{
			//System.out.print("세 정수가 같습니다.");}
			}
		}

	


