class Construct
{
	public static void main(String[] args)
	{
		C c=new C();
		c.m1();
	}
}
class A
{
	A()
	{	
		System.out.println("Hi");
	}
	{	
		System.out.println("HTML");
	}

}
class B extends A
{
	B(int x)
	{
		
		System.out.println("Hello");
	}
	B()
	{
		this(10);
		System.out.println("Java");
	}
	{
	
		System.out.println("CSS");
	}
}
class C extends B
{
	C()
	{
		System.out.println("Test");
	}
	public void m1()
	{
		System.out.println("Method");
	}

}