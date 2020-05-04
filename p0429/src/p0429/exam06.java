package p0429;

import java.util.Scanner;

public class exam06 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("정숫값 : ");
		int num1=s.nextInt();
		int num2=num1+10;
		int num3=num1-10;
		System.out.printf("10을 더한값은 %d입니다\n",num2);
		System.out.printf("10을 뺀 값은 %d입니다.",num3);
	}

}
