import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LoadFile {

	public void loadFile(File fileName) {
		

		try {
			
			
			BytePattern bp = new BytePattern();
			System.out.println("From load file"+fileName);
			FileInputStream fin = new FileInputStream(fileName);
			BufferedInputStream bin = new BufferedInputStream(fin);
			
			int i;
			boolean ans = false;
			//Scanner sc = new Scanner(bin);
			
			
			
			
			while ((i = bin.read()) != -1) {
				
				//System.out.print((char) i);
				
				byte nextByte = (byte) i;
				//System.out.print(nextByte + "\n\n");
				ans = bp.checkNext(nextByte);
				
				// System.out.print(i);
				
				System.out.println(ans +"\n");
				
				if (ans == true) {
					
					System.out.println(bp);
					//filePosition+1-
					//System.out.print((char)i);
				//}
				//System.out.print((char)nextByte);
				//System.out.print(ans);
					
				}
			}	
			
			bin.close();
			fin.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}	
}
