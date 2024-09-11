// This is the basic structure of a Java class
// Start a Java program by declaring the class
// Class name MUST MATCH the file name (Main.java)

public class Main {

   // This is the MAIN METHOD (like a function)
   public static void main(String []args) {
      // Statement below tells Java to print to the TERMINAL
      // Semicolon ; indicates the end of the statement
      System.out.println("Hello World");
      

      // print will output on the same line, println outputs on the next line oooo
      System.out.print("apcs");
      System.out.print(" is fun");

      // declare variables
      // primitive types
      int students;
      boolean isRaining; // camelCase for multi-word names
      double cash;

      // assigning values to the variables
      students = 8;
      cash = 5.00;
      isRaining = false; // false is "off", or 0
      
      // instantiate or initialize (declare + assign in one line)
      int numClasses = 9;
      double gpa = 3.4;
      boolean isSnowing = false;


   }
}
