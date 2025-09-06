class Demo12	 
{
	int x=10; // Instance vaibale 
	// constructor
	 public Demo12()
		{
		System.out.println("Inside the reference obj");
		}
		
	public static void main(String[] args) 
	{
		int z=30;
		//System.out.println(x);
		System.out.println(new Demo12().x);
		Demo12 d=new Demo12();
		System.out.println(d.x);
		System.out.println(z);
		
	
	}
}
