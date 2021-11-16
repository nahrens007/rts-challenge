import java.util.HashMap;

public class RTSChallenge {

	public static void main(String[] args) 
	{
		RTSChallenge driver = new RTSChallenge();
		System.out.println(driver.stringRotation("MyString",2));
		System.out.println(driver.aboveBelow(new int[] {1,5,2,1,20,24,10,66,6,6,6,6,6,6}, 6));
	}
	
	public HashMap<String,Integer> aboveBelow(int[] numList, int compNum) 
	{
		HashMap<String,Integer> map = new HashMap<>();
		
		// Create keys for above / below / equal with default value of 0
		map.put("equal", 0);
		map.put("above", 0);
		map.put("below", 0);
		
		for (int i = 0; i < numList.length; i++)
		{
			// Increment key value by 1 for each case
			if (numList[i] > compNum) {
				map.put("above", map.get("above").intValue()+1);
			} else if (numList[i] < compNum) {
				map.put("below", map.get("below").intValue()+1);
			} else {
				map.put("equal", map.get("equal").intValue()+1);
			}
		}
		
		return map;
	}
	
	public String stringRotation(String str, int rotation)
	{
		/*
		 * Comments using example of str="MyString", rotation=2
		 * Desired output of "ngMyStri";
		 */
		
		int len = str.length(); // = 8
		
		// In the event rotation > len
		int shift = rotation%len;  // 2%8 = 2; 2%10 = 2
		
		// Characters remaining, not moving. 
		int rem = len-shift; // 8-2 = 6
		
		// New char array, will build new string. 
		char[] charStr = new char[len];
		
		for (int i = 0; i < len; i++) 
		{
			/*
			 * In example "MyString", rem=6, i=0, len=8.
			 * Shifting 2, we want the first character in the new string to be the 6th character in the original string. 
			 * So, we have these series of iterations:
			 * 1: charStr[0] = str.charAt((6+0)%8) = str.charAt(6%8) = str.charAt(6) = 'n'
			 * 2: charStr[1] = str.charAt((6+1)%8) = str.charAt(7%8) = str.charAt(7) = 'g'
			 * 3: charStr[2] = str.charAt((6+2)%8) = str.charAt(8%8) = str.charAt(0) = 'M'
			 * 4: charStr[3] = str.charAt((6+3)%8) = str.charAt(9%8) = str.charAt(1) = 'y'
			 */
			charStr[i] = str.charAt((rem+i)%len);
		}
		
		// Create and return String object from the char array.
		return new String(charStr);
	}

}
