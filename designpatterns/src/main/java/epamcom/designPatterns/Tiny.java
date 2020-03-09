package epamcom.designPatterns;

public class Tiny extends Car{

	 Tiny() {
		super(Cartype.SMALL);
		construct();
		// TODO Auto-generated constructor stub
	}
	 public void construct(){
		 System.out.println("Building small car");
	 }

}
