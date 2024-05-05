class Libary
{
	public void borrowBook()
	{
		System.out.println("Borrowbook...");
		Books b1 = new Books();
		b1.displayDetails();

	}
	public void returnBook()
	{
		System.out.println("returnBook..");
	}
	public void checkAvailabilty()
	{
		System.out.println("checkAvailabilty..");
	}
}
class Books
{
	public static void displayDetails()
	{
		System.out.println("displayDetails..");
		Libary l1 = new Libary();
		l1.checkAvailabilty();
	}
	public void reserveBook()
	{
		System.out.println("reservebook..");
		//reserveBook();
	}
}
class MainClassA6 
{
	public static void main(String[] args) 
	{
		Libary l2 = new Libary();
		l2.borrowBook();
		Books b2 = new Books();
		b2.reserveBook();
	}
}
