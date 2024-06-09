class Inheritance
{
	public static void main(String[] args)
	{
		A a=new A();
		a.M1();
		B b=new B();
		b.M3();
		b.M4();
		b.M2();
	}
}
class A
{
	public void M1()
	{
		System.out.println("hi");
	}
	public void M2()
	{
		System.out.println("hello");
	}

}
class B extends A
{
	public void M3()
	{
		System.out.println("Myself");
	}
	public void M4()
	{
		System.out.println("Java");
	}

}


