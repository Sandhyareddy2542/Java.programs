class Overloading
{
	public static void main(String[] args)
	{
		Over L=new Over();
		L.M1(14);
		L.M1(10,"sans");
		L.M1(21.2,29.9f);
	}
}
class Over
{
	public void M1(int x)
	{
		System.out.println("hi");
	}
	public void M1(int x,String name)
	{
		System.out.println("hello");
	}
	public void M1(double x,float s)
	{
		System.out.println("sandy");
	}

}
