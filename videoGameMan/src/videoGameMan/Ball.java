package videoGameMan;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;



public class Ball extends JComponent
{
	//fields
	private Ellipse2D ball;
	private int dx =3, dy = 0;
	//constructor
	
	public Ball(int x, int y)
	{
		setBounds(x, y, 11, 11);
		ball = new Ellipse2D.Double(0, 0, 10, 10);
	}
	//methods
	//argument is always a graphic 2d object; it is casted into a graphics 2d object and stored into a graphics 2d variable
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setColor(Color.DARK_GRAY);
		g2.fill(ball);
	}
	public void update()
	{
		setLocation(getX() + 2, getY());
	}
	
}
