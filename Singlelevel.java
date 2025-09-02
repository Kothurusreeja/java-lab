package java5t2;


	
		class Shape
		{
		    String colour;
		    Shape(String colour)
		    {
		        this.colour=colour;
		    }
		    void access()
		    {
		        System.out.println("The colour of Shape is: "+colour);
		    }
		}
		class Circle extends Shape
		{
		    int radius;
		    Circle(int radius,String colour)
		    {
		        super(colour);
		        this.radius=radius;
		        
		    }
		    void area()
		    {
		        System.out.println("Area of Circle: "+3.14*radius*radius);
		    }
		}

		public class Singlelevel {
		
		
		
			public static void main(String[] args) 
			{
		        
		        Circle c=new Circle(5,"purple");
		        c.access();
		        c.area();
			}
		}

	


