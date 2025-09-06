interface Test
{
	void add(int a, int b);
}

class D 
{
	D(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public static void main(String[] args) 
	{
		Test t=D::new;
		t.add(10,20);
		//System.out.println("Hello World!");
	}
}
