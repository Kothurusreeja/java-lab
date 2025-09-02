package java5t2;
class gp{
	gp(){
		
		System.out.println("grandparent class");
	}
}
class p extends gp
{
	p(){
		super();
		System.out.println("parent class");
	}
}
class c extends p{
	c(){
		
	super();
	System.out.println("children class");
}
}

public class Superkey {

	public static void main(String[] args) {
	c c1=new c();


	}

}
