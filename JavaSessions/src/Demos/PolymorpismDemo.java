
package Demos;

public class PolymorpismDemo {
	
	void showVal()
	{
		System.out.println("value from no-arg function: 5");
	}
	
	void showVal(int val)
	{
		System.out.println("Value from integer parameterised function :"+val);
	}
	
	void showVal(char alpha)
	{
		System.out.println("Value from character parameterised function :"+alpha);
	}
	
	void showVal(String txt)
	{
		System.out.println("Value from String parameterised function :"+txt);
	}
	public static void main(String[] args)
        {
		
		PolymorpismDemo demo=new PolymorpismDemo();
		//sequence of invokation of functions decides the 
		//sequence of o/p and not the sequence of defining the function
		demo.showVal();
		demo.showVal('K');
		demo.showVal(7);
		demo.showVal("Sankalp");

	}

}
