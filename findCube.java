class findCube 
{
	int cube(int a)
	{
		int b=a*a*a;
		return b;
	}
	
	public static void main(String[] args) 
	{
		int x=new findCube().cube(5);
		System.out.println("the cube of the number is :"+x);
		
		// by object reference
		findCube d=new findCube();
		int y=d.cube(3);
		System.out.println("the cube of the number is :"+y);
	}
}
