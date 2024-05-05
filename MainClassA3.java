class Author
{
	public static void writeStory()
	{
		System.out.println("Write story...");
	}
	public void reviewStory()
	{
		System.out.println("reviewStory..");
	}
}
class Books
{
	public static void holdStory()
	{
		Author.writeStory();
		System.out.println("hold story..");

	}
	public void navigatePage()
	{
		System.out.println("naviagtePage...");
		Author a1 = new Author();
		a1.reviewStory();
	}
}
class MainClassA3 
{
	public static void main(String[] args) 
	{
		Books.holdStory();
		Books b1 = new Books();
		b1.navigatePage();

	}
}
