package epamcom.structuralPattern;

public class MediaProxy implements MediaFile{
	private File mediaFileImpl;
	   private String Filename;

	   public MediaProxy(String Filename){
	      this.Filename = Filename;
	   }

	   public void printname() {
	      if(mediaFileImpl == null){
	         mediaFileImpl = new File(Filename);
	      }
	      mediaFileImpl.printname();
	   }
}
