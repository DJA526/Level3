import java.util.ArrayList;

public class LongArrayList {
	
	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<String>();
		int i = 0;
		while (true) {
			try {
				i++;
				strings.add("string");
				
			} catch (OutOfMemoryError e) {
				System.out.println(i);
				break;
			}
		}
	}

}
