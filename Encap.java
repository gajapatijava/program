class Emp
{
	private int age;
	
	void setAge(int age)
	{
		if (age<18)
			this.age=18;
		else if (age>60)
			this.age=60;
		else
			this.age=age;
		
	}
	int getAge()
	{
		return age;
	}
}	
	class Encap
	{
	public static void main(String[] args) 
		{
		Emp e=new Emp();
		e.setAge(200);
		int x=e.getAge();
		System.out.println(x);
		}
	}
