package p0429;

import java.util.Scanner;

public class exam13 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("변수 A:");
		int num1=s.nextInt();
		System.out.print("변수 B:");
		int num2=s.nextInt();
		
		if(num1%num2==0){
			System.out.printf("%d는 %d의 약수힙니다.\n",num2,num1);}
		else
			System.out.printf("%d는 %d의 약수가 아닙니다.",num2,num1);}
		

	}


