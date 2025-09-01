package programs;

public class Default {
		    String first_name = "sai";
		    String last_name = "priya";
		    int age = 22;
		    
		    Default(){
		    System.out.println("default constructor");
		    }
		  public static void main(String[] args) {
		      
			  Default Obj = new Default();
		       System.out.println("Name: " + Obj.first_name + " " + Obj.last_name);
		       System.out.println("Age: " + Obj.age);
		  }

		

		
	}


