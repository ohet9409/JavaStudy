package ch16;

import java.util.Scanner;

public class SwitchCaseTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();

		int day;
		int test = switch (month) {
	
			case 1, 3, 5, 7, 8, 10, 12 -> {
				day = 31;
				yield 31;
			}
	
			case 2 -> {
				day = 28;
				yield 28;
			}
	
			case 4, 6, 9, 11 -> {
				day = 30;
				yield 30;
			}
	
			default -> {
				System.out.println("�������� �ʴ� ���Դϴ�.");
				day = -1;
				yield -1;
			}
		};
		System.out.println(month + "���� " + day + "�� �Դϴ�.");
		System.out.println("���ο� ���� �׽�Ʈ ��: " + test);
	}
}
