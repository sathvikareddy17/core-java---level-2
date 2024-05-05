class Mobile 
{
	public void storePower()
	{
		System.out.println("store power..");
	}
}

class Charger
{
	public void providePower()
	{
		System.out.println("provide power..");
	}
}

class MainClassA2
{
	public static void main(String[] args) 
	{
		Mobile m1 = new Mobile();
		m1.storePower();

		Charger m2 = new Charger();
		m2.providePower();
	}
}