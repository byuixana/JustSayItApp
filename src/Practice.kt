
//Below is an interface. Its how you can group functions in a class.
interface Discounted {
    fun discountPercent(): Double;
}

//When statement, Kotlin's version of a switch statement.
fun whenPractice() {

    val a = 12
    val b = 5

    println("Enter operator either +, -, * or /")
    val operator = readLine()

    val result = when (operator) {
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> a / b
        else -> "$operator operator is invalid operator."
    }

    println("result = $result")
}

//Always create a variable as immutable, then change it if it needs to be mutable.
fun getWaterState(temp : Float) : String{
    val state = when {
        temp >= 100.0f -> "Gas"
        temp <= 0.0f   -> "Liquid"
        else           -> "Solid"
    }

        return state
}

fun printUserInput() {
    print("Enter your name: ")

    val name = "Alex"
}


fun main(){

    val states = listOf(
        "Alabama", "Alaska", "Arizona", "Arkansas",
        // Add more states as needed
    )

    val stateCapitols = listOf(
        "Birmingham", "Junea", "Phoenix", "Little Rock",
        // Add more states as needed
    )

    for (i in 0 until states.size){
        println("${states[i]} - ${stateCapitols[i]}")

    }
}



