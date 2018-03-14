import java.util.scanner;

public class swapping
{
	public static void main(string[] args)
	{
	int x=10;
	int y=20;
	system.out.println("Before swapping");
	system.out.println("value of x is :"+x);
	system.out.println("value of y is:"+y);

	x=x+y;
	y=x-y;
	x=x-y;

	system.out.println(" After swapping");
	system.out.println("value of x is:" +x);
	system.out.println("value of y is:" +y);

	}

}