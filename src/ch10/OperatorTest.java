package ch10;

public class OperatorTest {

	public static void main(String[] args) {
		
		int gameScore = 150;
		
		int lastScore = ++gameScore;   //gameScore +=1; gameScore = gameScore + 1;
		
		System.out.println(gameScore);
		System.out.println(lastScore);
		
	    lastScore = gameScore++;
	    System.out.println(gameScore);
	    System.out.println(lastScore);
	}
}
