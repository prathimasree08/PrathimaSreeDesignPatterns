package epamcom.designPatterns;

public class Test {
	public static void main(String[] args){
	System.out.println(Factory.buildCar(Cartype.SMALL));
	System.out.println(Factory.buildCar(Cartype.LUXURY));
	
	}

}
