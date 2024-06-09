
class Interface
{
	public static void main(String[] args)
	{
		C b=new C();
		b.M1();
		b.M2();
		b.M3();
		b.M4();
	}
}

interface A
{
	public abstract void M1();
	public abstract void M2();
	public abstract void M3();

}
interface B extends A
{
	public abstract void M4();
}

class C implements B
{
	public void M1()
	{
		System.out.println("Java");
	}
	public void M2()
	{
		System.out.println("HTML");
	}
	public void M3()
	{
		System.out.println("CSS");
	}
	public void M4()
	{
		System.out.println("CSS");
	}
}
