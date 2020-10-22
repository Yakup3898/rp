package javapractice01;

public class MyClass {
	//just a question about constructor. What's the output?
	
	int x;
	static int y;
	
	MyClass(int i)
	{
		x += i;
		y += i;
	}
	public static void main(String[] args) 
	{
		new MyClass(2);
		MyClass mc = new MyClass(3);
		System.out.println(mc.x + "," + mc.y);

	}

}
