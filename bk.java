class bk 
{
	{
		System.out.println("Block1");
	}
	
	bk(){
		System.out.println("Inside the constructor");
	}
	
	static {
		System.out.println("Static Block");
	}
	public static void main(String[] args) 
	{
		new bk();
		System.out.println("Welcome");
	}
	{
		System.out.println("Block2");
	}
	
	
}
