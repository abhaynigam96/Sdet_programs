package package1;

public class Arithmetic {
	
	public int sum(int a, int b)
	{
		int c1 = a+b;
		System.out.println("sum1 = " +c1 );
		return c1;
	}
	
	public int sub(int a, int b)
	{
		int c2 = a-b;
		System.out.println("sub = " +c2 );
		return c2;
	}
	
	public int mul(int a, int b)
	{
		int c3 = a*b;
		System.out.println("mul = " +c3 );
		return c3;
	}
	
	public void div(int a, int b)
	{
		float c4 = a/b;
		System.out.println("div = " +c4 );
	}
	
		
	public static void main(String[] args) {
		
		Arithmetic ar = new Arithmetic();
		
	 
		int sum1 = ar.sum(10, 2);
		int sum2 = sum1+2;
		System.out.println("sum2 = "+sum2);
		int sub =  ar.sub(sum2, 2);
		int mul =  ar.mul(sub, 2);
		ar.div(mul, 2);
	
	}
}
