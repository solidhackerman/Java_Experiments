import java.util.Scanner;
class FahrenToCelsius
{
	int f;
	int c;
	void GetData(int fahrenheit)
	{
		f=fahrenheit;
	}
	double ConvertFhrToCelc()
	{
		double Celsius;
		Celsius=(f-32)/1.8;
		return Celsius;
	}
}
class Experiment2
{
	public static void main(String args[])
	{
		int Fahrnht;
		double Cels;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Temperature in Fahrenheit. The value should be an integer");
		Fahrnht = s.nextInt();
		FahrenToCelsius t = new FahrenToCelsius();
		t.GetData(Fahrnht);
		Cels = t.ConvertFhrToCelc();
		System.out.println("Fahrenheit		Celsius");
		System.out.println(Fahrnht+"		"+Cels);
	}
}