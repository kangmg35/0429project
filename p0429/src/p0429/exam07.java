package p0429;

import java.util.Scanner;

public class exam07 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		System.out.print("x값 : ");
		float x=s.nextFloat();
		System.out.print("y값 : ");
		float y=s.nextFloat();
		System.out.printf("합계는 %.2f입니다.\n",x+y);
		System.out.printf("평균은 %.3f입니다.",(x+y)/2);
	}

}
