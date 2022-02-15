
public class Application {
	public static void main(String[] args) {

		// Inefficient
		String aboutMe = "";
		aboutMe += "I am Lamin.";
		aboutMe += " ";
		aboutMe += "I am from Sierra Leone.";
		System.out.println(aboutMe);

		// More efficient

		StringBuilder sb = new StringBuilder(" ");
		sb.append("I am a Software Engineer");
		sb.append(" ");
		sb.append("from Italy.");

		System.out.println(sb.toString());

		StringBuilder s = new StringBuilder();
		s.append("I am learning Java").append(" ").append("from a great tutor.");
		System.out.println(s.toString());
		
		///Formatting//////////////////////////////////
		System.out.print("That's awesome!\tThat's a tab.\nThat's a new line.");
		System.out.println("Some more info.");
		
		//Formatting integers
		System.out.printf("Total cost: %d; quantity is:%d",10,67);
		for(int i=0;i<40;i++) {
			System.out.printf("%-2d: %s\n",i,"here is some new text");
			
			//Formatting floating point
			System.out.printf("Total value:%f\n",8.9);
		}
	}
}
