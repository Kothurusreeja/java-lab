package java5t2;

class AXIS{
	public double getrateofintrest(double intrest) {
		return intrest;
	}
}
class IOB extends AXIS{
	public double getrateofintrest(double intrest) {
		                              /*same method and datatype used in parent class is 
                                        reused in child class is called polymorphhism
		                                we can modify the value*/
	
		
		return intrest;
	}
public void iobfeature() {
	System.out.println("zero loan");
}
	
	
}
class UNION extends AXIS{
	public double getrateofintrest(double intrest) {
		return intrest;
	}
}
/*class HDFCbank extends Rbibank{
	public int getrateofintrest() {
		return 8;
	}
}*/
public class parinhertance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AXIS rb=new AXIS();
		IOB sb1=new IOB();
		UNION ic1=new UNION();
	    AXIS sb2=new IOB();
	  
		System.out.println("AXIS rate of interest"+rb.getrateofintrest(6.0));
		System.out.println("IOB rate of interest"+sb1.getrateofintrest(7.8));
		System.out.println("UNION rate of interest"+ic1.getrateofintrest(8.2));
		System.out.println("IOB rate of interest"+sb2.getrateofintrest(8.4));
		sb1.iobfeature();

	}

}
