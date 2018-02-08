class NanoTime {
	public static void main(String[] args){
		long startTime = System.nanoTime();
		
		int itTen = iterativeFactorial(10);
		long estimatedTime = System.nanoTime() - startTime;
		System.out.println("the iterativeFactorial of 10 is: " + itTen + ". time to calculate:" + estimatedTime);
		
		int recTen = recursiveFactorial(10);
		long estimatedTime2 = System.nanoTime() - startTime - estimatedTime;
		System.out.println("the recursiveFactorial of 10 is: " + recTen + ". time to calculate:" + estimatedTime2);
		
		int fibItTen = iterativeFib(10);
		long estimatedTime3 = System.nanoTime() - startTime - estimatedTime - estimatedTime2;
		System.out.println("the iterativeFib of 10 is: " + fibItTen + ". time to calculate:" + estimatedTime3);
		
		int fibRecTen = recursiveFib(10);
		long estimatedTime4 = System.nanoTime() - startTime - estimatedTime - estimatedTime2 - estimatedTime3;
		System.out.println("the recursiveFib of 10 is: " + fibRecTen + ". time to calculate:" + estimatedTime4);
	
		System.out.println("\nAfter looking at the average times of each method, it seems like the shorter time it takes to calculate, the less variance in the time it will take to calculate.");
	}
	public static int iterativeFactorial(int i){
		int product = 1;
		for (int j = 1; j <= i; j++){
			product *= j;
		}
		return product;
	}
	public static int recursiveFactorial(int i){
		if (i == 0){
			return 1;
		}else{
			return i * recursiveFactorial(i-1);
		}
	}
	public static int iterativeFib(int i){
		int one = 0, two = 1, three = 1;
        for (int j = 0; j < i; j++) {
            one = two;
            two = three;
            three = one + two;
        }
        return one;
	}
	public static int recursiveFib(int i){
		if (i < 2) {
			return i;
        }
        else {
			return recursiveFib(i-1)+recursiveFib(i-2);
        }
	}
	
	
}