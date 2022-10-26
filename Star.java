import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
   A star shape that can be positioned anywhere on the screen.
*/
public class Star
{
   private int xTop;
   /**
      Constructs a star with a given top point.
      @param xTop the x coordinate of the top point
   */
   public Star(int xPara)
   {
      this.xTop = xPara;
   }

   /**
      Draws the star.
      @param g2 the graphics context
   */
   public void draw(Graphics2D g2)
   {
      Point2D.Double p1 = new Point2D.Double(this.xTop, 20);
      Point2D.Double p2 = new Point2D.Double(this.xTop + 20, 80);
      Point2D.Double p3 = new Point2D.Double(this.xTop - 35, 40);
      Point2D.Double p4 = new Point2D.Double(this.xTop + 35, 40);
      Point2D.Double p5 = new Point2D.Double(this.xTop - 20, 80);
      
      Line2D.Double l1 = new Line2D.Double(p1, p2);
      Line2D.Double l2 = new Line2D.Double(p2, p3);
      Line2D.Double l3 = new Line2D.Double(p3, p4);
      Line2D.Double l4 = new Line2D.Double(p4, p5);
      Line2D.Double l5 = new Line2D.Double(p5, p1);  
      
      g2.draw(l1);
      g2.draw(l2);
      g2.draw(l3);
      g2.draw(l4);
      g2.draw(l5);
   }
}