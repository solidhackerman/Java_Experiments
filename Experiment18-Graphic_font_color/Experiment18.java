import java.applet.Applet;
import java.awt.*;

public class Experiment18 extends Applet
{
	public void paint(Graphics g)
	{
		Font boldFont=new Font("Serif",Font.BOLD,24);
		g.setColor(Color.red);
		g.setFont(boldFont);
		g.drawString("Hello World!!!",200,200);
	}
}