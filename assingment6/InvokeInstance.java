class Base
{
	private String s;
	String getDataSum(String str)
	{
		s = str;
		return s;
	}
}


class Derived extends Base
{
	Derived(String str)
	{
		System.out.println("Message : " + super.getDataSum(str) );
	}
}

public class InvokeInstance
{
	public static void main(String[] x)
	{
		Derived d = new Derived("Hello World");
	}
}