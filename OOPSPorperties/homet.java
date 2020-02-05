class One
{
	public void display()
	{
		System.out.println("ONE");
	}
}
class Two extends One
{
	public void display()
	{
		System.out.println("TWO");
	}
	public int add(int x,int y)
	{
		return x+y;
	}
	public double add(double x,double y)
	{
		return x+y;
	}
}
class Encap
{
	private String name;
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
}
abstract class Epam
{
	public abstract void display();
}
class Software extends Epam
{
	public void display()
	{
		System.out.println("\n Welcome EPAM");
	}
}
class Main
{
	public static void main(String p[])
	{
		One o=new One();
		o.display();
		Two t=new Two();
		t.display();
		System.out.println(t.add(7,9));
		System.out.println(t.add(7.9,9.7));
		Encap e=new Encap();
		e.setName("HomeTask");
		System.out.println("Name:"+e.getName());
		Epam s=new Software();
		s.display();
	}
}