package tw.kevin;

public class Brad28 {

	public static void main(String[] args) {
		// 1.Length = 10
		//身分證
		String id1 ="H124066179";
		String id = id1.toLowerCase();
		if(id.matches(id="[a-z][12][0-9]{8}")) {
			System.out.println("Right");
		}else {
			System.out.println("Wrong");
		}
		
	}

}
