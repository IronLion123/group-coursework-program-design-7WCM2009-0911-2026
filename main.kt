fun main()
{
    // entry point
    println("Welcome to the assessment application.")

    while (true) {
        // main menu
        println()
        print("Menu\n-------\n")
        print("1. Series Sum\n2. Greatest Common Divisor\n3. Fibonacci Series Sum\n")
        print("!help - Display help\n")
        print("!exit - Exit program\n")

        // function selection and parameter input
        when (getInput("Select an option: ", false) ?: return) {
            1 -> {
                // series sum
                val num1 = getInput("Enter an integer: ") ?: return
                println("num1")
            }

            2 -> {
                // greatest common divisor
                val num1 = getInput("Enter an integer: ") ?: return
                val num2 = getInput("Enter an integer: ") ?: return
                println("num1, num2")
            }

            3 -> {
                // fibonacci sum
                val num1 = getInput("Enter an integer: ") ?: return
                println("num1")
            }

            // invalid menu input reject
            else -> println("Invalid option. Enter 1-3.")
        }
    }
}

// input retrieval and validation
fun getInput(input: String, validatePositive: Boolean = true): Int? {
    while (true) {
        print(input)

        val input = readlnOrNull()?.trim()

        when (input?.lowercase()) {
            // call help function
            "!help" -> {
                printHelp()
                continue
            }

            // exit the application
            "!exit" -> {
                println("Thank you for using the application.")
                return null
            }
        }

        val number = input?.toIntOrNull()
        // number validation null and less than 1 rejected
        if (number == null) {
            println("Invalid input. Enter a positive integer.")
            continue
        }

        if (validatePositive && number < 1) {
            println("Invalid input. Enter a positive integer.")
            continue
        }

        return number
    }
}

// update the help function here
fun printHelp() {
    println("temp Help")
}
