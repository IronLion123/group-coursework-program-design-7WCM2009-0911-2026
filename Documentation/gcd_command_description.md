# Greatest Common Divisor (GCD)

## Description

The Greatest Common Divisor (GCD) is the largest positive integer that divides two numbers without a remainder.

The function expects two positive integers, as specified in the coursework requirements, and returns their GCD as a string. It additionally supports zero as a special case. If both numbers are zero, the result is returned as `"Undefined"`. If one number is zero, the GCD is the other number. Negative numbers are not valid inputs.

## Function Logic

The function starts by checking for zero and negative inputs, exiting early if either validation condition is met.

If both inputs are zero, the function returns `"Undefined"`. If either input is negative, an error message is returned. If only one input is zero, the function returns the other number.

If neither input is zero, a remainder variable is used to store the result of number one modulus number two.

Number one is then replaced by number two, and number two is replaced by the remainder. This process repeats until number two becomes zero, at which point the function returns the current value of number one.

## Inputs and Outputs

**Inputs:**

- `num1`: `Int` — First integer (expected to be positive).
- `num2`: `Int` — Second integer (expected to be positive).

**Output:**

- `String` — The calculated GCD, `"Undefined"` if both numbers are zero, or an error message if either input is negative.

## Input Validation

The function handles the following cases:

- Both inputs are zero: Returns `"Undefined"`.
- One input is zero: Returns the other input.
- Either input is negative: Returns `"Negative numbers are not valid inputs."`.
- Both inputs are positive: Calculates the GCD using the Euclidean algorithm.

## Function

```kotlin
fun gcd(num1: Int, num2: Int): String {
    // Handle 0 and negative input edge cases
    if (num1 == 0 && num2 == 0) {
        println("Greatest Common Divisor for 0 is undefined.")
        return "Undefined"
    }
    else if (num1 < 0 || num2 < 0) {
        return "Negative numbers are not valid inputs."
    }
    else if (num1 == 0 || num2 == 0) {
        if (num1 == 0) {
            return num2.toString()
        }
        else {
            return num1.toString()
        }
    }
    else {
        var a = num1
        var b = num2

        // Apply the Euclidean algorithm until the remainder is zero
        while (b != 0) {
            val remainder = a % b
            a = b
            b = remainder
        }

        return a.toString()
    }
}
```
