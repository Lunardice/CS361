/**
 * 
 */
package mystack;

/**
 * @Dennis Fung ADD YOUR NAME 
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}


		
	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
	}

	public T pop() {
		// TODO To complete
		if(theStack==null) {
			return null;
		}
		else {
			T popVal=theStack.val;
		theStack=theStack.next;
		return popVal;
		}
		
	}

	public void push(T v) {
		// TODO To complete
		MyNode<T> tempNode=new MyNode<>(v,theStack);
		theStack=tempNode;
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO To complete
		// Create a stack of Integer
		// Push 1 and 2
		// Pop
		// Push 5
		MyStack<Integer> intstack=new MyStack<>();
		intstack.push(1);
		intstack.push(2);
		System.out.println(intstack.pop());
		intstack.push(5);
		
		// TODO To complete
		// Create a stack of Person
		// Push a person p1 with your name
		// Push a person p2 with my name
		MyStack<Person> human=new MyStack<>();
		Person a=new Person("firstname","lastname");
		Person b=new Person("John","Doe");
		
		human.push(a);
		human.push(b);
		System.out.print(human.pop().getname());
	}

}
