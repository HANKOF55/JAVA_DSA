# Java Literals -- Complete Guide

## What is a Literal in Java?

A **literal** is a fixed constant value written directly in the Java
source code.\
It represents data that does not change during program execution.

Example:

``` java
int x = 10;   // 10 is a literal
char c = 'A'; // 'A' is a literal
```

------------------------------------------------------------------------

## Why Literals Matter

Literals help the compiler determine:

-   Data type
-   Memory allocation
-   Valid value ranges
-   Type conversions

------------------------------------------------------------------------

## Types of Literals in Java

Java supports the following literal types:

1.  Integer Literals\
2.  Floating-Point Literals\
3.  Character Literals\
4.  String Literals\
5.  Boolean Literals\
6.  Null Literal

------------------------------------------------------------------------

## 1. Integer Literals

Whole numbers without decimal points.

``` java
int a = 10;
```

### Number Systems

  System        Prefix   Example
  ------------- -------- ---------
  Decimal       None     10
  Octal         0        012
  Hexadecimal   0x       0xA
  Binary        0b       0b1010

### Default Type

All integer literals are `int` by default.

``` java
long num = 10000000000L; // Correct
```

Use `L` for long literals.

------------------------------------------------------------------------

### Underscore Usage (Readability)

``` java
int salary = 1_00_000;
```

Rules:

-   Allowed between digits
-   Not allowed at beginning or end
-   Not allowed near suffixes

------------------------------------------------------------------------

## 2. Floating-Point Literals

Numbers with decimal points.

``` java
double pi = 3.14;
```

### Default Type

Floating literals are `double` by default.

``` java
float f = 3.14f; // Use 'f' suffix
```

Suffixes:

-   `f` → float
-   `d` → double (optional)

------------------------------------------------------------------------

### Scientific Notation

``` java
double num = 1.2e3; // 1200.0
```

------------------------------------------------------------------------

## 3. Character Literals

Single character enclosed in single quotes.

``` java
char letter = 'A';
```

### Escape Sequences

  Escape             Meaning
  ------------------ --------------
  `\n`{=tex}         New line
  `\t |`{=tex} Tab   
  \'                 Single quote
  \"                 Double quote
  \\                 Backslash

------------------------------------------------------------------------

### Unicode Literals

``` java
char heart = '\u2764';
```

Format: `\uXXXX`

------------------------------------------------------------------------

## 4. String Literals

Sequence of characters inside double quotes.

``` java
String name = "Harish";
```

### Memory Behavior

Stored in the **String Pool** for optimization.

``` java
String a = "Hello";
String b = "Hello"; // Same object reference
```

------------------------------------------------------------------------

## 5. Boolean Literals

Only two values:

``` java
true
false
```

Must be lowercase.

------------------------------------------------------------------------

## 6. Null Literal

Represents absence of object reference.

``` java
String data = null;
```

Cannot be used with primitive types.

------------------------------------------------------------------------

## Compiler Treatment of Literals

Compiler infers type based on:

-   Value format
-   Suffix
-   Assignment context

Example:

``` java
var x = 10;   // int
var y = 10.5; // double
```

------------------------------------------------------------------------

## Common Errors (Exam Traps)

### Wrong float assignment

``` java
float f = 3.14; // Error
float f = 3.14f; // Correct
```

------------------------------------------------------------------------

### Large integer without suffix

``` java
long l = 9999999999; // Error
long l = 9999999999L; // Correct
```

------------------------------------------------------------------------

### Invalid char literal

``` java
char c = 'AB'; // Error
```

------------------------------------------------------------------------

### Invalid octal literal

``` java
int x = 089; // Error
```

------------------------------------------------------------------------

## Advanced Notes

### Literal Range Rules

Without suffix → must fit in int range.

------------------------------------------------------------------------

### Floating Precision

Floating-point values may have rounding issues.

------------------------------------------------------------------------

### Compile-Time Constants

``` java
byte b = 10;  // Valid
byte b = 128; // Error (out of range)
```

------------------------------------------------------------------------

## Interview Definition

A literal in Java is a constant value directly written in source code
representing fixed data.

------------------------------------------------------------------------

## Memory Summary

  Literal Type   Memory Handling
  -------------- -----------------
  Primitives     Stored directly
  Strings        String Pool
  null           No object
