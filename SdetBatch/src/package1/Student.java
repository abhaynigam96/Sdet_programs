package package1;

public class Student {

	int rollNo= 10;
	int age = 20;
	
	public void display1()
	{
		System.out.println("Welcome to all of you");
	}
	public void display2()
	{
		System.out.println("Automation is very easy");
	}
	
	public static void main(String[] args) {
		Student st = new Student();
		System.out.println(st.rollNo);
		System.out.println(st.age);
		st.display1();
		st.display2();
		st.rollNo = 20;
		System.out.println(st.rollNo);
		st.age = 50;
		System.out.println(st.age);
	}
	
}
