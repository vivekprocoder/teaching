import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
	
public class Event2 extends Applet 
{
	String str=" ";
	int x,y;

	public void init()
	{
		addMouseListener(new A());
		addMouseMotionListener(new B());
	}
	
class A implements MouseListener
	{

	public void mousePressed(MouseEvent me1)
	{
		str = "Mouse Pressed";
		x = me1.getX();
		y = me1.getY();
		repaint();
	}
	public void mouseReleased(MouseEvent me2)
	{
		str = "Mouse Released";
		x = me2.getX();
		y = me2.getY();
		repaint();
	}
	public void mouseClicked(MouseEvent me3)
	{
		str = "Mouse Clicked";
		x = me3.getX();
		y = me3.getY();
		repaint();
	}
	public void mouseEntered(MouseEvent me4)
	{
		str = "Mouse Entered";
		x = me4.getX();
		y = me4.getY();
		repaint();
	}
	public void mouseExited(MouseEvent me5)
	{
		str = "Mouse Exited";
		x = 100;
		y = 200;
		repaint();
	}
	}

class B implements MouseMotionListener
	{
	
	public void mouseMoved(MouseEvent me1)
	{
		str = "Mouse Moved";
		x = me1.getX();
		y = me1.getY();
		repaint();
	}
	public void mouseDragged(MouseEvent me2)
	{
		str = "Mouse Dragged";
		x = me2.getX();
		y = me2.getY();
		repaint();
	}
	}
	
	public void paint(Graphics g)
	{
	g.drawString(str,x,y);
	
	}
}
/*
<applet code="Event2.class" height=300 width=400>
</applet>
*/
