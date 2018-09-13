class shape
{
	int x;
	int y;
	shape()
	{
		x=10;
	        y=20;
	}
	shape(int x_cord,int y_cord)
	{
		x=x_cord;
		y=y_cord;
	}
	void display()
	{
		System.out.println("X-Cordinate: "+x);
		System.out.println("Y-Cordinate: "+y);
	}
}
class Experiment4
{
	public static void main(String args[])
	{
		shape rectangle1 = new shape();
		shape rectangle2= new shape(30,40);
		System.out.println("Cordinates of rectangle 1 : ");
		rectangle1.display();
		System.out.println("Cordinates of rectangle 2 : ");
		rectangle2.display();
	}
}