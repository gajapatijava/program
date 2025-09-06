class constr 
{
	constr(){
		System.out.println("Welcome");
	}
	
	constr(int a){
		System.out.println(a);
	}
	
	public static void main(String[] args) 
	{
		new constr();
		new constr(100);
	}
}
