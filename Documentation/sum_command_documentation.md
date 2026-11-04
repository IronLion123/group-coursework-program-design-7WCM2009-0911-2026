[sum_command_documentation.docx](https://github.com/user-attachments/files/34326192/sum_command_documentation.docx)

# Description
The Sum equation given is mathematically called the Harmonic ($H_n$). It takes a number and adds smaller and smaller fractions to it, starting with $\frac{1}{1}$ until it reaches the stopping point ($n$) then adds them all together.

$Sum = (1 + \frac{1}{2} + \frac{1}{3} + ... + \frac{1}{n})$

For example:
- $Sum(1) = 1 = \frac{1}{1} = 1$
- $Sum(2) = 1 + \frac{1}{2} = 1.5$
- $Sum(3) = 1 + \frac{1}{2} + \frac{1}{3} = 1.833...$
- $Sum(4) = 1 + \frac{1}{2} + \frac{1}{3} + \frac{1}{4} = 2.083$

Other useful considerations:
- Sum grows slower and slower as $n$ increases: Notice how adding $\frac{1}{2}$ added $0.5$ but adding $\frac{1}{3}$ only added around $0.333$, and $\frac{1}{4}$ added $0.25$.
- Mathematically, it never stops growing: Even though it grows extremely slowly, if you made $n$ infinitely large, the sum would eventually exceed any target number (this is called a divergent series).
- Often used in computer science for analysing how long an algorithm takes to sort data.

# Function Logic
To compute the Sum equation up to the unit fraction $n$:
- Validate that $n$ is a valid input
- Compute all the fractions up to the $n$-th
- Add all the fractions together
- Return the result - output can be a whole number or decimal so return type should be Double to ensure higher accuracy.

# Input Validation/Command Handling
- Request an input from user with clear validation parameters
- Input: $n$ must be a natural number (whole and greater than 0).
- Considering Input: $n$ will be an Int, and Output: Sum will be Double.
- The Max of Int should be clarified in user instructions to avoid errors. Min is not necessary as the equation requires a number greater than 0. Max for Double is not necessary as the Max for Int will never lead to a result that exceeds Max Value for a Double.
- If invalid input is given, display an error message, requesting a correct input.

# Function
```kotlin
fun calculateHarmonic(n: Int): Double {
    // input validation
    if (n <= 0) {
        throw IllegalArgumentException("n must be a whole number (no decimals) between 1 and ${Int.MAX_VALUE}") // detailed error message to mitigate further errors
    }
    
    // container for the total
    var sum = 0.0
    
    // loop to calculate fractions and add them all together
    for (i in 1..n) {
        sum = sum + (1.0 / i)
    }
    return sum
}

fun main() {
    println("Please input a whole number between 1 and ${Int.MAX_VALUE}. n Must be a whole number") // clearly communicates valid inputs to the user
    
    // Example call to test the code
    val n = 5
    val result = calculateHarmonic(n)
    println("H$n =$result")
}
