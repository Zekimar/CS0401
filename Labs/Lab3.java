public class Lab3 {
	public static void main (String[] args) {
		System.out.println("Welcome to Rock, Paper, Scissors");
		System.out.println("What is your choice?");
		System.out.println("1. Rock");
		System.out.println("2. Paper");
		System.out.println("3. Scissors");
		System.out.print("What is your choice? ");
		java.util.Scanner input = new java.util.Scanner(System.in);
		int choice = input.nextInt();
		int roll = (int)(Math.random() * 3) + 1;
		if (roll == 1){
			System.out.println("The computer chose Rock.");
		}else if (roll == 2){
			System.out.println("The computer chose Paper.");
		}else if (roll == 3){
			System.out.println("The computer chose Scissors.");
		}
		if (roll == choice) {
			System.out.println("It is a tie");
		}else if (roll == 1){
			if (choice == 2) {
				System.out.println("You win!");
			}else if (choice == 3) {
				System.out.println("You lose!");
			}
		}else if (roll == 2) {
			if (choice == 1) {
				System.out.println("You lose!");
			}else if (choice == 3){
				System.out.println("You win!");
			}
		}else if (roll == 3){
			if (choice == 1){
				System.out.println("You win!");
			}else if (choice == 2){
				System.out.println("You lose!");
			}
		}else {
			System.out.println("error. ");
		}
		input.close();
		
	}
}
