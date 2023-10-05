

package circle;

import java.lang.Object;
/**
 * @Dennis ADD YOUR NAME
 *
 */

// TODO Complete the code

public class Circle extends GraphicObject implements Cloneable {

	// No use of encapsulation
	private double centerX, centerY;
	private double radius;
	private int windowNumber;
	private Circle c1;
	
	public double getX() {return centerX;}
	public double getY() {return centerY;}
	public double getR() {return radius;}
	public int getW() {return windowNumber;}
	
	public void setX(double x) {this.centerX=x;}
	public void setY(double y) {this.centerY=y;}
	public void setR(double r) {this.radius=r;}
	public void setW(int w) {this.windowNumber=w;}
	
	/**
	 * 
	 */
	public Circle() {
	}

	// overloaded method in Circle
	// overridden method from GraphicObject
	@Override
	void draw() {
		System.out.println("Drawing a Circle...");
	}

	// overloaded method in Circle
	// Not overridden as it does follow the signature in GraphicObject
	public void draw(int color) {
		System.out.println("Drawing a Circle in color...");
	}

	public double circumference() {
		return 2.0 * 3.141529 * radius;
	}

	public double area() {
		return 3.141529 * radius * radius;
	}

	public boolean overlaps(Circle other) {
		return ((centerX - other.centerX) * (centerX - other.centerX)
				+ (centerY - other.centerY) * (centerY - other.centerY)) < ((radius + other.radius)
						* (radius + other.radius));
	}

	@Override
	void moveTo(int newX, int newY) {
		setX(newX);
		setY(newY);
	}

	// TODO To complete
	/**
	 * @return the Circle with this EXACT format Circle: centerX = ... centerY = ... radius = ...
	 */
	@Override
	public String toString() {
		String x2= String.valueOf(((Circle) this).getX());
		String y2=String.valueOf(((Circle) this).getY());
		String r2= String.valueOf(((Circle) this).getR());
		String st="centerX = "+x2+" centerY = "+y2+" radius = "+r2;
		return st;
	}

	// TODO To complete
	// TODO Be sure that you understand the difference between equals and ==
	/**
	 * @return true if this and obj have the same values for
	 * centerX, centerY and radius
	 */
	@Override
	public boolean equals(Object obj) {
		
		double x= ((Circle) obj).getX();
		double y= ((Circle) obj).getY();
		double r= ((Circle) obj).getR();
		
		double x2= ((Circle) this).getX();
		double y2=((Circle) this).getX();
		double r2= ((Circle) this).getX();
		
		int tf=Double.compare(x,x2);
		tf=tf+Double.compare(y,y2);
		tf=tf+Double.compare(r,r2);
		
		
		if(tf==0) {
			return true;
		} 
		else {
			return false;
		}
		
	}

	// TODO To complete
	/**
	 * @return an exact copy of the Circle that is a new instance 
	 */
	// @Override
	
	protected Object clone() throws CloneNotSupportedException {
		Circle temp=(Circle)super.clone();
		
		
	
	
		
	return temp;
	
	}
}
