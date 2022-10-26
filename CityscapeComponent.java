import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
    // define the objects in your Cityscape as instance variables
    // ...
    Skyscraper skyscraper1 = new Skyscraper(0);
    Skyscraper skyscraper2 = new Skyscraper(100);
    Skyscraper skyscraper3 = new Skyscraper(200);
    Skyscraper skyscraper4 = new Skyscraper(300);
    Skyscraper skyscraper5 = new Skyscraper(400);
    Skyscraper skyscraper6 = new Skyscraper(500);
    Skyscraper skyscraper7 = new Skyscraper(600);
    
    Car car1 = new Car(0, 475);
    
    Star star1 = new Star(75);
    Star star2 = new Star(175);
    Star star3 = new Star(275);
    Star star4 = new Star(375);
    Star star5 = new Star(475);
    Star star6 = new Star(575);
    
    // define the CityscapeComponent contructor and intiailize all instance variables
    // ...
    
    
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     * 
     * @param g a reference to the Graphics object used for all drawing operations
     *
     */
    @Override
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        // invoke the draw method on each object in your Cityscape
        // ...
        
      this.skyscraper1.draw(g2);
      this.skyscraper2.draw(g2);
      this.skyscraper3.draw(g2);
      this.skyscraper4.draw(g2);
      this.skyscraper5.draw(g2);
      this.skyscraper6.draw(g2);
      this.skyscraper7.draw(g2);
      
      this.car1.draw(g2);
      
      this.star1.draw(g2);
      this.star2.draw(g2);
      this.star3.draw(g2);
      this.star4.draw(g2);
      this.star5.draw(g2);
      this.star6.draw(g2);

    }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when
     *      they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        // ...
        this.car1.moveCar();
        
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        //  do not explicitly invoke the paintComponent method
        repaint();
    }

}