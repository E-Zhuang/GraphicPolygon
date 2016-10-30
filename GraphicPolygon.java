
/**
 * Write a description of class GraphicPolygon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import apcslib.*;

class GraphicPolygon extends RegularPolygon
{

    //The center of the polygon at (x,y)
    private double xPosition, yPosition;
    
    /**
     * Default Constructor for objects of class GraphicPolygon that uses the super constructor 
     * instantiate the # of sides wanted, and the side length. The constructor also 
     * defaults to set the center of the polygon at (0,0).
     */
    public GraphicPolygon(int numSides, double sideLength)
    {
        super(numSides, sideLength);    //uses super constructor to instantiate the 
                                        //# of sides wanted and the side length
        xPosition = 0;                  //set's the center at (0,0)
        yPosition = 0;
    }   
        
     /**
     * Constructor for objects of class GraphicPolygon that uses the super constructor 
     * instantiate the # of sides wanted, the side length, and the center of the 
     * polygon at (x,y) or (xPosition,yPosition).
     */
    public GraphicPolygon(int numSides, double sideLength, double x, double y)
    {
        super (numSides, sideLength);   //uses super constructor to instantiate the 
                                        //# of sides wanted and the side length
        xPosition = x;           //center's x position
        yPosition = y;           //center's y position
    }    
    
    /**
     * Sets xPosition = x and yPosition = y to correspond to the new center of the
     * polygon
     */ 
    public void moveTo(double x, double y)
    {
        xPosition = x;          //center's x position
        yPosition = y;          //center's y position
    }
    
    /**
     * Draws the polygon about the center point (xPosition, yPosition). Uses 
     * properties inherited from RegularPolygon to determine the number and 
     * length of the sides, the radius of the inscribed circle, and the vertex 
     * angle with which to draw the polygon
     */
    public void draw()
    {
        //DrawingTool that draws on a SketchPad of 400x400
        DrawingTool pen = new DrawingTool(new SketchPad(400, 400));
        
        int sides;          //the number of sides drawn by the DrawingTool
        
        sides = 0;          //starts at zero since no sides were drawn
        
        pen.up();
        pen.move (xPosition + mySideLength / 2, yPosition + myR);   //move to upper right
        pen.setDirection(180);          //set the direction of the pen facing left
        pen.down();
        
        //loops while the # of sides drawn are less than or equal to the # of sides wanted
        while (sides <= myNumSides)     
        {
            pen.forward(mySideLength);                 //draws line the length of the side
            pen.turnLeft (180 - vertexAngle());        //turns the pen to make vertex 
            sides++;                                   //increment the # of sides drawn 
        }
    }
        
}    