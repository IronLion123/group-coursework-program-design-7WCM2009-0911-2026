package commands.help

fun help(): String {
return """
The ppd_cli_tool is built to implement 3 distinct functions, covering the coursework for the module Programming and Program Design (7WCM2009-0911-2026).

Main menu:
1. Series Sum
2. Greatest Common Divisor
3. Fibonacci Series Sum
!help - Display help
!exit - Exit program

1. Series Sum

The Sum equation is mathematically called the harmonic series (H_n). It takes a number n and adds fractions, starting from 1/1 and increasing the denominator by one each time, until it reaches n, then adds them all together.

Sum(n) = 1 + 1/2 + 1/3 + ... + 1/n

For example:
Sum(1) = 1
Sum(2) = 1 + 1/2 = 1.5
Sum(3) = 1 + 1/2 + 1/3 = 1.8333...
Sum(4) = 1 + 1/2 + 1/3 + 1/4 = 2.0833...

2. Greatest Common Divisor

The Greatest Common Divisor (GCD) is the largest positive integer that divides two numbers without a remainder.

The function expects two integers and returns their GCD as a string. Zero is accepted as a special case: if both numbers are zero, the result is "Undefined"; if one number is zero, the GCD is the other number. Negative numbers are not valid inputs.

3. Fibonacci Series Sum

The Fibonacci sequence is a series of numbers that begins with 0 and 1, where each subsequent number is the sum of the two numbers before it. It is defined as:

F(n) = F(n-1) + F(n-2)

given F(0) = 0 and F(1) = 1

The function computes the sum of Fibonacci numbers until the index n.

!help - Display this help text.
!exit - Exit the program.
"""
}
