import java.awt.*;
import java.applet.Applet;
public class P1DisplayName extends Applet
{
	Font f1;
	Font f2;
	Font f3;
	Font f4;
	Font f5;
	Font f6;
	Font f7;
	Font f8;
	Font f9;
	Font f10;
	Color c1;
	Color c2;
	Color c3;
	Color c4;
	Color c5;
	Color c6;
	Color c7;
	Color c8;
	Color c9;
	Color c10;
	public void init()
	{
		f1=new Font("Arial",Font.BOLD,10);
		f2=new Font("Times Roman",Font.BOLD,10);
		f3=new Font("Helvetica",Font.BOLD,10);
		f4=new Font("Courier",Font.BOLD,10);
		f5=new Font("Arial Black",Font.BOLD,10);
		f6=new Font("Arial Narrow",Font.BOLD,10);
		f7=new Font("Calibri",Font.PLAIN,10);
		f8=new Font("Arial",Font.ITALIC,10);
		f9=new Font("Arial",Font.BOLD+Font.ITALIC,10);
		f10=new Font("Arial",Font.BOLD,10);
		c1=new Color(200,200,200);
		c2=new Color(01,201,201);
		c3=new Color(202,02,202);
		c4=new Color(203,203,03);
		c5=new Color(254,204,204);
		c6=new Color(225,205,205);
		c7=new Color(206,96,206);
		c8=new Color(207,17,207);
		c9=new Color(208,2,228);
		c10=new Color(209,209,209);
	}
	public void paint(Graphics g)
	{
		g.setColor(c10);
		g.setFont(f1);
		g.drawString("viv",10,10);
		g.setColor(c2);
		g.setFont(f2);
		g.drawString("viv",10,20);		
		g.setColor(c3);
		g.setFont(f3);
		g.drawString("viv",10,30);
		g.setColor(c4);
		g.setFont(f4);
		g.drawString("viv",10,40);
		g.setColor(c5);
		g.setFont(f5);
		g.drawString("viv",10,50);
		g.setColor(c6);
		g.setFont(f6);
		g.drawString("viv",10,60);
		g.setColor(c7);
		g.setFont(f7);
		g.drawString("viv",10,70);
		g.setColor(c8);
		g.setFont(f8);
		g.drawString("viv",10,80);
		g.setColor(c9);
		g.setFont(f9);
		g.drawString("viv",10,90);
		g.setColor(c10);
		g.setFont(f10);
		g.drawString("viv",10,100);
	}
}
/*
<applet code="P1DisplayName.class" width=100 height=100>
</applet>
*/