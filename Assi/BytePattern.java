import java.util.Stack;

/*
 * A single set of byte that represents the pattern
 */
public class BytePattern {
	
	/*
	 * The byte within the pattern
	 */
	private byte[] bytes;
	private byte[] byte1 = new byte[]{0x41, 0x42, 0x43};
	private byte[] byte2 = new byte[]{0x58, 0x59, 0x5A};
	private byte[] holdCheck;
	//------------------------------------------------------------------------------------------
	
	//This may use do not delete
	//private byte[] byte1 = new byte [] {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};
	
	
	//System.out.println(byte1);
	
	/*
	 * The next position to be checked within the pattern's byte array 
	 */
	private int checkPos = 0;
	
	/*
	 * Checks if the given value matches the next byte to be checked within the pattern.
	 * 
	 * Each time this method is called, it progress to the next byte within the pattern, until the value doesnot 
	 * match or the end of the pattern is reached(in which case a match has been found)
	 */
	
	//to know the value of each pattern at a time
	byte next;
	boolean ans = false;
	
	// to know when to end the pattern 
	int end = byte1.length; 
	
	long filePosition = 0;
	
	public boolean checkNext(byte Value)  {
			
			filePosition++;
		
		
			next = byte1[checkPos];
			System.out.println("I am value : " +Value);
			System.out.println("\n I am next : " +next);
			
			if (Value == next) {
				
				checkPos++;
				
				if (end == checkPos) {
					//System.out.println("Pattern found : " +(char) Value);
					
					ans = true;
					checkPos = 0;
					
				}
				
			}
			else {
				
				checkPos = 0;
			
			}
			
			System.out.println(ans);
			return ans;
	}
	
	@Override
	public String toString() {
		
		long offset = filePosition + 1 - end;
		
		StringBuilder st = new StringBuilder();
		
		for (byte b : byte1 ) {
			
			st.append(Integer.toHexString(b));
		}
		
		return("Pattern found: " +(st) +", at offset: " +offset + " within the file");
		
		
		
	}
					
		
		
		
		
		//--------------------------------------Wait for it------------------------------------------------------------
		//System.out.println(Value +"\n\n");
		//boolean ans = false;
		//for (int i :byte1) {
			//System.out.println(Value);
			//
			//if (Value == i) {
			//	System.out.println(i +"\n\n");
				//checkPos++;
			//	ans = true;
			//}
			
		//}
		//System.out.println(ans +"\n\n");
		//return ans;
		//System.out.println(ans +"\n\n");
		//-----------------------------------------------------Wait-----------------------------------------------------------
	
	
}
