package package1;

public class Studentcons {
	
	public Studentcons() 
	{	
		this(2,2,2);
		System.out.println("Default constructor");
		
	}
	public Studentcons(int a)
	{
		this();
		System.out.println("One parameterized constructor");
		
	}
	public Studentcons(int a, int b)
	{	
		this(1);
		System.out.println("two parameterized constructor");
		
	}
	public Studentcons(int a, int b, int c)
	{

		System.out.println("Three parameterized constructor");
		
	}
	public static void main(String[] args) {
			
		Studentcons Sc1 = new Studentcons(1,1);
		
		
	}

}
