package ppdCliTool

import commands.fibonacci.calculateFibonacciSum
import commands.gcd.calculateGcd
import commands.help.help
import commands.sum.calculateHarmonic
import kotlin.system.exitProcess

/**
 * Entry point of the ppd_cli_tool.
 *
 * Shows the welcome message, then loops over the main menu until the user
 * types `!exit` or input is closed with Ctrl + D.
 */
fun main(): Unit {
    println("Welcome to the group coursework application for the module Programming and Program Design.")
    println("Created by:\nAshutosh Dilip: 25010461\nGeoffrey Lee: 12345678\nRosa Erdogan: 13245678")

    while (true) {
        println("\nMenu\n-------")
        println("1. Series Sum\n2. Greatest Common Divisor\n3. Fibonacci Series Sum")
        println("!help - Display help\n!exit - Exit program")

        when (prompt("Select an option: ") ?: return) {
            "1" -> {
                val n = prompt("Enter an integer: ") ?: return
                try {
                    println("\nResult: ${calculateHarmonic(n)}")
                } catch (exc: Exception) {
                    println("\nError: ${exc.message}")
                }
            }
            "2" -> {
                val a = prompt("Enter the first integer: ") ?: return
                val b = prompt("Enter the second integer: ") ?: return
                try {
                    println("\nResult: ${calculateGcd(a, b)}")
                } catch (exc: Exception) {
                    println("\nError: ${exc.message}")
                }
            }
            "3" -> {
                val n = prompt("Enter an integer: ") ?: return
                try {
                    println("\nResult: ${calculateFibonacciSum(n)}")
                } catch (exc: Exception) {
                    println("\nError: ${exc.message}")
                }
            }
            "!help" -> println("\n${help()}")
            "!exit" -> {
                println("\nThank you for using the application.")
                exitProcess(0)
            }
            else -> println("\nInvalid option. Enter 1, 2, 3, !help or !exit.")
        }
    }
}

/**
 * Prints [message] and reads one line of input.
 *
 * Trims the line and re-prompts while it is empty.
 *
 * @param message The message to show before reading input.
 * @return The trimmed input, or `null` if input is closed (Ctrl + D).
 */
fun prompt(message: String): String? {
    while (true) {
        print("\n$message")
        val input = readlnOrNull()?.trim() ?: return null

        if (input.isNotEmpty()) return input
        println("\nYour input was empty, please try again...")
    }
}
