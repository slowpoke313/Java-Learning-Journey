###                                		String in Java

---

#### How to declare String:

In Java, String is a class, not a primitive type like int, Boolean, double. Therefore, the right way to declare a string is: 

```java
String nameOfString = new String("Hello World! This is a String!");
```



But as we, the developers use string very often, java creates a class by default behind the scene. Therefore, we can just write: 

```java
String nameOfString = "Hello World! This is a String!";
```

**Note:** *When declaring string type, in `String` "S" is capital.*



#### Some Important Theory:

- Strings are immutable in Java. When we create a String object in Java, it is stored in memory (*often in the string pool if created with string literals*). Once a String is created, its value cannot be changed. Any operation that seems to modify a string (like concatenation, replace, etc.) actually creates a new String object in memory, while the original remains unchanged.

  ```java
  String s1 = "Hello";
  String s2 = s1.concat(" World");
  
  System.out.println(s1); // Output: Hello
  System.out.println(s2); // Output: Hello World
  ```

  Here, `s1` is unchanged. `s2` refers to a **new string object** created by concatenation.



- In java we can directly do arithmetic operations with a character.

  ```java
  String str = "Cool" + "Car";
  System.out.println(str); //Output: CoolCar
  
  int n = 'a' + 5;
  char p = 'a' + 9;
  System.out.println(n); // Output: 102 (ascii value of a is 97)
  System.out.println(p); // Output: j (ascii value of j is 106)
  ```

  

- A string has (n(n+1))/2 substrings. **[without an empty substring]**
  Substrings must follow two rules. 

  1. Continuity  
  2. Order

  "abc" has 6 substrings. They are:
  a 	b	c
  ab 	bc
  abc 



#### Methods/Functions:

1. `str.charAt(index)`

   Returns the character at the given index.

   ```java
   String str = "Hello";
   System.out.println(str.charAt(1)); // Output: e
   ```

   **Note:**

   We can type cast an integer to get a character. Here, the compiler treats the integer as an Ascii value and returns the character of that value. (Check Ascii Table)

   ```java
   int n = 102;
   System.out.println((char)n); //Output: f (ascii value of f is 102)
   ```

   

2. `str.codePointAt(index)`

   Returns the Unicode or the Ascii value(integer) of the character at the given index.

   ```java
   String str = "A";
   System.out.println(str.codePointAt(0)); // Output: 65 (Unicode of 'A')
   ```

   

3. `str.indexOf("")`

   Returns the index of the **first occurrence** of the given substring. Returns `-1` if not found.

   ```java
   String str = "Hello World";
   System.out.println(str.indexOf("World")); // Output: 6
   ```

   

4. `str.indexOf("subString", startingIndex)`

   Returns the index of the first occurrence of the substring starting search from a given index.

   ```java
   String str = "banana";
   System.out.println(str.indexOf("a", 2)); // Output: 3
   ```

   

5. `str.lastIndexOf("")`

   Returns the index of the **last occurrence** of the given substring.

   ```java
   String str = "banana";
   System.out.println(str.lastIndexOf("a")); // Output: 5
   ```

   

6. `str.lastIndexOf("", index)`

   Returns the index of the **last occurrence** of the substring, searching backward from the given index.

   ```java
   String str = "banana";
   System.out.println(str.lastIndexOf("a", 4)); // Output: 3
   ```

   

7. `s1.equals(s2)`

   Checks if two strings are exactly equal (**case-sensitive**). Returns Boolean value.

   ```java
   String s1 = "Hello";
   String s2 = "Hello";
   System.out.println(s1.equals(s2)); // Output: true
   ```

   

8. `s1.equalsIgnoreCase(s2)`

   Checks if two strings are equal, ignoring case differences. Returns Boolean value.

   ```java
   String s1 = "hello";
   String s2 = "HELLO";
   System.out.println(s1.equalsIgnoreCase(s2)); // Output: true
   ```

   

9. `s1.toUpperCase()`

   Converts all characters in the string to uppercase.

   ```java
   String s1 = "hello";
   System.out.println(s1.toUpperCase()); // Output: HELLO
   
   System.out.println("cool".toUpperCase()); // Output: COOL
   System.out.println(Character.toUpperCase('p')) // Output: P
   ```

   

10. `s1.toLowerCase()`

    Converts all characters in the string to lowercase.

    ```java
    String s1 = "HELLO";
    System.out.println(s1.toLowerCase()); // Output: hello
    
    System.out.println("COOL".toLowerCase()); // Output: cool
    System.out.println(Character.toLowerCase('P')) // Output: p
    ```

    

11. `s1.compareTo(s2)`

    Compares two strings **lexicographically** (dictionary order).

    - Returns `0` if equal
    - `<0` if `s1 < s2`
    - `>0` if `s1 > s2`

    ```java
    String s1 = "apple";
    String s2 = "exercise";
    System.out.println(s1.compareTo(s2)); // Output: -4 (since "apple" < "exercise")
    ```

    - `"apple"` vs `"exercise"`

    Compare first characters:

    - `'a'` (Unicode 97) vs `'e'` (Unicode 101)

    Since 97 − 101 = -4, Java stops here and returns -4.
    It doesn’t need to check the rest of the characters, because the ordering is already decided by the first mismatch.

    

12. `s1.trim()`

    Removes leading and trailing spaces.

    ```java
    String s1 = "   Hello World   ";
    System.out.println(s1.trim()); // Output: "Hello World"
    ```

    

13. `s1.concat("another string")`

    Concatenates (joins) the given string with another.

    ```java
    String s1 = "Hello";
    System.out.println(s1.concat(" World")); // Output: Hello World
    ```

    

14. `s1.substring(index)`

    Returns the substring starting from the given index to the end.

    ```java
    String s1 = "Hello";
    System.out.println(s1.substring(2)); // Output: llo
    ```

    

15. `s1.substring(start, end)`

    Returns substring from `start` index (inclusive) to `end` index (exclusive).

    ```java
    String s1 = "Hello";
    System.out.println(s1.substring(1, 4)); // Output: ell
    ```

    

16. `str.replace(oldChar, newChar)`

    Replaces all occurrences of oldChar character with newChar character.

    ```java
    String str = "banana";
    System.out.println(str.replace('a', 'o')); // Output: bonono
    ```

    

17. `str.replaceAll(String regex, "replacement String")`

    This function replaces **all substrings** of a string that match the given **regular expression (regex)** with the specified replacement. it’s not just a simple text replace, it’s regex-powered.

    ```java
    String text1 = "apple apple apple";
    String result = text.replaceAll("apple", "orange");
    System.out.println(result); // Output: orange orange orange
    
    String text2 = "one1two2three3";
    String result = text.replaceAll("\\d", "#"); //Here \\d (regex) means any digit.
    System.out.println(result); // Output: one#two#three#
    
    String text3 = "Java    is   fun";
    String result = text.replaceAll("\\s+", " "); //\\s+ → regex meaning "one or more whitespace characters".
    System.out.println(result); // Output: Java is fun
    ```

    

18. `str.startsWith("prefix")`

    Checks if the string **starts with** the given prefix. Returns `true` or `false`.

    ```java
    String str = "Hello World";
    System.out.println(str.startsWith("Hello")); // Output: true
    System.out.println(str.startsWith("World")); // Output: false
    ```

    

19. `str.endsWith("suffix")`

    Checks if the string **ends with** the given suffix. Returns `true` or `false`.

    ```java
    String str = "Hello World";
    System.out.println(str.endsWith("World")); // Output: true
    System.out.println(str.endsWith("Hello")); // Output: false
    ```

    

20. `str.length()`

    Returns the length of the string.

    ```java
    String str = "Hello";
    System.out.println(str.length()); // Output: 5
    
    ```

    

21. `str.codePointCount(startIndex, endIndex)`

    Returns the **number of Unicode code points** in the substring from `startIndex` (inclusive) to `endIndex` (exclusive). 

    ```java
    String str = "Hello";
    System.out.println(str.codePointCount(1, 4)); // Output: 3 ('e', 'l', 'l')
    ```

    This method works like `str.length()` but there is a certain difference. Some Unicode characters (like emojis, certain Asian characters, or characters outside the Basic Multilingual Plane) are represented as **two** `char` **values** (a *surrogate pair*).

    - `String.length()` counts **char units**, not actual characters.

    - `codePointCount()` counts the actual **characters/code points**.

      

22. `str.toCharArray()`

    Converts the string into a **character array**.

    ```java
    String str = "Hello";
    char[] arr = str.toCharArray();
    for(char c : arr) 
    {
        System.out.print(c + " "); // Output: H e l l o 
    }
    ```

23. `str.substring(startIndex, endIndex)`

    Used to slice a string or create a substring of that string.

    ```java
    String str = "Hello World!";
    String sub = str.substring(6);
    System.out.print(sub); //Output: World!
    
    sub = str.substring(2,8);
    System.out.print(sub); //Output: llo Wo
    ```

    



#### Escape Sequence Characters:

1. `\n` --- new line
2. `\t` --- tab
3. `\"` --- to use quotation inside a string
4. `\'` --- to use single quotation inside a string
5. `\\` --- to use \ inside a string

More info at: https://docs.oracle.com/javase/tutorial/java/data/characters.html



As we already know that by default strings are immutable. When we store a string in a variable it stores the string in a "String constant pool". There each string has an address tagged to it which indicates to the variable. That string in the string constant pool cannot be changed.

But if we want mutable strings then we need to use **string buffer** or **string builder** class.

string buffer and string builder are the same. There is just one difference. String buffer is thread safe but string builder is not.

