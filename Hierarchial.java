package java5t2;


		
		class College {
		    public void display() {
		        System.out.println("BVRITH");
		    }
		}

		class Course extends College {
		    public void display() {
		        System.out.println("btech");
		    }

		    public void CourseFeature() {
		        System.out.println("computer science and engineerinng");
		    }
		}

		class section extends College {
		    public void display() {
		        System.out.println("CSE-E");
		    }

		    public void sectionFeature() {
		        System.out.println("one of the section");
		    }
		}

		class Rollno extends College{
		    public void display() {
		        System.out.println("5t2");
		    }

		    public void RollnoFeature() {
		        System.out.println("one of the 71");
		    }
		}

		public class Hierarchial {
		    public static void main(String[] args) {
		        Course c1 = new Course();
		        section sec = new section();
		         Rollno rn= new Rollno();
                College col=new College();
                col.display();
		        c1.display();        
		        c1.CourseFeature();   
		       sec.display();      
		        sec.sectionFeature(); 

		        rn.display();        
		        rn.RollnoFeature(); 
		    }
		

	

}
