class Student
{
	public void takeExam()
	{
		System.out.println("exam..");
		Classroom c1 = new Classroom();
		c1.calculateAverageScore();

	}
	public void submitAssignemnt()
	{
		System.out.println("submit assignment..");
	}
}
class Classroom
{
	public void calculateAverageScore()
	{
		Student s1 = new Student();
		s1.submitAssignemnt();
		System.out.println("cal avg score..");

	}
	public void conductDiscussion()
	{
		System.out.println("discusiion..");
	}
}
class MainClassA5
{
	public static void main(String[] args) 
	{
		Student s2 = new Student();
		s2.takeExam();
		
	}
}
