import java.util.ArrayList;
public class CodingQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<MenuItem> items = new ArrayList<>();
		items.add(new Beverage("Hot coffee", Beverage.LARGE, 2.25));
		items.add(new Food("Muffin", 1.15));
		items.add(new Beverage("Bottled water", Beverage.SMALL, 2.95));
		items.add(new Food("Black and white cookie", 1.75));
		for(MenuItem g : items) {
			System.out.println("Item: " + g +", Cost: $"+g.getPrice());
		}
	}
}
