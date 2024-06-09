class Constructor
{
	public static void main(String[] args)
	{
	Mob m1=new Mob(10,"samsung","Black",20000.0);
	Mob m2=new Mob(20,"Oppo","Grey",30000.0);
	Mob m3=new Mob(30,"Vivo","Aqua",25000.0);
	m1.Printvalue();
	m2.Printvalue();
	m3.Printvalue();
	
	}

}
class Mob
{
	int mobId;
	String mobName;
	String color;
	double price;
	Mob(int mobId,String mobName,String color,double price )
	{
		this.mobId=mobId;
		this.mobName=mobName;
		this.color=color;
		this.price=price;	
	}
	public void Printvalue()
	{
		System.out.println("mobId="+mobId+"mobName="+mobName+"mobColor="+color+"mobPrice=price");
	}
}


