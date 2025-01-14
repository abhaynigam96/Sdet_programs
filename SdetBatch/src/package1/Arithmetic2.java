package package1;

public class Arithmetic2 {
	
	public int mul(int a, int b)
	{
		int c = a*b;
		System.out.println("mul = "+c);
		return c;
	}
	public int sub(int a, int b)
	{
		int c = a-b;
		System.out.println("sub = "+c);
		return c;
	}
	public int sum(int a, int b)
	{
		int c= a+b;
		System.out.println("sum = "+c);
		return c;
	}
	public void div(int a, int b)
	{
		int c = a/b;
		System.out.println("Final result is = "+c);
	}
	
	public static void main(String[] args) {
		
		Arithmetic2 ar = new Arithmetic2();
		int result1 = ar.mul(10, 2);
		int result2 = ar.sub(result1, 2);
		int result3 = ar.sum(result2, 2);
		int result4 = ar.sub(result3, 2);
		ar.div(result4, 2);
		
	}

}
