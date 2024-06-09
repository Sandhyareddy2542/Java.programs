class Abstract
{
	public static void main(String[] args)
	{
		B b=new B();
		b.M1();
		b.M2();
		b.M3();
		D d=new D();
		d.M4();
		d.M5();	
	}
}
abstract class A 
{
	public void M1()
	{
		System.out.println("HI");
	}
	public abstract void M2();
}
class B extends A
{
	public void M2()
	{
		System.out.println("Java");
	}
	public void M3()
	{
		System.out.println("CSS");
	}
}
abstract class C
{
	public void M4()
	{
		System.out.println("Hello");
	}
	public void M5()
	{
		System.out.println("HTML");
	}
}
class D extends C
{
	public void M6()
	{
	}
}

