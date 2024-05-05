class Books
{
	public static void openBook()
	{
		System.out.println("OpenBook");
	}
	public void storeContent()
	{
		System.out.println("StoreContent");
	}
}

class Author
{
    public static void createStory()
	{
		System.out.println("Createju Story");
		Books.openBook();
		Books b1 = new Books();
		b1.storeContent();
	}
}
class Publisher
{
	public void print()
	{
		System.out.println("print");
		Books.openBook();
		Books b2 = new Books();
		b2.storeContent();
	}
}
class MainClass1
{
	public static void main(String[]args)
	{
		System.out.println("Main starts..");
		Author.createStory();
		Publisher p1 = new Publisher();
		p1.print();
		System.out.println("Main ends..");
		
	}
}
