package p0429;

import java.util.Scanner;

public class exam15 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("변수 a:");
		int num1=s.nextInt();
		System.out.print("변수 b:");
		int num2=s.nextInt();
		
		if(num1>num2){
			System.out.print("a가 크다.");}
		else if(num1<num2){
			System.out.printf("b가 크다");}
		else{
			System.out.print("a와b가 같다.");
			
		}
		
		}

	}


