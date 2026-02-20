import java.util.Scanner;

class MyClass{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("What is you name");
        String firstName = sc.next(); // take input till spaces 

        sc.nextLine(); // just to ignore \n 
        // String fullname = sc.nextLine(); // take name till \n i.e "Enter"


        System.out.println("What is your age");
        
        int age = sc.nextInt();

        System.out.println("Your Name is : " + firstName + ".");
        System.out.println("Your age is : " + age + ".");
 

    }
}


// Input Buffer (Concept)

// Java stores keyboard input in a temporary memory area called the input buffer.

// Data stays there until methods like next(), nextInt(), nextLine() read it.

// How Scanner Reads Input

// sc.next() → reads only up to space (ignores spaces).

// sc.nextInt() → reads only the number, leaves Enter (\n) behind.

// sc.nextLine() → reads until Enter (\n).

// Why the Extra sc.nextLine() is Needed

// After next() / nextInt(), the newline (\n) remains in the buffer.

// The next nextLine() would immediately read this leftover \n → resulting in empty input.

// Calling sc.nextLine() once clears the buffer (consumes the leftover newline).

// In One Line

// sc.nextLine() is used to consume the leftover Enter (\n) so future line input works correctly.