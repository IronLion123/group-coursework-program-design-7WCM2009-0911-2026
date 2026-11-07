package commands.sum

// The maximum value allowed for the input n
val MAX_N: Int = 1_000_000

/**
 * @param n The input string from the user containing the number n
 * @return The Harmonic until the number n
 * @throws IllegalArgumentException When input validation fails
 */
fun calculateHarmonic(n: String): String {
   // convert to Integer
   val n_converted: Int? = n.toIntOrNull()

   //input validation
   when {
       n_converted === null -> throw IllegalArgumentException("Input $n is not a valid Integer.")
       n_converted <= 0 -> throw IllegalArgumentException("$n is not between 1 and $MAX_N.")
       n_converted > MAX_N -> throw IllegalArgumentException("$n cannot be larger than $MAX_N.")
   }

   //  container for the total
   var sum: Double = 0.0

   // loop to calculate fractions and add them all together
   for (i: Int in 1..n_converted) {
       sum = sum + (1.0 / i)
   }

   // Return the result, limited to 3 decimal places
   val formattedResult: String = String.format(java.util.Locale.US, "%.6f", sum)
   return formattedResult
}
