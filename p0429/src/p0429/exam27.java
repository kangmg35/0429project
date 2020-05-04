package p0429;

import java.util.Scanner;

public class exam27 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("몇 개의 * 를 표시할까요?:");
		int num1=s.nextInt();
		int i=1;
		if(num1>=1){
		do{
			System.out.print("*");
			i++;}
		while(i<=num1);	
	} System.out.print("\n");}
}
	
	


