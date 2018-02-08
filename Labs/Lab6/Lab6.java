public class Lab6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//create object here so it can be accessed in all loops
	Circle Bob = new Circle();
	//first loop that creates circle and continues to next loop or exits
	while (true){
		System.out.println("Welcome to the Circle Calculator!");
		System.out.println("Options: \n1. Calculate using Unit Circle\n2. Calculate using Custom Circle\n3. Exit Program");
		java.util.Scanner input = new java.util.Scanner(System.in);
		int choice = input.nextInt();
		if (choice == 2){
			System.out.println("What will the radius be?");
			int radius = input.nextInt();
			System.out.println("What will the x-coordinate of the center be?");
			int originX = input.nextInt();
			System.out.println("What will the y-coordinate of the center be?");
			int originY = input.nextInt();
			Bob = new Circle(radius, originX, originY);
		}else if (choice == 3){
			break;
		}
		// second loop where user can update circle/distance formula/display center,radius,area,circumference
		while (true){
		System.out.println("---------------------------------------------");
		System.out.println("Select an Action: \n1. Update Circle data\n2. Determine if a point is inside a circle\n3. Display the Circle's Data.\n4. Go back");
		java.util.Scanner input2 = new java.util.Scanner(System.in);
		int choice2 = input.nextInt();
		if (choice2 == 1){
			System.out.println("What is the desired radius?");
			int radius = input2.nextInt();
			Bob.setRadius(radius);
			System.out.println("What is the desired x-coordinate of the center?");
			int originX = input2.nextInt();
			Bob.setOriginX(originX);
			System.out.println("What is the desired x-coordinate of the center?");
			int originY = input2.nextInt();
			Bob.setOriginY(originY);
		}else if (choice2 == 2){
			System.out.println("What is the desired x-coordinate of the point?");
			int x = input2.nextInt();
			System.out.println("What is the desired y-coordinate of the point?");
			int y = input2.nextInt();
			if (Bob.isInsideCircle(x, y) == true){
				System.out.println("The point is inside the circle.");
			}else if (Bob.isInsideCircle(x, y) == false){
				System.out.println("The point is not inside the circle.");
			}
		}else if (choice2 == 3){
			System.out.println("The center of the circle is: (" + Bob.getOriginX() + "," + Bob.getOriginY() + ")");
			System.out.println("The circle's radius is: " + Bob.getRadius());
			Bob.getArea(Bob.getRadius());
			Bob.getCircumference(Bob.getRadius());
		}else if (choice2 == 4){
			break;
			}	
		}
		}
	}
}
