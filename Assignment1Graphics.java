package ITC155;
import java.awt.*;

/*
 * Draw a MickeyBox
 * Write a complete program in a class MickeyBox that uses the DrawingPanel to draw the following figure:
 * The window is 220 pixels wide and 150 pixels tall. The background is yellow. There are two blue ovals of size 40 x 40 
 * pixels. The left oval's top-left corner is located at position(50,25), and the two ovals' top-left corners are 80 pixels
 * apart horizontally. There is a red square whose top two corners exactly intersect the centers of the two ovals. Lastly, 
 * there is a black horizontal line through the center of the square. 
 */

public class Assignment1Graphics {

	public static void main(String[] args) {
		DrawingPanel panel = new DrawingPanel(220,150);
		Graphics g = panel.getGraphics();
		
		//background yellow
		panel.setBackground(Color.yellow);
		
		//two circle
		g.setColor(Color.blue);
		g.fillOval(50, 25, 40, 40);
		
		g.setColor(Color.blue);
		g.fillOval(130, 25, 40, 40);
		
		g.setColor(Color.red);
		g.fillRect(70, 45, 80, 80);
		
		g.setColor(Color.black);
		g.drawLine(70, 85, 150, 85);
		
	}

}
