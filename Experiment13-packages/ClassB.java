class ClassA
{
public void display1()
{
System.out.println("Use public if field is to be visible everywhere");
} 
protected void display2()
{
System.out.println("Use protected if field is to be visible everywhere in current package and also subclasses in other packages");
} 
private void display3()
{
System.out.println("Use private if field is not to be visible anywhere except in its own class.");
} 
void display4() 
{
System.out.println("Use default if field is to be visible everywhere in the current package");
} 
void PrivateTest()
{
display3(); 
}
} 
class ClassB
{
public static void main(String args[])
{
ClassA a = new ClassA();
a.display1(); 
a.display2();  
a.display4(); 
a.PrivateTest(); 
}
}