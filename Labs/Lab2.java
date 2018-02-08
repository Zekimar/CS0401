class Hello { 
	public static void main (String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Please Enter a weight that you would like to convert: ");
		double weight = input.nextDouble();
		System.out.println("Here is that weight on other planets: ");
		System.out.println("Mercury: " + weight * 0.38 + " lbs");
		System.out.println("Venus: " + weight * 0.91 + " lbs");
		System.out.println("Mars: " + weight * 0.38 + " lbs");
		System.out.println("Jupiter: " + weight * 2.54 + " lbs");
		System.out.println("Saturn: " + weight * 1.08 + " lbs");
		System.out.println("Uranus: " + weight * 0.91 + " lbs");
		System.out.println("Neptune: " + weight * 1.19 + " lbs");
		input.close();
		}
	}