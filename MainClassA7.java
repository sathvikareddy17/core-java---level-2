class MainClassA7
{
	public static void main(String[] args) 
	{		
		Store s4 = new Store();
		s4.sellProduct();
		Product.orderProduct();
		Category c2 = new Category();
		c2.categorizeProduct();

	}
}
class Store
{
	public void sellProduct()
	{
		System.out.println("sell product..");
		Product.displayDetails();
	}
	public void restockProduct()
	{
		System.out.println("restock product");

	}
	public void checkInventory()
	{
		System.out.println("checkInventory..");
	}
}
class Product 
{
	public static void displayDetails()
	{
		System.out.println("Display details..");
		Store s1 = new Store();
		s1.checkInventory();
	}
	public static void orderProduct()
	{
		System.out.println("orderProduct");
		Store s3 = new Store();
		s3.restockProduct();
	}
}
class Category
{
	public static void createCategory()
	{
		System.out.println("create cat");
		Store s3 = new Store();
		s3.sellProduct();

	}
	public void categorizeProduct()
	{
		System.out.println("cat prod..");
		Product.orderProduct();

	}

}