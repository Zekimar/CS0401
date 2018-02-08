package labs;

public class Circle {
	//the variables
	private int radius;
	private int originX;
	private int originY;
	//constructors
	public Circle(){
		radius = 1;
		originX = 0;
		originY = 0;
	}
	public Circle(int radius, int originX, int originY){
		this.radius = radius;
		this.originX = originX;
		this.originY = originY;
	}
	//accessors and mutators
	public int getRadius(){
		return radius;
	}
	public int setRadius(int i){
		radius = i;
		return radius;
	}
	public int getOriginX(){
		return originX;
	}
	public int getOriginY(){
		return originY;
	}
	public int setOriginX(int i){
		originX = i;
		return originX;
	}
	public int setOriginY(int i){
		originY = i;
		return originY;
	}
	// calculating area, circumference, and distance formula
	public double getArea(int r){
		double area = Math.PI * Math.pow(r, 2);
		System.out.println("The Area is: " + area);
		return area;
	}
	public double getCircumference(int r){
		double circumference = 2 * Math.PI * r;
		System.out.println("The Circumference is: " + circumference);
		return circumference;
	}
	public boolean isInsideCircle(int x, int y){
		double distance = Math.sqrt(Math.pow((x - originX), 2) + Math.pow((y - originY), 2));
		if (distance < radius){
			return true;
		}else{
			return false;
		}
	}
}
