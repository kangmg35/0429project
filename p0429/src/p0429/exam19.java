package p0429;

import java.util.Scanner;

public class exam19 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("점수: ");
		int num1=s.nextInt();
		
		if(num1<=100&&num1>=80){
			System.out.print("수");}
			else if(num1<=79&&num1>=70){
				System.out.print("우");}
			else if(num1<=69&&num1>=60){
				System.out.print("미");}
			else if(num1<=59&&num1>=50){
				System.out.print("양");}
			else if(num1<=49&&num1>=0){
				System.out.print("가");}
			else{
				System.out.print("잘 못된 점수입니다.");
				}

	}

}
