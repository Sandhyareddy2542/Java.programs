class Constructor
{
	public static void main(String[] args)
	{
		A a=new A();
		B b=new B(10);
		B b1=new B("test");
	}
}
class A
{
	A()
	{	
		System.out.println("Hi");
	}
	A(int y)
	{	
		System.out.println("HTML");
	}

}
class B extends A
{
	B(int x)
	{
		this();
		System.out.println("Hello");
	}
	B()
	{
		System.out.println("Java");
	}
	B(String s)
	{
		super(20);
		System.out.println("CSS");
	}
}