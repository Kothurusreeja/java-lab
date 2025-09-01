package programs;


	
		class parametarized_constructor{
		    String Name;
		    String section;
		    int classRoomNo;
		    parametarized_constructor(){
		        System.out.println("Default Constructor"); // Default constructor with no parameters
		    }
		    parametarized_constructor(String Name){
		            System.out.println("Hello "+ Name); // One parameterized constructor
		    }
		    parametarized_constructor(String Name,String section){
		        System.out.println("Hii "+Name + " Welcome to "+section); // Two parameterized constructor
		        
		    }
		    parametarized_constructor(String Name,String section,int classRoomNo){
		        System.out.println("Hey "+Name +"Welcome to"+ section +  " Your Class Room No: "+classRoomNo); // Three parameterized constructor
		        
		    }
		}

		public class Parametrized{

		    public static void main(String[] args) {
		        // TODO Auto-generated method stub
		        parametarized_constructor par = new parametarized_constructor();  //no parameters
		        parametarized_constructor par1 = new parametarized_constructor("sreeja");
		        parametarized_constructor par2 = new parametarized_constructor("sreeja","CSE_E");//two parameters
		        parametarized_constructor par3 = new parametarized_constructor("sreeja","CSE_E",207);//three parameters
		    }
		}

