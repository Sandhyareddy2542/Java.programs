class Set
{
	public static void main(String[] args)
	{
	Mob m1=new Mob();
	
	m1.setMobId(10);
	m1.setBName("Samsung");
	m1.setColor("Black");
	m1.setPrice(20000.0);
	System.out.println(m1.getMobId());
	System.out.println(m1.getBName());
	System.out.println(m1.getColor());
	System.out.println(m1.getPrice());	
	
	}

}
class Mob
{
	int mobId;
	String BName;
	String color;
	double price;
	
	public void setMobId(int mobId)
	{
		this.mobId=mobId;
	}
	public void setBName(String BName)
	{
		this.BName=BName;
	}
	public void setColor(String color)
	{
		this.color=color;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}

	public int getMobId()
	{
		return mobId;
	}
	public String getBName()
	{
		return BName;
	}
	public String getColor()
	{
		return color;
	}

	public double getPrice()
	{
		return price;
	}
	
}

