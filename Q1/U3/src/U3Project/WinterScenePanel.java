//Name-

package U3Project;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class WinterScenePanel extends JPanel implements Runnable
{
	private List<AbstractShape> shapes;
	private AbstractShape sMan;

	//Constructor for WinterScenePanel
	public WinterScenePanel()
	{
		setVisible(true);
		//Refer shapes to a new ArrayList of AbstractShape
		 shapes = new ArrayList<AbstractShape>();
		
		//Populate the list with 50 unique snowflakes
		 //normal shape
		for (int i = 0; i < 50; i++) {
			int x = (int)(Math.random() *850);
			int y = (int)(Math.random() * 600);
			SimpleSnowFlake ssf = new SimpleSnowFlake(x, y, 10, 10);
			shapes.add(ssf);
		}
		//fancy shape
		for(int i = 0; i < 25; i++) {
			int x = (int)(Math.random()*850);
			int y = (int)(Math.random() * 600);
			FancySnowFlake ssf = new FancySnowFlake(x, y, 30, 30);
			shapes.add(ssf);
		}
		
		//instantiate a snowman
		 sMan = new SnowMan(600, 285, 50, 50);
		 
		 
		

		
		new Thread(this).start();
		
	}

	public void update(Graphics window)
	{
		paint(window);
	}

	public void paint(Graphics window)
	{
		window.setColor(Color.black);
		window.fillRect(0,0,getWidth(), getHeight());
		window.setColor(Color.WHITE);
		window.drawRect(20,20,getWidth()-40,getHeight()-40);
		window.setFont(new Font("TAHOMA",Font.BOLD,18));
		window.drawString("MAKE A WINTER SCENE by Aathira Nair || 8th period",40,40);

		//make the snowman appear
		//make the snowflakes appear and move down the screen
		//check to see if any of the snowflakes need to be reset to the top of the screen
		//Refer the project document for code help
		//draw snowman
		sMan.draw(window);
		//draw normal man
		for(AbstractShape sh: shapes) {
			sh.moveAndDraw(window);
			if(sh.getYPos() >= getHeight()) {
				sh.setYPos(0);
			}
			
			
			
			
		}
		
	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(35);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}