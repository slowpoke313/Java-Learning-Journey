<h3 style="text-align:center"> Method in Java </h3>

---

A method in Java is a **block of code**. What it does:

- Performs a specific task.
- **Reusable**, which means we can call a method multiple times instead of writing the same code again and again.
- Can be called from any part of the program.
- Helps in code reusability, organization, and modularity.



**Difference between function and method:**

**Method is called through object of class, but function is called directly.**

In Java, the term "function" is typically used interchangeably with "method." While other programming languages may distinguish between standalone functions and methods tied to a class, Java's object-oriented nature dictates that all executable code resides within classes. Therefore, what are referred to as functions in a general programming context are known as methods in Java.



#### Types of Methods:

1. **Predefined/ Built-in methods**: Methods that are already defined in Java libraries. 

   For example: `.length()`, `.equals()` etc.

2. **User-defined Methods**: Methods written by the programmer.

   For example:

   ```java
   public static int square(int x) 
   {
       return x * x;
   }
   ```

   

#### Method Declaration:

There are a several parts in a method that need to be defined to declaring it. Together they specify the behaviour of the method.

1. **Access Modifier: **

   It controls the **visibility** of the method.

   Examples:

   - `public` → Accessible everywhere.
   - `protected` → Accessible in same package(same folder) + from only subclasses outside the package.
   - `default` (no modifier) → Accessible in same package(same folder).
   - `private` → Accessible only within the same class(same file).

   ![image](AccessModifier.png)

2. **Non-access Modifiers (Optional):** 

   Add special meaning to the method.

   - `static` → Belongs to the class, not objects.

   - `final` → Cannot be overridden.

   - `abstract` → Declared without body, must be implemented by subclass.

   - `synchronized` → Used in multithreading to control access.

   - `native` → Implemented in other languages (like C/C++).

   - `strictfp` → Ensures consistent floating-point calculations across platforms.

3. **Return Type:** 

   The **data type** of the value returned by the method.

   `int`, `double`, `String`, `void` (if nothing is returned).

4. **Method Name:** 

   Name of the method.

   Should follow **camelCase convention**. Examples: `getName()`, `calculateArea()`, `main()`.

5. **Parameters:** 

   Input values for the method, written inside the () separated by comma. Each parameter has a type and a name. Example: `greet(String name, int age)`

Example of a method declaration:

```java
//accessModifier non-accessModifier returnType methodName(parameters)
//{
//		code body
//		return (if returnType not void)
//}

public static int addNumbers(int a, int b)
{
        int c = a + b;
        return c;
}
```



#### Method Calling:

The way we call a method in Java depends on whether it is an **instance method** or a **static method**.

**Instance Method:**

Instance methods belong to objects, so you must **create an object** first and then call the method with the **dot operator**`.`. `.nextInt()`, `.nextLine()` etc are some built-in instance methods.

```java
class dummy
{
    public void greet()	//Creating an instance method
    {
        System.out.println("Hello world!");
    }
}

public class methodCalling 
{
    public static void main(String args[])
    {
        dummy obj = new dummy(); // Creating an object
        obj.greet();			 // Calling the instance method using dot operator.
    }    
}
```



**Static Method:**

Static methods belong to the **class**, not objects. You can call them directly using the **class name**, or **directly** (if inside the same class).

```java
class test
{
    public static int addNumbers(int a, int b)
    {
        int c = a + b;
        return c;
    }
    
    public static void main(String args[])
    {
        int num1 = 10;
        int num2 = 20;

        System.out.println(addNumbers(num1, num2));
    }

}
```

