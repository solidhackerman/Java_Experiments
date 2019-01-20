interface interface1
{
	int x=100;
}
interface interface2
{
	int y=200;
	void show();
}
class TestInterface implements interface1,interface2
{
	void display()
	{
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}
	public void show()
	{
		System.out.println("Show() method of interface 2 is called which is implemented in TestInterface class");
	}
}
class Experiment7
{
	public static void main(String[] args)
	{
		TestInterface obj = new TestInterface();
		obj.display();
		obj.show();
	}
}