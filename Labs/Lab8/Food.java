public class Food extends MenuItem{
	public Food(String name, double price){
		setName(name);
		setPrice(price);
	}
	public String toString(){
		return getName();
	}
}
