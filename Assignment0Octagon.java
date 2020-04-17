package ITC155;
import java.awt.*;


/*
 *  Write a class named Octagon whose objects represent regular octagons (eight-sided
 *  polygons). Your class should implement the shape interface defined in this chapter,
 *  including methods for its area and perimeter. An octagon object is defined by its
 *  side length (you may need to search online to find formulas for the area and
 *  perimeter of a regular octagon.)
 */

public class Assignment0Octagon {
	public static void main(String[] args) {
		DrawingPanel panel = new DrawingPanel(200,200);
		Graphics g = panel.getGraphics();
		int [] x = {69,131,175,175,131,69,25,25};
		int [] y = {25,25,69,131,175,175,131,69};
		g.drawPolygon(x,y,8);
		
	}
}
