class Overriding
{
	public static void main(String[] args)
	{
		Parent p=new Parent();
		p.M1();
		p.M2();
		Child c=new Child();
		c.M1();
		c.M3();
		c.M2();
		Parent p1=new Child();
		p1.M1();
		p1.M2();
	}
}
class Parent
{
	public void M1()
	{
		System.out.println("hi");
	}
	public void M2()
	{
		System.out.println("Hello");
	}
}
class Child extends Parent
{
	public void M2()
	{
		System.out.println("Java");
	}
	public void M3()
	{
		System.out.println("Python");
	}
}