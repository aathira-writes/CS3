//Name-
package U3Project;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class SnowMan extends AbstractShape
{
   public SnowMan(int x, int y, int w, int h )
   {
		super(x, y, w, h, Color.WHITE, 0, 0);
   }

   public void draw(Graphics window)
   {
	   window.setColor(getColor());
	   //add code here to make a snowman
	   //Fill int x from getXPos method
	      int x = getXPos();
	      
	      //Fill y from getYPos method
	      int y = getYPos();
	      
	      //Fill w from getWidth method
	      int w = getWidth();
	      
	      //Fill h from getHeight method
	      int h = getHeight();
	   //you can use window.fillOval() and pass values into the method 
	   window.fillOval(x, y, w, h);
	   int xtwo = x - (w/2);
	   int ytwo = y + (h - 15);
	   int wtwo = w*2;
	   int htwo = h*2;
	   window.setColor(Color.black);
	   window.fillOval(x + (w/5), y + 15, 10, 10);
	   window.fillOval((x + w) - (w/3), y + 15, 10, 10);
	   window.setColor(Color.white);
	   window.fillOval(xtwo, ytwo, wtwo, htwo);
	   int xthree = xtwo - (w/2);
	   int ythree = ytwo + (htwo - 30);
	   int wthree = w*3;
	   int hthree = h*3;
	   window.fillOval(xthree, ythree, wthree, hthree);
	   window.setColor(Color.red);
	   window.fillArc(x, y - (w/2), w, h, 0, 180);
	   window.fillRect(x - (w/16), y, w + (w/8), (h/4));
	   window.setColor(Color.white);
	   window.fillOval(x + ((2*w)/5), y - ((2*w)/3), 12, 12);
	   window.fillRect(0, 500, 900, 100);
	   
   }

   public void moveAndDraw(Graphics window)
   {
      draw(window);   
   }
}