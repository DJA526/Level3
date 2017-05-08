import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Copyright {
	
	public static void main(String[] args) {
		
		File[] files = new File("src").listFiles();
		for(File f : files) {
			String name = f.getAbsolutePath();
			if (name.contains(".java")) {
				try {
					FileWriter fw = new FileWriter(name, true);
					fw.write("\n\n//Copyright © 2017 by Delara Aryan");	
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}


//Copyright © 2017 by Delara Aryan