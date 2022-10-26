import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
   A skyscraper shape that can be positioned anywhere on the screen.
*/
public class Skyscraper
{
   private int xLeft;
   private int yBottom;
   /**
      Constructs a skyscraper with a given top left corner.
      @param xLeft the x coordinate of the top left corner
      @param yBottom the y coordinate of the top left corner
   */
   public Skyscraper(int Xpara)
   {
      this.xLeft = Xpara;
      this.yBottom = 100 + (int)(Math.random() * ((200 - 100) + 1));

   }

   /**
      Draws the skyscraper.
      @param g2 the graphics context
   */
   public void draw(Graphics2D g2)
   {
      Rectangle2D.Double skyscraper = new Rectangle2D.Double(this.xLeft, this.yBottom, 60, 400-this.yBottom);      
      g2.setColor(Color.GRAY);
      g2.fill(skyscraper);

      
     
      
      
   }
}