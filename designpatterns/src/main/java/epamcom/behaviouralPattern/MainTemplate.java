package epamcom.behaviouralPattern;

public class MainTemplate {
	public static void main(String[] args){
		Employees emp = new Program();
		emp.CometoWork();
		System.out.println();
		 emp = new Manager();
		 emp.CometoWork();
	}

}
