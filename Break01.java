package String;

import java.util.Scanner;

public class Break01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = 0;
		int sum = 0;

		System.out.println("숫자 입력 : ");
		while (true) {

			num = input.nextInt();

			if (num > 0) {
				break;
			}
			System.out.println("0보다 큰 수를 입력하세요 : ");
		}
		////
		for (int i = 1; i <= num; i++) {
			sum += i;

		}
		System.out.print("1부터 " + num + "까지의 합 : " + sum);
	}
}