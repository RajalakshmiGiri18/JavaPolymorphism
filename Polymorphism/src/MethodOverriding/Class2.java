package MethodOverriding;

public class Class2 extends Class1{
	public void display()
	{
		System.out.println("This is Child Class display method");
	}
	public void show()
	{
		System.out.println("This is Child Class show method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//child ref
		Class2 ob=new Class2();
		ob.display();
		ob.show();
		ob.disp();
		//parent ref 
		Class1 ob2=new Class1();
		ob2.display();
		ob2.show();
		//parent ref and child object
		Class1 ob3=new Class1();
		ob3.display();
		ob3.show();
		
		
		

	}

}
