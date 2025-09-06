class ThisDemo 
{
	int x=10;
	
	void display()
	{
		int x=20;
		System.out.println(x);
		System.out.println(this.x);
	}
	public static void main(String[] args) 
	{
		ThisDemo d = new ThisDemo();
		d.display();
	}
}
