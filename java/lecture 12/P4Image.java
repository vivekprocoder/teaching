import java.awt.*;
import java.applet.Applet;
public class P4Image extends Applet
{
	Image img=null; 
	public void init()
	{
		 img=getImage(getCodeBase(),"1.jpg");		
	}
 

	public void paint(Graphics g)
	{
		g.drawImage(img,100,100,this);
	}
}
/*
<html>
<applet code="P4Image.class" width=550 height=400>
</applet>
</html>
*/