class Rectangle
{
	int length;
	int width;
	int area;
}
class Experiment1
{
	public static void main(String args[])
	{
		Rectangle rect=new Rectangle();
		rect.length=20;
		rect.width=30;
		rect.area=rect.length*rect.width;
		System.out.println("Length: " +rect.length);
		System.out.println("Width: " +rect.width);
		System.out.println("Area: " +rect.area);
	}
}