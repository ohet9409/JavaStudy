package ch13;

import java.util.Scanner;

public class ConitionTest {

	public static void main(String[] args) {
		
		int max;
		
		System.out.println("두 수를 입력 받아서 더 큰 수를 출력하세요\n");
		
		Scanner scanner = new Scanner(System.in);	// 입력을 받기 위해 선언
		
		System.out.println("입력 1: ");
		int num1 = scanner.nextInt();				// 정수형 입력
		
		System.out.println("입력 2: ");
		int num2 = scanner.nextInt();				// 정수형 입력
		
		max = (num1 > num2) ? num1 : num2;			// true면 num1 출력, false면 num2 출력
				
		System.out.println(max);
	}
}
