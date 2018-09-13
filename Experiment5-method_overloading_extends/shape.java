class shape
{
	int x;
	int y;
	void dimenstion(int lenght)
	{
		x=lenght;
		y=lenght;
	}
	void dimenstion(int length,int breadth)
	{
		x=length;
		y=breadth;
	}
	void display()
	{
		System.out.println("X-Cordinate: "+x);
		System.out.println("Y-Cordinate: "+y);
	}
}