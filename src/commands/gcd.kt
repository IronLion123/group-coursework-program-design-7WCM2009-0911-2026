package commands.gcd

/**
 * @param num1_str A string containing number 1 for computing the GCD
 * @param num2_str A string containing number 2 for computing the GCD
 * @return The GCD of the numbers num1 and num2
 * @throws IllegalArgumentException When input validation fails
 */
fun calculateGcd(num1_str: String, num2_str: String): String {
    // Convert to integer
    val num1: Int? = num1_str.toIntOrNull()
    val num2: Int? = num2_str.toIntOrNull()

    // Check if valid integer
    if (num1 === null) throw IllegalArgumentException("$num1_str is not a valid integer.")
    if (num2 === null) throw IllegalArgumentException("$num2_str is not a valid integer.")

    // Handle 0 and negative input edge cases
    if (num1 == 0 && num2 == 0) {
        throw IllegalArgumentException("Greatest Common Divisor for 0 and 0 is undefined.")
    }
    else if (num1 < 0 || num2 < 0) {
        throw IllegalArgumentException("Negative numbers are not valid inputs.")
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
        var a: Int = num1
        var b: Int = num2

        // Apply the Euclidean algorithm until the remainder is zero
        while (b != 0) {
            val remainder: Int = a % b
            a = b
            b = remainder
        }

        return a.toString()
    }
}
