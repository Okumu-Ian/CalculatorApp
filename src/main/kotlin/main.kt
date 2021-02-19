import shapes.Circle
import shapes.polygons.Square
import java.util.*
import kotlin.collections.ArrayList

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
            displayOthersMenu(userInput)
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

//function to display other menu
fun displayOthersMenu(numInput: Scanner){
    //others list
    val others = listOf("1. PERIMETER","2. AREA","3. DIAGONAL CALCULATION")
    //using for-loop to display menu
    for( option in others ){
        println(option)
    }
    //display message to ask for value
    print("PICK A NUMBER FROM THE OPTIONS ABOVE: ")
    //variable to hold input
    val mySelectedMenu = numInput.nextInt()
    //check value provided
    when (mySelectedMenu){
        1 -> {menuAreaPerimeter(false,numInput)}
        2 -> {menuAreaPerimeter(true,numInput)}
        3 -> {}
        else -> { println("Wrong Option! GoodBye")}
    }
}

//display menu for perimeter and area
fun menuAreaPerimeter(isArea:Boolean, numInput: Scanner){
    //creating list using array list methodology
    val shapes:ArrayList<String> = ArrayList()
    shapes.add("1.Circle")
    shapes.add("2.Square")
    shapes.add("3.Rectangle")
    shapes.add("4.Trapezium")
    shapes.add("5.Triangle")
    //display options using forEach method
    shapes.forEach {
        println(it)
    }
    //check option selected
    when(numInput.nextInt()){
        1 -> {
            //retrieve radius
            print("ENTER CIRCLE RADIUS:")
            val radius = numInput.nextDouble()
            //create circle object
            val myCircle = Circle(radius)
            //check if area or perimeter
            if(isArea){
                println("Area of the circle is ${myCircle.area()}")
            }else{
                println("Perimeter of the circle is ${myCircle.perimeter()}")
            }
        }
        2 -> {
            //retrieve side
            print("ENTER SQUARE SIDE:")
            val side = numInput.nextDouble()
            //create Square object
            val mySquare = Square(side)
            //check if area or perimeter
            if(isArea){
                println("Area of the square is ${mySquare.area()}")
            }else{
                println("Perimeter of the square is ${mySquare.perimeter()}")
            }
        }
        3 -> {}
        4 -> {}
        5 -> {}
        else -> {
            println("Wrong Option! Goodbye ...")
        }
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








