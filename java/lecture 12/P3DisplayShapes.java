import java.awt.*;
import java.applet.Applet;
public class P3DisplayShapes extends Applet{
	public void paint(Graphics g)
	{
		g.drawLine(30, 30, 30, 60);
		g.drawLine(35, 30, 35, 60);
		g.drawLine(40, 30, 40, 60);
		g.drawLine(45, 30, 45, 60);
		g.drawLine(50, 30, 50, 60);
		g.drawLine(50, 30, 50, 60);
		g.drawLine(28, 55, 25, 105);
		g.drawLine(52, 55, 55, 105);
		g.drawLine(25, 105, 40,135);
		g.drawLine(55, 105, 40,135);
		g.fillOval(33, 75,5,10);
		g.fillOval(43, 75,5,10);
		g.drawLine(40, 80,40,100);
		g.drawArc(30, 80,20,30,180,180);
		g.drawRect(100,100,150,80);
		g.fillRect(165,130,20,50);
		g.drawLine(100,100,140,70);
		g.drawLine(140,70, 290, 70);
		g.drawLine(290, 70,290, 150);
		g.drawLine(290,150,250,180);
		g.drawLine(250,100, 290,70);
	}
	
}
/*<applet code="P3DisplayShapes.java" height=300 width=300>
 </applet>
 */