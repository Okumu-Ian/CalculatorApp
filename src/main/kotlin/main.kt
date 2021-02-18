import java.util.*

fun main(args: Array<String>) {
    //Welcome Message
    println("Hello! Welcome to CalculatorApp.\nPlease pick an option below")
    //show main menu
    displayMainMenu()
    //Create Scanner Object to take user input
    val userInput:Scanner = Scanner(System.`in`)
    //variable to store menu options
    var selectedMenuOption = userInput.nextInt()
    //using when expression to check for option selected
    //variable to hold array of the two numbers
    var myNums:Array<Double>
    when(selectedMenuOption){
        1 -> {
            //assign values to array
            myNums = getOperationNumbers("ADDITION", userInput)
            //add the two numbers
            val addedNumbers = add(myNums[0],myNums[1])
            //display output
            println()
            print("The addition of " +
                    "{${myNums[0]} , ${myNums[1]}}" +
                    " is ${addedNumbers}")
        }
        2 -> {
            //assign values to array
            myNums = getOperationNumbers("SUBTRACTION", userInput)
            //subtract the two numbers
            val subNumbers = subtract(myNums[0],myNums[1])
            //display output
            println()
            print("The subtraction of " +
                    "{${myNums[0]} , ${myNums[1]}}" +
                    " is ${subNumbers}")
        }
        3 -> {
            //assign values to array
            myNums = getOperationNumbers("DIVISION", userInput)
            //divide the two numbers
            val divNumbers = divide(myNums[0],myNums[1])
            //display output
            println()
            print("The Division of " +
                    "{${myNums[0]} , ${myNums[1]}}" +
                    " is ${divNumbers}")
        }
        4 -> {
            //assign values to array
            myNums = getOperationNumbers("MULTIPLICATION", userInput)
            //multiply the two numbers
            val multiplyNumbers = multiply(myNums[0],myNums[1])
            //display output
            println()
            print("The multiplication of " +
                    "{${myNums[0]} , ${myNums[1]}}" +
                    " is ${multiplyNumbers}")
        }
        5 -> {
            //assign values to array
            myNums = getOperationNumbers("REMAINDER", userInput)
            //remainder of the two numbers division
            val remNumbers = remainder(myNums[0],myNums[1])
            //display output
            println()
            print("The remainder of " +
                    "{${myNums[0]} , ${myNums[1]}}" +
                    " is ${remNumbers}")
        }
        6 -> {
            println("Others")
        }
        else -> {
            println("Wrong Option. Try Again Next Time")
        }
    }
}

//function to display main menu
fun displayMainMenu(){
    //array that holds menu items
    val menuItems = arrayOf("Add","Subtract",
        "Divide","Multiply","Remainder","OTHERS")
    //using while loop to display menu options
    //Create iterator
    var i = 0
    while(i < menuItems.size){
        //show menu options with numbers
        println("${i+1}. ${menuItems[i]}")
        //we must alter iterator
        i++
    }
}

//function to add two numbers
fun add(num1:Double, num2:Double) : Double{
    return num1 + num2
}
//subtract two numbers
fun subtract(num1:Double, num2:Double) : Double{
    return num1 - num2
}
//divide two numbers
fun divide(num1:Double, num2:Double) : Double{
    return num1 / num2
}
//multiply two numbers
fun multiply(num1:Double, num2:Double) : Double{
    return num1 * num2
}
//remainder
fun remainder(num1:Double, num2:Double) : Double{
    return num1 % num2
}

//give message and retrieve values
fun getOperationNumbers(opName:String,
                        numInput:Scanner) : Array<Double>{
    //give message to request numbers
    println("Welcome to $opName \nKindly key in your two numbers")
    print("NUM 1:")
    //retrieve first value
    val num1 = numInput.nextDouble()
    println()
    print("NUM 2:")
    //retrieve second value
    val num2 = numInput.nextDouble()
    //return both values
    return arrayOf(num1,num2)
}








