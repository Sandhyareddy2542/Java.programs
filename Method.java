//There are two types of methods:
//1.Static method    :method which contains static keyword is called static method 
                      and in static method we can access another static methods by 
                      simply using method name. In general we using class name to called a static method or variable. 
//2.Instance method :this method doesn't contain static keyword. 
                      In this we can access the another instance method by using its method name. 
                      In general,we create and use one oject to call a instance method or variable. 

class Method
{
	int x=20;
	static String name="java";
	public static void main(String[] args)       //Static method
	{
		int a=25;                  //local variable
		System.out.println(a);     //print directly
		System.out.println(name);  //printing static variable
		Method m=new Method();     //Object creation
		m.M1();                    //calling Instance method M1 by using object m
		M3();                      //calling static method M3

	}
	public void M1()                    //Instance method
	{
		System.out.println("hi");
		M2();                       //calling Instance method M2 directly without creating an 
                                              object coz M1 is also an Instance

	}
	public void M2()                   //Instance Method
	{
		System.out.println("hey");
		System.out.println(x);     //print Instance variable x directly without 
                                             creation of object coz it is also an isntance variable
	}
	public static void M3()            //Static method
	{
		System.out.println("hello");
		System.out.println(name);   // print static variable name directly 
                                               without using classname coz it is also a static method
	}


}