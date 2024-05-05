class Circle
{
	public void calculateArea()
	{
		System.out.println("calculateArea");
	}
	public void calculateCircumference()
	{
		System.out.println("calculateCircumference");
		Calculator c1 = new Calculator();
		c1.findCube();
	}
}
class Calculator
{
	public void findSquare()
	{
		System.out.println("findsquare");
		Circle c1 = new Circle();
		c1.calculateArea();
	}
	public void findCube()
	{
		System.out.println("findcube");
	}
}
class MainClassA4 
{
	public static void main(String[] args) 
	{
		Calculator c2 = new Calculator();
		c2.findSquare();
		Circle c1 = new Circle();
		c1.calculateCircumference();
	}
}
