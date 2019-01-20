import java.awt.*;
import java.applet.*;
public class AppletUserInput extends Applet
{
	public void paint(Graphics g)
	{
		String str;
		str=getParameter("Text");
		if(str==null)
		{
			str = "Java";
		}
		str="Hello"+str;
		g.drawString(str,10,100);
	}
}
