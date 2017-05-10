abstract class Figure{
	
	double dim1;                   // We will put the value of area calculated in dim1.
	double pi = 3.14;				// Hard Coded value of pi.
	
	abstract void findArea();			
	
	abstract void findPerimeter();
	
}

class Circle extends Figure
	{
		float radius;
		
		void findArea()					// Defining the abstract method Area & perimeter in Circle
		{
			System.out.print("================================="+"\n"+ "Enter Radius of Circle:");
			radius = Float.parseFloat(System.console().readLine());
			dim1 = pi*radius*radius;
			System.out.println("---------------------------"+ "\n" + 
			"Area of Circle:" + dim1 + "\n" + "---------------------------");
		}
		
		void findPerimeter(){
			
			dim1 = 2 * pi * radius;
			System.out.println("============================"+ "\n" +
			"Perimeter of Circle:" + dim1 + "\n" + "============================");
		}
		
	}

class Rectangle extends Figure
	{
		float length,width;
		
		void findArea()			// Defining the abstract method Area & perimeter in Rectangle
		{
			System.out.print("***************************"+ "\n" + "Enter Length of rectangle:");
			length = Float.parseFloat(System.console().readLine());
			System.out.print("Enter width of rectangle:");
			width = Float.parseFloat(System.console().readLine());
			dim1 = length * width;
			System.out.println("---------------------------"+ "\n" + 
			"Area of Rectangle:" + dim1 + "\n" + "---------------------------");
		}
		
		void findPerimeter(){
			dim1 = 2 * (length + width);
			System.out.println("============================"+ "\n" +
			"Perimeter of Rectangle:" + dim1 + "\n" + "============================");
		}
		
	
}

class Triangle extends Figure 
{
	float base,height,side1,side2;
		void findArea()				// Defining the abstract method Area & perimeter in Triangle
		{
			System.out.print("***************************"+ "\n" + "Enter base of Triangle:");
			base = Float.parseFloat(System.console().readLine());
			System.out.print("Enter height of Triangle:");
			height = Float.parseFloat(System.console().readLine());
			dim1 = (base * height)/2;
			System.out.println("---------------------------"+ "\n" + 
			"Area of Triangle:" + dim1 + "\n" + "---------------------------");
		}
		
		void findPerimeter()
		{	
			System.out.println("**************************"+ "\n"+ "Value of Base is :" + base);
			System.out.print("Enter Side1 of Triangle:");
			side1 = Float.parseFloat(System.console().readLine());
			System.out.print("Enter Side2 of Triangle:");
			side2 = Float.parseFloat(System.console().readLine());
			dim1 = base + side1 + side2;
			System.out.println("============================"+ "\n" +
			"Perimeter of Triangle:" + dim1 + "\n" + "============================");
		}	
	
}

class figureTest {
	
	public static void main(String[] args)
	{
		Circle c = new Circle();				
		Rectangle r = new Rectangle();
		Triangle T = new Triangle();
		
		c.findArea();					
		c.findPerimeter();
		
		r.findArea();
		r.findPerimeter();
		
		T.findArea();
		T.findPerimeter();
	}
}