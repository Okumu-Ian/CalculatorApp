package shapes

open class Polygon() {
    //polygon properties
    open var side:Double = 0.0
    open var length:Double = 0.0
    open var width:Double = 0.0
    open var height:Double = 0.0
    open var b:Double = 0.0
    open var a:Double = 0.0
    open var c:Double = 0.0
    open var d:Double = 0.0

    //constructor for square
    constructor(side:Double) : this(){
        this.side = side
    }
    //rectangle
    constructor(length:Double,width:Double): this(){
        this.length = length
        this.width = width
    }
    //triangle
    constructor(height:Double,b:Double,c:Double,a:Double = 0.0): this(){
        this.height = height
        this.b = b
        this.c = c

    }
    //trapezium
    constructor(a:Double,b:Double,
                c:Double,d:Double,height: Double): this(){
        this.a =a
        this.b = b
        this.c = c
        this.d = d
        this.height = height
    }

    //CREATE A FUNCTION TO CALCULATE AREA
    open fun area():Double{
        return 0.0
    }

    //function to calculate perimeter
    open fun perimeter():Double{
        return 0.0
    }


}