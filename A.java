public class A
{
	int a=10;
	float b=5.6f;
	 A(){
		System.out.println("inside the constructor");
	 }
	void display(){
		System.out.println("inside the method");
	}
	void display2(){
		System.out.println("inside the method2");
	}
	void display3(){
		System.out.println("inside the method3");
	}
	void display4(){
		System.out.println("inside the method4");
	}
}

class B 
{
	public static void main(String[] args) 
	{
		A obj1=new A();
		// Access and print the values of 'a' and 'b'
        System.out.println("Value of a: " + obj1.a); // Prints the value of 'a'
        System.out.println("Value of b: " + obj1.b); // Prints the value of 'b'

        // Optionally call the 'display' method
        obj1.display();
		obj1.display3();
		obj1.display2();
		obj1.display4();
	}
}
