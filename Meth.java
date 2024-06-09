class Meth
{
	static int x=10;	
	public static void main(String[] args)
	{
		System.out.println(Meth.x);
		M1();
	}
	public static void M1()
	{
		System.out.println(x);
		Meth m=new Meth();
		m.M2();
	}
        public void M2()
	{
		Meth m=new Meth();
		System.out.println(m.x);	
	}

}
class Instance
{
	int S=25;
	int R=42;
	public static void main(String[] args)
	{
		int T=20;
		System.out.println(T);
		Instance m=new Instance();
		System.out.println(m.S);
		m.M1();
	}
	public void M1()
	{
		System.out.println(R);
		M2();
	}
	public void M2()
	{
		System.out.println(S);
	}

}


