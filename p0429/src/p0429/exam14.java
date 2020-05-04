package p0429;

import java.util.Scanner;

public class exam14 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("정숫값:");
		int num1=s.nextInt();
			if(num1>0){
			System.out.print("값이 양수입니다.");}
			else if(num1==0){
				System.out.print("값이 0입니다.");}
			else{
				System.out.print("값이 음수입니다.");}
		}

	}


