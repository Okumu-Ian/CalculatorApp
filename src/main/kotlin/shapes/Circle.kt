package shapes

class Circle() {
    //circle properties
    val pi:Double = (22.0 / 7)
    var radius:Double = 0.0

    //secondary constructor that has radius input
    constructor(radius:Double) : this(){
        //replace value of radius
        this.radius = radius
    }

    //function to calculate area
    fun area() : Double{
        return pi * radius * radius
    }

    //function to calculate perimeter
    fun perimeter() : Double{
        return 2 * pi * radius
    }

}