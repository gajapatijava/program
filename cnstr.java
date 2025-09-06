class cnstr 
{
	cnstr(){
		this(10);
		System.out.println("Welcome");
		
	}
	
	cnstr(int a){
		System.out.println(a);
	}
	
	public static void main(String[] args) 
	{
		new cnstr();
	}
}
