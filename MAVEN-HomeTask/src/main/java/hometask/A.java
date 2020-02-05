package hometask;

import java.util.Scanner;

class Sweet implements Comparable
{
	int weight=1;
	String name="";
	String color="yellow"; 
	float calories=100;
	public int compareTo(Object o){
		return 0;
		}
}
class chocolate extends Sweet{} 
class FiveStar extends chocolate
{
	FiveStar()
	{
		this.name="FiveStar";
	}
}
class KitKat extends chocolate
{
	KitKat()
	{
		this.name="KitKat";
	}
}
class MilkyBar extends chocolate
{
	MilkyBar()
	{
		this.name="Milky Bar";
	}
}
public class A{
	public static void main(String[] args){
	Sweet[]  allsweets = new Sweet[3];
	allsweets [0]= new FiveStar();
	allsweets [1]= new MilkyBar();
	allsweets [2]= new KitKat();
	try (Scanner t = new Scanner(System.in)) {
		float tw;
		int n;
		System.out.println("1:Total Weight 2:Candies Inside  3:Exit\n Enter choice");
		do
		{
			n=t.nextInt();
			switch(n)
			{
			case 1:
				tw=0;
				for(int i = 0; i < allsweets.length; i++)
				{
					Sweet s = allsweets[i];
					tw += s.weight;
				}
				System.out.println(" total weight = "+tw);
				break;
			case 2:for(int i = 0; i < allsweets.length; i++)
			{
				Sweet s = allsweets[i];
				System.out.println(s.name);
			}
			break;
			default:System.out.println("Enter correct Option");
			}
		}while(n<3);
	}
	}
}
