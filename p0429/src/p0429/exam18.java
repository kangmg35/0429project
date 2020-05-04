package p0429;

import java.util.Scanner;

public class exam18 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("정숫값:");
		int num1=s.nextInt();
		
		
			if(num1<0){
				System.out.print("양수가 아닌 값을 입력했습니다.");}
			else if(num1%3==0){
				System.out.print("이 값은 3으로 나누어집니다.");}
			else if(num1%3==1){
				System.out.print("이 값은 3으로 나눈 나머지는 1입니다.");}
			else if(num1%3==2){
				System.out.print("이 값은 3으로 나눈 나머지는 2입니다.");}
			
		
			}
		

	}


