package edu.towson.cis.cosc603.project4.rectangle;

// TODO: Auto-generated Javadoc
/**
 * The Class Rectangle.
 */
public class Rectangle {
	
	/** I change because,for me, it is easier to  
	 * understand a rectangle with four points.
	 */
	private Point p1x, p1y, p2x, p2y;
	
	/**
	 * Instantiates a new rectangle.
	 */
	Rectangle(Point p1x, Point p1y, Point p2x, Point p2y) {
		this.p1x = p1x;
		this.p1y = p1y;
		this.p2x = p2x
		this.p2y = p2y;
	}
	
	/**
	 * Gets the area.
	 *
	 * @return the area
	 */
	public Double getArea() {
		/** what it was doing before was return the absolute 
		 * value of two points instead of multiplying them.
		 */
		
		return Math.abs((p1x - p2x) * (p1y - p2y));
	}
	
	/**
	 * Gets the diagonal.
	 *
	 * @return the diagonal
	 */
	public Double getDiagonal() {
		return Math.sqrt(Math.pow((p2x - p1x), 2) + Math.pow((p2y - p1y), 2));
	}
}
