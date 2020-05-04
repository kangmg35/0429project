package p0429;

import java.util.Scanner;

public class exam17 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("정숫값:");
		int num1=s.nextInt();
		
		if(num1%10==0){
			System.out.print("이 값은 10의 배수입니다.");}
			else{
				System.out.print("이 값은 10의 배수가 아닙니다.");
		}

	}

}
