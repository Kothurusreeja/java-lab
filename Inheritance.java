package java5t2;
class Rbibank{
	public double getrateofintrest() {
		return 5.0;
	}
}
class SBIbank extends Rbibank{
	public double getrateofintrest() {
		                              /*same method and datatype used in parent class is 
                                        reused in child class is called polymorphhism
		                                we can modify the value*/
	
		
		return 6.5;
	}
public void sbifeature() {
	System.out.println("zero loan");
}
	
	
}
class ICICIbank extends Rbibank{
	public double getrateofintrest() {
		return 7.5;
	}
}
/*class HDFCbank extends Rbibank{
	public int getrateofintrest() {
		return 8;
	}
}*/
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rbibank rb=new Rbibank();
		SBIbank sb1=new SBIbank();
		ICICIbank ic1=new ICICIbank();
	    Rbibank sb2=new SBIbank();
	  
		System.out.println("RBI rate of interest"+rb.getrateofintrest());
		System.out.println("SBI rate of interest"+sb1.getrateofintrest());
		System.out.println("ICICI rate of interest"+ic1.getrateofintrest());
		System.out.println("SBI rate of interest"+sb2.getrateofintrest());
		sb1.sbifeature();

	}

}
