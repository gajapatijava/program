class Helo 
{
	void sayHi(){
		System.out.println("Hi from Hello class");
	}
}	

public class Test {
    public static void main(String[] args) {
	Helo h = new Helo(){
		@Override
		void sayHi()
		{
			System.out.println("Hi from Anonymous Class");
		}
	};
	
	h.sayHi();
	}
}
