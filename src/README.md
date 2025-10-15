** Challenge 1.2: The Lottery Number Analyzer
 Description

This program analyzes a list of weekly lottery numbers stored as strings in the format "XX-XX-XX-XX-XX".
For each ticket:

It removes the dashes (-) to form a continuous number string.

Converts the digits into an integer array.

Calculates the sum and average of all digits.
Finally, the program determines which lottery number has the highest average digit value and announces it as the winning number.

This project helps practice arrays, string manipulation, loops, and type conversion in Java.

** Example Input / Output
** Example Input (in the code):
String[] winningNumbers = {
    "12-34-56-78-90",
    "33-44-11-66-22",
    "01-02-03-04-05"
};
** Example Output:
Analyzing: 12-34-56-78-90
Digit Sum: 45, Digit Average: 4.5

Analyzing: 33-44-11-66-22
Digit Sum: 30, Digit Average: 3.0

Analyzing: 01-02-03-04-05
Digit Sum: 15, Digit Average: 1.5

The winning number with the highest average is: 12-34-56-78-90 with an average of 4.5

** What I Learned:

How to store and process multiple strings using arrays.

How to remove characters in strings using replace().

How to convert characters into integers using Character.getNumericValue().

The difference between for and for-each loops in Java.

How to calculate and compare averages using variables.

**  What Was Difficult:

Handling string-to-integer conversion correctly for each character.

Remembering when to use integer division vs. floating-point division to get the correct average.

Keeping the code clean and readable while performing multiple operations in loops.