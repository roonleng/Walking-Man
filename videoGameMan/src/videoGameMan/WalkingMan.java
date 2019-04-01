package videoGameMan;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

import java.awt.geom.Ellipse2D;

import javax.swing.JFrame;


public class WalkingMan extends JComponent

{
	private Ellipse2D.Double head;
	private Rectangle leftArm, rightArm, leftLeg, rightLeg, body;
	private int dx=0, dy=0;
	
	public WalkingMan(int x, int y)
	{
		setLocation(x, y);
		this.setSize(20, 36);
		head = new Ellipse2D.Double(5,0 ,10, 10);
		leftLeg = new Rectangle(6, 20, 4, 15);
		rightLeg = new Rectangle(10, 20, 4, 15);
		leftArm = new Rectangle(1, 10, 5, 10);
		rightArm = new Rectangle(14, 10, 5, 10);
		body = new Rectangle(6, 10, 8, 10);
		//setVisible(true);
		
	}
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.draw(head);
		g2.draw(body);
		g2.draw(leftLeg);
		g2.draw(rightLeg);
		g2.draw(leftArm);
		g2.draw(rightArm);

		g2.setColor(Color.PINK);
		g2.fill(leftLeg);
		//g2.setColor(Color.GREEN);
		g2.fill(rightLeg);
		//g2.setColor(Color.ORANGE);
		g2.fill(leftArm);
		//g2.setColor(Color.RED);
		g2.fill(rightArm);
		//g2.setColor(Color.DARK_GRAY);
		g2.fill(body);
		//g2.setColor(Color.PINK);
		g2.fill(head);
		
		
	}
	public void update()
	{
		setLocation(getX() + dx, getY() + dy);
	}
	public int getDX() 
	{
		return dx;
	}
	public int getDY()
	{
		return dy;
	}
	public void setDX(int n)
	{
		dx=n;
	}
	public void setDY(int n)
	{
		dy=n;
	}
}

/**ellis program
dont? worry about updatable
bring ball into man class (projectile)
ball has private variables dx and dy (dy in case you ever want the ball to move up)
write a method that updates the position of the ball
all the code that gives the man capabilites in the man; dx and dy are therefore in the man class
if dx and dy are in this class and they are private, you have to give other classes the capabilities to access them
and change the values
so, you must write getters and setters

the update method
--------------------

useful so that you can put balls and man in an arraylist (if you want) and call the update method for that list.

*/
