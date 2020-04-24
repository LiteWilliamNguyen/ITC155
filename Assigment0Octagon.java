package ITC155;

public class Assigment0Octagon {

	public static void main(String[] args) {

		/*
		 *  Write a class named Octagon whose objects represent regular octagons (eight-sided
		 *  polygons). Your class should implement the shape interface defined in this chapter,
		 *  including methods for its area and perimeter. An octagon object is defined by its
		 *  side length (you may need to search online to find formulas for the area and
		 *  perimeter of a regular octagon.)
		 */
	}
			public interface Shape{
				public double getArea();
				public double getPerimeter();
			}
			// Represent octagon shapes
			public class Octagon implements Shape {
			private double base;
			
			 // Constructs a new octagon with given dimension
			public Octagon(double base) {
				this.base = base;
			}
			
			// Returns the area of this octagon
			public double getArea() {
				return base*base*2*(1+ Math.sqrt(2));
			}
			
			//return the perimeter of this octagon
			public double getPerimeter() {
				return 8*base;
			}
			
			
			}
			}


