# Input Buffer & Scanner Behavior in Java

## Input Buffer (Concept)

-   Java stores keyboard input in a temporary memory area called the
    **input buffer**.
-   Data remains there until `Scanner` methods read it.

## How Scanner Reads Input

-   `next()` → Reads input **only up to space** (ignores spaces).
-   `nextInt()` → Reads only the number and **leaves the newline
    (`\n`)** in the buffer.
-   `nextLine()` → Reads everything **until Enter (`\n`)**.

## Why Extra `nextLine()` is Needed

After methods like `next()` or `nextInt()`:

-   The **Enter key (`\n`) stays in the buffer**.
-   A following `nextLine()` would instantly read this leftover newline.
-   Result → You get **empty input** instead of user data.

### Solution

Call an extra:

``` java
sc.nextLine(); // consumes leftover \n
```

This clears the buffer so the next `nextLine()` works correctly.

## One-Line Summary

`nextLine()` is often used to **consume leftover newline characters**
after other Scanner inputs.

------------------------------------------------------------------------

## Example Code

``` java
import java.util.Scanner;

class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = sc.next();   // Reads only till space

        sc.nextLine();             // Clears leftover newline

        System.out.println("Enter your full address:");
        String address = sc.nextLine(); // Now works correctly

        System.out.println("Enter your age:");
        int age = sc.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
    }
}
```
