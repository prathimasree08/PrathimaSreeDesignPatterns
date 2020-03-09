package epamcom.behaviouralPattern;

public class Students implements BehaviouralSector {
	  public String[] students = {"Alex","Bob","Merry","Joseph","Alen"};

	public Iterator_1 getIterator() {
		// TODO Auto-generated method stub
		return new StudentsIterator();
	}

	private class StudentsIterator implements Iterator_1 {
		  int index;
	      
	      public boolean hasnext() {
	          if(index < students.length) {
	              return true;
	          } 
	          return false;
	      }

	     
	      public Object next() {
	          if(this.hasnext()) {
	              return students[index++];
	          }
	          return null;
	         
	      }
	}
	}
