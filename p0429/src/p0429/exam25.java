package p0429;

import java.util.Scanner;

public class exam25 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		System.out.print("몇 개의 *를 표시할까요?:");
		int num1=s.nextInt();
		if(num1>=1){
		
			for(int i=1;i<=num1;i++){
			
			System.out.print("*");
		}	
			System.out.print("\n");}
		

	}

}
