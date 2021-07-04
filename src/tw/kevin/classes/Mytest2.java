package tw.kevin.classes;

public class Mytest2 {
	private int age; 
	
	public Mytest2(int age) {
		this.age = age;
	}
	
	public int getAge() {return age;}
	
	
	@Override
	public boolean equals(Object obj) {	
		return age == ((Mytest2)obj).getAge();
		}

//	@Override
//	public boolean equals(Object obj) {
//		return super.equals(obj);
//	}

	@Override
	public String toString() {
		return super.toString() + "   I'm " +age;
			
	}

//	@Override
//	public String toString() {
//		return  "I'm " +age;
//	}
}
