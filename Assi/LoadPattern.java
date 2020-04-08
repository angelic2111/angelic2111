import java.io.File;
import java.util.Scanner;

public class LoadPattern {
	
	public void loadPattern (File patternFile, byte value) {
		
		try {
			byte bytes;
			int i = 0;
			int sum = 0;
			//MyBytePattern mbp = new MyBytePattern();
			Scanner sc = new Scanner(patternFile);
			
			String pattern;
			String temp = null;
			
		//	String pattern = sc.findInLine(pattern);
			
			while (sc.hasNextLine()) {
				
				pattern = sc.nextLine();
				
				//byte bytes[] = pattern.getBytes();
				
				while (sc.hasNext()) {
					
					temp = sc.next();
					
				
					
					i = Integer.parseInt(temp);
					//System.out.println(bytes[i]);
					//(String) value;
					
					if (i==value) {
						
						sum++;
						
						if (temp.length() == sum) {
							
							System.out.println("Half work done");
						}
						
						
					}
				}
				
			}
			
			sc.close();
			
		}
		
		catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
