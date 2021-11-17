# rts-challenge
Please write a class in the language of your choice that contains the following two public methods:

- aboveBelow accepts two arguments
  - An unsorted collection of integers (the list)
  - An integer (the comparison value)
  - Returns a hash/object/map/etc. with the keys "above" and "below" with the corresponding count of integers from the list that are above or below the comparison value
```
Example usage:
  input: [1, 5, 2, 1, 10], 6
  output: { "above": 1, "below": 4 }
```

- stringRotation accepts two arguments
  - A string (the original string)
  - A positive integer (the rotation amount)
  - Returns a new string, rotating the characters in the original string to the right by the rotation amount and have the overflow appear at the beginning
```
Example usage:
  input: "MyString", 2
  output: "ngMyStri"
```

# Solution
Provides a class with 2 functions. 
- aboveBelow(int[], int) : HashMap<String,Integer>
  - Returns a HashMap with keys for "above","below","equal", with the Integer value of the key being the count of times an integer from the int[] occurs that is less than, greater than, or equal to the int argument. 
  - Example: aboveBelow(new int[] {1,5,2,1,20,24,10,66,6,6,6,6,6,6}, 6) = {equal=6, below=4, above=4}
- stringRotation(String, int) : String 
  - Returns a string with it's characters rotated by the amount specified by the int argument. 
  - Example: stringRotation("MyString",2) = "ngMyStri"
