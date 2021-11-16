# rts-challenge
Provides a class with 2 functions. 
- aboveBelow(int[], int) : HashMap<String,Integer>
  - Returns a HashMap with keys for "above","below","equal", with the Integer value of the key being the count of times an integer from the int[] occurs that is less than, greater than, or equal to the int argument. 
  - Example: aboveBelow(new int[] {1,5,2,1,20,24,10,66,6,6,6,6,6,6}, 6) = {equal=6, below=4, above=4}
- stringRotation(String, int) : String 
  - Returns a string with it's characters rotated by the amount specified by the int argument. 
  - Example: stringRotation("MyString",2) = "ngMyStri"
