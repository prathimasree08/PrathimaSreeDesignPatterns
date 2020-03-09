package epamcom.behaviouralPattern;

public abstract class Employees {
	abstract void work();
	abstract void takebreak();
	abstract void getpaid();
	public final void CometoWork(){
		work();
		takebreak();
		work();
		
	}	

}
