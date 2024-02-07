import java.util.*;
class AreaOfCircle
{
public static void main (String args[])
	{
	int radius ;
	float PI=3.14f,area;
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter Radius of circle:");
	radius=sc.nextInt();
	area=(PI*radius*radius);
	System.out.println("Area of Circle="+area);

	}
}