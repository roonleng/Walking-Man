package videoGameMan;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;



public class Ball extends JComponent
{
	//fields
	private Ellipse2D.Double ball;
	
	//constructor
	
	public Ball(int x, int y)
	{
		int  xC= x;
		int yC= y;
		ball = new Ellipse2D.Double(xC, yC, 10, 10);
		//if fit to a 10 pixel grid, the invisible grid for it is too snug and it cuts off the circle at the right and bottom
		//this.setSize(10, 10);
		//'this' defines the implicit parameter, or the object that is going to run the method.
		this.setSize(11, 11);
	}
	//methods
	//argument is always a graphic 2d object; it is casted into a graphics 2d object and stored into a graphics 2d variable
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.draw(ball);
		g2.setColor(Color.DARK_GRAY);
	}
	public void update()
	{
		setLocation(getX() + 2, getY());
	}
	
}
