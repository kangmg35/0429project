package p0429;

import java.util.Scanner;

public class exam29 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num1;
		int i=1;
		int sum=1;
		System.out.print("양의 정숫값 : ");
		num1=s.nextInt();
		do{	
			sum=sum*i;
			i++;
		}while(i<=num1);
		System.out.printf("1부터 %d까지의 곱은 %d입니다.",num1,sum);
		
	
	
	
	
	}

	}


