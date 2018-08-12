package Inheritance;

public class ChildClass extends ParentClass {
	ChildClass()
	{
		System.out.println("constructor ofchild");
	}
  void display()
	{
		super.display();
	System.out.println("this is child class");
	}

	public static void main(String[] args) {
		
		ChildClass obj= new ChildClass();
		obj.display();
		// TODO Auto-generated method stub

	}

}
