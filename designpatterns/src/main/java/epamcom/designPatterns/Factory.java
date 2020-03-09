package epamcom.designPatterns;

public class Factory {
	public static Car buildCar(Cartype model){
		 Car car = null;
	        switch (model) {
	        case SMALL:
	            car = new Tiny();
	            break;
	        case LUXURY:
	            car = new Luxury();
	            break;
	 
	        default:
	            break;
	        }
	        return car;
		
	}

}
