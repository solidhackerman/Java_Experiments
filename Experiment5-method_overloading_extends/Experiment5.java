//This file is linked with shape class present in self experimentation folder
class Experiment5 extends shape
{
	public static void main(String args[])
	{
		shape square = new shape();
		shape rectangle = new shape();
		square.dimenstion(10);
		rectangle.dimenstion(20,30);
		System.out.println("Dimension of square : ");
		square.display();
		System.out.println("Dimension of rectangle : ");
		rectangle.display();
	}
}