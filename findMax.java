class findMax 
{
	int max(int a, int b)
	{
		if (a>b)
			return a;
		else 
			return b;
	}
	
	public static void main(String[] args) 
	{
		int x=new findMax().max(10,3);
		System.out.println(x);
		
		findMax d=new findMax();
		int y=d.max(3,9);
		System.out.println(y);
	}
}
