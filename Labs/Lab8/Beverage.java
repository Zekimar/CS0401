public class Beverage extends MenuItem{
	static final int LARGE = 0;
	static final int SMALL = 1;
	public Beverage (String name, int size, double price){
		if (size == 0){
			name = "Large " + name;
		}else if (size == 1){
			name = "Small " + name;
		}
		setName(name);
		setPrice(price);
	}
	public String toString(){
		return getName();
	}
}
