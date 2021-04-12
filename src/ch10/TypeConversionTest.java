package ch10;

public class TypeConversionTest {

	public static void main(String[] args) {
		
		int iNum = 255;
		byte bNum = (byte) iNum;
		
		System.out.println(iNum);
		System.out.println(bNum);
		
		double dNum = 3.14;
		int inum = (int) dNum;
		
		System.out.println(inum);
		
		double dNum2 = 1.2;
		float fNum = 0.9f;
		
		int iNum1 = (int)dNum2 + (int)fNum; // 1+0
		int iNum2 = (int) (dNum2 + fNum); // 2.1
		
		System.out.println(iNum1);
		System.out.println(iNum2);
		
		int myNum = 10;
		int yourNum = 20;
		
		myNum = myNum +yourNum;
		System.out.println(myNum);
		
		myNum += yourNum;
		System.out.println(myNum);
	}
}
