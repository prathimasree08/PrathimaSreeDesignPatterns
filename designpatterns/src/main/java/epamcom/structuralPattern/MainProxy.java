package epamcom.structuralPattern;

public class MainProxy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MediaFile med = new MediaProxy("movie.mp3");
		med.printname();
		med.printname();
	}

}
