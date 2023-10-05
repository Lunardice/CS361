/**
 * 
 */
package reflection;
import java.lang.Class;
/**
 * @author ADD YOUR NAME 
 *
 */

// Reflection: https://docs.oracle.com/javase/tutorial/reflect/class/

// Demonstration of Reflection

// Given an object o, we want to know what class corresponds to o, the inheritance chain for o
// and the list of methods of the class

// Complete the code

import java.lang.reflect.Method;
import java.util.Arrays;

public class Reflection {

	/**
	 * Print the class corresponding to the object
	 * @param o the object
	 */
	public void correspondingClass(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passesd is null");

		System.out.println("Inspecting class: " + o.getClass().getName());
	}

	

	private void InheritanceChain(Object o) {
	    String className = o.getClass().getName();
	    System.out.print(className);
	    

		// TODO To complete
		// You need to use the EXACT format of the output
		// Hint: Use the method getSuperClass()
	
	
	    Class<?> superClass = o.getClass().getSuperclass();
	    if (superClass != null) {
	        System.out.print(" inherits from ");
	        
	        InheritanceChain(superClass.getClass());
	        
	    }
	}

	/**
	 * Print the list of methods of the object
	 * @param o an object
	 */
	public void listMethods(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passesd is null");

		Method[] methods = o.getClass().getMethods();

		// List of methods
		// TODO To complete
		// Print each method on one line
		// Use this EXACT format
		System.out.print("Methods are: ");
		 for (Method method : methods) {
		        System.out.println(method.toString());
		        }
		
		
		}	
	

	/**
	 * Constructor
	 */
	public Reflection() {
	}

	/**
	 * Demonstration
	 * @param args
	 */
	public static void main(String[] args) {

		Reflection r = new Reflection();		
		
		String thud="hello world";
		r.listMethods(thud);
		// Demonstration of the methods on an object of type String
		// TODO To complete
		
		// Demonstration of the methods on an object of type ColoredCircle
		// TODO To complete		
		
		
		
	}

}
