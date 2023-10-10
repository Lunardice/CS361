/**
 * 
 */
package circle;

/**
 * @author ADD YOUR NAME
 *
 */
public class DemoCircle {

	/**
	 * @param args
	 * @throws CloneNotSupportedException 
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
	
		Circle c = new Circle();
		c.setX (5.0);
		c.setY (5.0);	
		
		ColoredCircle cc = new ColoredCircle();
		cc.setX(6.0);
		cc.setY(6.0);

		System.out.println("c - x = " + c.getX() + " y = " + c.getY() );
		System.out.println("cc - x = " + cc.getX() + " y = " + cc.getY() );
		
		c.draw(); 	// Drawing a Circle... 
					// draw method from Circle
		
		// Upcasting
		c = cc; 
		
		System.out.println("c: Circle = cc: ColoredCircle"); 

		System.out.println("c - x = " + c.getX() + " y = " + c.getY() );
		c.draw(); 	// Drawing a ColoredCircle...
					// draw method from ColoredCircle
					// method resolution at run time
		
		System.out.println("cc - x = " + cc.getX() + " y = " + cc.getY() );
		cc.draw(); 	// Drawing a ColoredCircle...
					// draw method from ColoredCircle
					// method resolution at run time
		
		Circle c1 = new Circle();
		c1.setX (6.0);
		c1.setY (6.0);
		c1.setR (6.0);
		
		Circle c2 = new Circle();
		c2.setX (6.0);
		c2.setY (6.0);
		c2.setR (6.0);
		
		// TODO print c1 with toString
		System.out.println(c1.toString());
		// TODO print c2 with toString
		System.out.println(c2.toString());
		// TODO make a deep copy of c1 with clone and assign it to c3
		Circle c3=(Circle)c1.clone();
		// TODO write a conditional that checks that c3.equals(c1) is true and print "c3.equals(c1) is true" or "c3.equals(c1) is false" otherwise
		System.out.println(c3.equals(c1));
	}

}
