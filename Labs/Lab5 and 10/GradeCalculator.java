import java.util.Scanner;
import java.io.*;
public class GradeCalculator {
	public static void main(String[] args) {
		CS401 myGrades = new CS401();
		boolean enteredGrades = false;
		double lowestLab = 0;
		double lowestLabReplacement = 50;
		double totalLabGrade = 0;
		while (true) {
			java.util.Scanner input = new java.util.Scanner(System.in);
			System.out.println("--------------------------------------");
			System.out.println("Welcome to the CS401 Grade Calculator!");
			System.out.println("\t1) Enter in your grades");
			System.out.println("\t2) Compute your overall grades");
			System.out.println("\t3) Calculate the final exam score necessary to get a certain grade");
			System.out.print("What would you like to choose? ");
			int choice = input.nextInt();
			if (choice == 1){
				System.out.print("\nEnter Midterm 1 Grade: ");
				myGrades.firstMidTerm = input.nextDouble();
				System.out.print("\nEnter Midterm 2 Grade: ");
				myGrades.secondMidTerm = input.nextDouble();
				System.out.print("\nEnter Final Exam Grade: ");
				myGrades.finalExam = input.nextDouble();
				System.out.print("\nEnter Project 1 Grade: ");
				myGrades.firstProject = input.nextDouble();
				System.out.print("\nEnter Project 2 Grade: ");
				myGrades.secondProject = input.nextDouble();
				System.out.print("\nEnter Project 3 Grade: ");
				myGrades.thirdProject = input.nextDouble();
				System.out.print("\nEnter Project 4 Grade: ");
				myGrades.fourthProject = input.nextDouble();
				System.out.print("\nEnter Project 5 Grade: ");
				myGrades.fifthProject = input.nextDouble();
				System.out.print("\nEnter Participation Grade: ");
				myGrades.participationGrade = input.nextDouble();
				System.out.print("\nHow many graded labs and quizzes are there in total?");
				int numberOfLabs = input.nextInt();
				for (int i = 0; i < numberOfLabs; i++ ){
					System.out.println("What is the grade of the lab?");
					double labGrade = input.nextDouble();
					myGrades.labAndQuiz += labGrade;
					if (lowestLab == 0){
						lowestLab = labGrade;
					}else if (lowestLab > labGrade){
						lowestLab = labGrade;
					}
				}myGrades.labAndQuiz = myGrades.labAndQuiz - lowestLab + lowestLabReplacement;
				myGrades.labAndQuiz = (myGrades.labAndQuiz / numberOfLabs) * 2;
				enteredGrades = true;
				
			}else if (choice == 2){
				Scanner s;
				try{
					File f = new File(args[0]);
					s = new Scanner(f);
					myGrades.firstMidTerm = s.nextDouble();
					myGrades.secondMidTerm = s.nextDouble();
					myGrades.finalExam = s.nextDouble();
					myGrades.firstProject = s.nextDouble();
					myGrades.secondProject = s.nextDouble();
					myGrades.thirdProject = s.nextDouble();
					myGrades.fourthProject = s.nextDouble();
					myGrades.fifthProject = s.nextDouble();
					myGrades.labAndQuiz = s.nextDouble();
					myGrades.participationGrade = s.nextDouble();
					getGrade(myGrades);
					System.out.println("successfully computed final grade and wrote to new file");
					File outfile = new File("grades-2164.txt");
					PrintWriter pw = new PrintWriter(outfile);
					pw.println(myGrades.finalGrade);
					pw.close();
					System.exit(1);
				}catch(FileNotFoundException fnfe){
					fnfe.printStackTrace();
					System.out.println("File not found! use command line argument for file");
					System.exit(0);
				}
			}else if (choice == 3){
				if (enteredGrades == false){
					System.out.println("You need to Enter Grades first!");
					continue;
				}else{
					System.out.print("What overall grade would you desire? What you need to get on the final exam will be calculated: ");
					double desiredGrade = input.nextDouble();
					calculateFinalGrade(myGrades, desiredGrade);
					System.out.println("Your required Final grade to get a(n) " + desiredGrade + " is " + myGrades.neededFinalGrade);
				}
			}else{
				System.out.println("Error.");
			}
		}		
		}	
	public static double getGrade (CS401 myGrades){
		// not multiplying the actual variable ensures that you can do both options 2 and 3 accurately
		double a = myGrades.firstMidTerm * .15;
		double b = myGrades.secondMidTerm * .15;
		double c = myGrades.finalExam * .15;
		double d = myGrades.firstProject * .08;
		double e = myGrades.secondProject * .08;
		double f = myGrades.thirdProject * .08;
		double g = myGrades.fourthProject * .08;
		double h = myGrades.fifthProject * .08;
		double i = myGrades.participationGrade * .05;
		double j = myGrades.labAndQuiz * .10;
		myGrades.finalGrade = a + b + c + d + e + f + g + h + i + j;
		return (myGrades.finalGrade);
	}
	public static double calculateFinalGrade (CS401 myGrades, double desiredGrade) {
		// not multiplying the actual variable ensures that you can do both options 2 and 3 accurately
		double a = myGrades.firstMidTerm * .15;
		double b = myGrades.secondMidTerm * .15;
		double c = myGrades.firstProject * .08;
		double d = myGrades.secondProject * .08;
		double e = myGrades.thirdProject * .08;
		double f = myGrades.fourthProject * .08;
		double g = myGrades.fifthProject * .08;
		double h = myGrades.participationGrade * .05;
		double i = myGrades.labAndQuiz * .10;
		double gradeSoFar = a + b + c + d + e + f + g + h + i;
		myGrades.neededFinalGrade = (desiredGrade - gradeSoFar) / (0.15);
		return (myGrades.neededFinalGrade);
	}
}