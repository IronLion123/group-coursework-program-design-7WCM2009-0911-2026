package commands.fibonacci

import java.math.BigInteger

// The maximum value allowed for the input n
val MAX_N: Int = 100

/**
 * @param userInput The input string from the user containing the number n
 * @return The Fibonacci sum until the number n
 * @throws IllegalArgumentException When input validation fails
 */
fun calculateFibonacciSum(userInput: String) : String {
    // Convert to integer
    val n: Int? = userInput.toIntOrNull()

    // Validate inputs
    when {
        n === null -> throw IllegalArgumentException("The input $userInput is not a valid integer.")
        n < 1 -> throw IllegalArgumentException("The input $userInput is less than 1.")
        n > MAX_N -> throw IllegalArgumentException("The input $userInput is greater than $MAX_N.")
    }

    // We compute up to index n + 2
    val targetIndex = n + 2

    // Use previous and current number to track the series
    var previous = 0.toBigInteger()
    var current = 1.toBigInteger()

    // Compute the (n+2)th Fibonacci number iteratively
    for (i in 2..targetIndex) {
        val next = previous + current
        previous = current
        current = next
    }

    // Return F(n+2) - 1
    return (current - 1.toBigInteger()).toString()
}
