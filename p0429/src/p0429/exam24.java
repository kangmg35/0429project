package p0429;

import java.util.Scanner;

public class exam24 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("몇 월입니까?");
		int num1=s.nextInt();
		
		switch(num1){
		case 3:
		case 4:
		case 5:System.out.print("봄");
		break;
		case 6:
		case 7:
		case 8:System.out.print("여름");
		break;
		case 9:
		case 10:
		case 11:System.out.print("가을");
		break;
		case 12:
		case 1:
		case 2:System.out.print("겨울");
		break;
		}
	}

}
