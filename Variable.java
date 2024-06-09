class Variable
{
	static int y=20;
	int z=25;
	String name= "sandy";
	public static void main(String[] args)
	{
		int x=10;
		System.out.println(x);
		System.out.println("x");
		Variable s=new Variable();//Object
		System.out.println(s.z);//Instance variable can be print by using object
                System.out.println(Variable.y);//Static	can be print by using classname is most preferable
		System.out.println(s.y);//static variable can be print by using object also but this way is not recomended
		System.out.println(s.name);
		
	}

}