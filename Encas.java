// Program Static class
class A 
{
	static class B // Inner class 
	{
		static void show(){
			System.out.println("Welcome");
		}
	}
}
	class Encas
	{
	
	public static void main(String[] args) 
		{
		A.B.show(); 
		}	
	}
