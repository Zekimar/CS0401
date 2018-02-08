import java.util.Scanner;
public class lab4 {
	public static int flipCoin(){
		int flip = (int)(Math.random() * 2) + 1;
		return flip;
	}
	public static void main(String[] args){
		System.out.println("Welcome to the Coin Flip Simulator!");
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("How many flips would you like? ");
		int numberOfTimes = input.nextInt();
		int numberOfHeads = 0;
		int numberOfTails = 0;
		int consecutiveHeads = 0;
		int consecutiveTails = 0;
		int highestHeads = 0;
		int highestTails = 0;
		for (int i = 0; i < numberOfTimes; i++){
			int a = flipCoin();
			if (a == 1) {
				numberOfHeads++;
				consecutiveHeads++;
				if (consecutiveTails > 0){
					highestTails = consecutiveTails;
					consecutiveTails = 0;
				}
			}else if (a == 2){
				numberOfTails++;
				consecutiveTails++;
				if (consecutiveHeads > 0){
					highestHeads = consecutiveHeads;
					consecutiveHeads = 0;
				}
				
			} 
		}System.out.println("Statistics:");	
		System.out.println("---------------------");
		System.out.println("Heads\t" + numberOfHeads);
		System.out.println("Tails\t" + numberOfTails);
		System.out.println("Longest Run of Heads\t" + highestHeads);
		System.out.println("Longest Run of Tails\t" + highestTails);
		
		
		
		
	}
	
	
	
}