package U3Project;
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class FancySnowFlake extends AbstractShape
{
   public FancySnowFlake(int x, int y, int w, int h )
   {
		super(x, y, w, h, Color.WHITE, 0, 2);
   }

   public void draw(Graphics window)
   {
      window.setColor(getColor());
      
      //Fill int x from getXPos method
      int x = getXPos();
      
      //Fill y from getYPos method
      int y = getYPos();
      
      //Fill w from getWidth method
      int w = getWidth();
      
      //Fill h from getHeight method
      int h = getHeight();
      
      
      //Drawing Snowflake
      //Add more lines to draw the white lines to make a snowflake and use the window object
      // the below line is for your reference on how to draw a line
      int htemp = h;
      h = (h*2)/3;
      int wtemp = w;
      w = (w*2)/3;
      window.drawLine(x, y, x+(3*w/4), y+(3*h/4)); 
      window.drawLine(x, y, x-(3*w/4), y+(3*h/4)); 
      window.drawLine(x, y, x-(3*w/4), y-(3*h/4)); 
      window.drawLine(x, y, x+(3*w/4), y-(3*h/4)); 
      window.drawLine(x, y, x, y+h);
      window.drawLine(x, y, x+w, y);
      window.drawLine(x, y,  x-w,  y);
      window.drawLine(x, y,  x,  y-h);
      h = htemp;
      w = wtemp;
      //details
      window.drawOval(x, y, 2*w/5, 2*h/5);
      window.drawOval(x, y-(h/4), w/2, h/2);
      window.drawOval(x, y-(2*h/5), 2*w/5, 2*h/5);
      window.drawOval(x-(w/4), y-(h/2), w/2, h/2);
      window.drawOval(x-(2*w/5), y-(2*h/5),  2*w/5,  2*h/5);
      window.drawOval(x-(w/4), y, w/2, h/2);
      window.drawOval(x-(2*w/5), y,  2*w/5,  2*h/5);
      window.drawOval(x-(h/2), y-(h/4), w/2, h/2);
      

      
   }

   public void moveAndDraw(Graphics window)
   {
    	
	    int offset = (int)(Math.random()*4);
    	int rnd = (int)(Math.random()*2);
    	if(rnd==1)
        offset = offset * -1;   
    	setXPos(getXPos() + offset);
    	setYPos(getYPos() + getYSpeed());			
    	draw(window); 
   }
}

