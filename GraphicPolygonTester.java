
/**
 * Lab 13.2 GraphicPolygon.
 * 
 * Emily Zhuang
 * Mr. Lantsberger
 * APCS:Period 4
 * 25 October 2016
 */
public class GraphicPolygonTester
{
    /**
     * This program instantiates four GraphicPolygon objects that will draw various
     * types of polygons of various sizes. The driver class only calls the draw()
     * to draw the polygons (square, octogon, enneadecagon, enneacontakaihenagon).
     */
    public static void main(String[] args)
    {
        //instantiates four GraphicPolygon objects that draw polygons of various
        //types and sizes
        GraphicPolygon gPoly4 = new GraphicPolygon(4,150);      //square
        GraphicPolygon gPoly8 = new GraphicPolygon(8,100);      //octogon
        GraphicPolygon gPoly19 = new GraphicPolygon(19,50);     //Enneadecagon
        GraphicPolygon gPoly91 = new GraphicPolygon(91,10);     //Enneacontakaihenagon
        
        //draws the multiple GraphicPolygons
        gPoly4.draw();
        gPoly8.draw();
        gPoly19.draw();
        gPoly91.draw();
        
    }
}
