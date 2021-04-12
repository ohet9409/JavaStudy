package ch18;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int input;
		
		int sum = 0;
		
		do {
			input = scanner.nextInt();
			sum += input;
			
			System.out.println("중간합계: " + sum);
		} while (input != 0 );
			
		
		System.out.println("최종합계: " + sum);
	}
}
