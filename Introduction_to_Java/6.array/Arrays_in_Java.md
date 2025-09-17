### 					          Arrays in Java

---

An array is a container object that holds a fixed number of elements of a single type. Here, all elements are stored in **contiguous memory locations**. Once created, **the size of an array cannot change**. Each element can be accessed using an index (starting from 0).

#### Array Declaration:

In Java, arrays are built-in objects. We can declare arrays in 3 ways:

1. `dataType[] arrayName = new dataType[arraySize]`

   ```java
   int[] arr = new int[5]
   ```

2. `dataType[] arrayName = new dataType[] {emem1, elem2, elem3....}`

   ```java
   int[] arr = new int[] {0,9,8,7};
   ```

3. `dataType[] arrayName = {emem1, elem2, elem3....}`

   ```java
   String[] arr = {str1, str2, str3, str4}
   ```



#### Properties of Array:

- Arrays in Java are **objects**, so they are stored in the **heap** (even if they hold primitives).

- Once an array is created, its **size cannot be changed**.

- An array can only store elements of the **same data type**. (Primitive or Object)

- When created, arrays are automatically initialized with default values depending on the data type:

  - Numeric types → `0`
  - boolean → `false`
  - Objects → `null`

  ```java
  int[] arr = new int[3];
  System.out.println(Arrays.toString(arr)); // Output: [0, 0, 0]
  ```

- Arrays have a **public final field** called `.length` . Note: **This is not a method.** 

  ```java
  int[] arr = {1, 2, 3, 4};
  System.out.println(arr.length); // Output: 4
  ```

- We use loops to iterate over arrays in java. For loops, enhanced for loops and other loops are used depending on what we intend to do.

  ``` java
  //for loop:
  for(int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
  }
  
  //enhanced for loop:
  for(int num : arr) {
      System.out.println(num);
  }
  ```

- Java supports **multidimensional arrays** (arrays of arrays). This usually used to create matrix.

  ```java
  //Simple declaration:
  int[][] matrix = {{1, 2}, {3, 4}};
  
  //Example:
  int[][] matrix = new int[2][3];
  matrix[0][0] = 1;
  matrix[0][1] = 2;
  matrix[1][2] = 3;
  
  for(int i = 0; i < matrix.length; i++) {
      for(int j = 0; j < matrix[i].length; j++) {
          System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
  }
  ```

  

#### Methods of Array:

In Java, arrays themselves do not have methods (they only have the `.length` property).
Arrays are part of the language, not a class with methods.

To make array operations easier Java gives us the `java.util.Arrays` utility class that provides many static methods to work with arrays. Therefore, to use these methods we need to first import the class by,

```java
import java.util.Arrays
```



1. `Arrays.toString(arrayName)`

   Convert array to a readable string.

   ```java
   int[] arr = {1, 2, 3};
   System.out.println(Arrays.toString(arr)); // [1, 2, 3]
   ```



2. `Arrays.deepToString(arrayName)`

   ```java
   int[][] matrix = {{1, 2}, {3, 4}};
   System.out.println(Arrays.deepToString(matrix)); // [[1, 2], [3, 4]]
   ```



3. `Arrays.equals(arr1,arr2)`

   Compares two one dimensional arrays (element by element). Returns a boolean value.

   ```java
   int[] a = {1, 2, 3};
   int[] b = {1, 2, 3};
   System.out.println(Arrays.equals(a, b)); // true
   ```

   

4. `Arrays.deepEquals(arr1,arr2)`

   Compares two multidimensional arrays and returns a Boolean value.

   ```java
   int[][] a = {{1, 2}, {3, 4}};
   int[][] b = {{1, 2}, {3, 4}};
   System.out.println(Arrays.deepEquals(a, b)); // true
   ```

   

5. `Arrays.compare(arr1,arr2)`

   It is a static method (Java 9+) that **compares two arrays lexicographically** (element by element).

   It works just like comparing words in a dictionary:

   - The first pair of elements that differ decides the result.
   - If all elements are equal but lengths differ, the shorter array is considered smaller.

   It returns an integer value. 

   `0` → arrays are equal

   `-1` → first array is **less than** the second

   `1` → first array is **greater than** the second

   ```java
   import java.util.Arrays;
   
   public class Test {
       public static void main(String[] args) {
           int[] a = {1, 2, 3};
           int[] b = {1, 2, 3};
           
           System.out.println(Arrays.compare(a, b)); // 0
           
           int[] c = {1, 2, 3};
   		int[] d = {1, 2, 4};
   
   		System.out.println(Arrays.compare(c, d)); // -1 (because 3 < 4)
   		
           int[] e = {1, 2};
   		int[] f = {1, 2, 0};
   
   		System.out.println(Arrays.compare(e, f)); // -1 (shorter array is "smaller")
           
           String[] g = {"apple", "banana"};
   		String[] h = {"apple", "cherry"};
   
   		System.out.println(Arrays.compare(g,h)); // -1 (banana < cherry)
   		// here only the first char of the element is compared. Ascii of b is 98
           // Ascii of c is 99. b<c, therefore, -1. The comparison stops right here.
   
       }
   }
   ```



6. `Arrays.copyOf(arr, sizeOfTheNewArray)`

   Copies an array (with a new length). The first parameter is the array which I am going to copy and the second parameter is the size of the new array in which I am copying.

   ```java
   int[] arr = {1, 2, 3};
   int[] copy = Arrays.copyOf(arr, 5);
   System.out.println(Arrays.toString(copy)); // [1, 2, 3, 0, 0]
   ```



7. `Arrays.copyOfRange(arr, fromIndexNumber, tillIndexNumber)`

   Copies a specific range from an array. If we put a greater value than the size of `arr` in the 3rd parameter, it will just put default value in those positions. 

   ```java
   int[] arr = {1, 2, 3, 4, 5};
   int[] copy = Arrays.copyOfRange(arr, 1, 4);
   System.out.println(Arrays.toString(copy)); // [2, 3, 4]
   
   int[] arr2 = {1, 2, 3, 4, 5};
   int[] copy2 = Arrays.copyOfRange(arr2, 1, 8);
   System.out.println(Arrays.toString(copy)); // [2, 3, 4, 5, 0, 0, 0]
   ```



**Pass by reference of array:**

```java
int [] arr1 = {0,9,8,5};
int [] arr2;

arr2 = arr1;
```

This `arr2 = arr1;` is called pass by reference as array arr1 and arr2 array are pointing at the same memory location. Therefore, if we change anything in arr2 it will change in arr1 and vice versa. Both of them are the same array.



8. `Arrays.fill(arr, value)`

   Fills an array with a given value. 

   ```java
   int[] arr = new int[5];
   Arrays.fill(arr, 7);
   System.out.println(Arrays.toString(arr)); // [7, 7, 7, 7, 7]
   ```

   

9. `Array.mismatch(arr1,arr2)`

   Compares two array and returns the index of the first mismatch element. Returns `-1` if they are **equal**.

   ```java
   int[] arr1 = {10, 20, 30, 40};
   int[] arr2 = {10, 25, 30, 40};
   
   System.out.println(Arrays.mismatch(arr1, arr2));  // Output: 1 (first mismatch at index 1)
   
   int[] arr3 = {1, 2, 3};
   int[] arr4 = {1, 2, 3, 4};
   
   System.out.println(Arrays.mismatch(arr3, arr4));  // Output: 3 (arr1 ends at index 2, mismatch at index 3)
   
   int[] arr5 = {1, 2, 3};
   int[] arr6 = {1, 2, 3};
           
   int index = Arrays.mismatch(arr5, arr6);
   System.out.println(index);  // -1 (no mismatch)
   ```

   

10. `Arrays.sort(arr)` or `Arrays.sort(arr, startIndex, tillIndex)`

    Sorts `arr` in ascending order. this could be also used for strings, character as well. They are sorted alphabetically. Moreover, if range is applied, the method only sorts the given range, everything else stays the same.

    ```java
    int[] arr = {5, 2, 9};
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr)); // [2, 5, 9]
    ```

    

11. `Arrays.binarySearch(arr1, elemToSearch)`

    It returns the index of the searched element in `arr`. **THE ARRAY MUST BE SORTED** for this method to work {Binary search requirement}. If the given element is not found then it returns `-1`. If duplicates exist, it is uncertain which index will be returned.

    ```java
    int[] arr = {2, 5, 9};
    int index = Arrays.binarySearch(arr, 5); 
    System.out.println(index); // 1
    ```

    