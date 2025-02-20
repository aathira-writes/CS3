package U3Project;
import java.awt.Color;
import java.awt.Graphics;

public class SimpleSnowFlake extends AbstractShape
{
   public SimpleSnowFlake(int x, int y, int w, int h )
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
      window.drawLine(x, y, x+(3*w/4), y+(3*h/4)); 
      window.drawLine(x, y, x-(3*w/4), y+(3*h/4)); 
      window.drawLine(x, y, x-(3*w/4), y-(3*h/4)); 
      window.drawLine(x, y, x+(3*w/4), y-(3*h/4)); 
      window.drawLine(x, y, x, y+h);
      window.drawLine(x, y, x+w, y);
      window.drawLine(x, y,  x-w,  y);
      window.drawLine(x, y,  x,  y-h);
      
      
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