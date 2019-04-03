package videoGameMan;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.Timer;

public class WalkingManMain extends JFrame implements ActionListener 
{
	private WalkingMan man = new WalkingMan(50,50);
	
	private ArrayList<Ball> balls = new ArrayList<Ball>();
	
	
	public WalkingManMain()
	{
		setLayout(null);
		setBounds(30, 30, 300, 300);
		man.setBounds(10, 10, 100, 100);
		add(man);
		
		Timer timer = new Timer(10, this);
		timer.start();
		
		addKeyListener(new KeyListener()
		{
			public void keyPressed(KeyEvent e)
			{
				if(e.getKeyCode() == e.VK_UP)
				{
					man.setDY(-2);
				}
				else if(e.getKeyCode() == e.VK_DOWN)
				{
					man.setDY(2);
				}
				else if(e.getKeyCode() == e.VK_LEFT)
				{
					man.setDX(-2);
				}
				else if(e.getKeyCode() == e.VK_RIGHT)
				{
					man.setDX(2);
				}
				else if(e.getKeyCode() == e.VK_SPACE)
				{
					Ball ball = new Ball(man.getX(), man.getY());
					balls.add(ball);
					add(ball);
				}
			
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				if(e.getKeyCode() == e.VK_UP)
				{
					man.setDY(0);
				}
				else if(e.getKeyCode() == e.VK_DOWN)
				{
					man.setDY(0);
				}
				else if(e.getKeyCode() == e.VK_LEFT)
				{
					man.setDX(0);
				}
				else if(e.getKeyCode() == e.VK_RIGHT)
				{
					man.setDX(0);
				}
				
			}
			
			public void keyTyped(KeyEvent arg0) 
			{
				
			}
			
		});
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

				
	}
	
	public void actionPerformed(ActionEvent arg0) 
	{		
			if (0<(man.getX()+man.getDX()) && (man.getX()+20+ man.getDX())<this.getWidth()-8 && ((0<man.getY()+man.getDY()) && (man.getY()+36+man.getDY()<this.getHeight()-32) ))
			{
				man.update();
			}
			
			for(int i = balls.size()-1; i >=0; i--)
			{
				Ball checkBall = balls.get(i);
				if(checkBall.getX()> this.getWidth())
				{
					remove(checkBall);
					balls.remove(checkBall);
				}
				checkBall.update();
			}
			repaint();
	}
	
	public static void main(String[] args) 
	{
		new WalkingManMain();
	}

	

	

	
	
}

	
