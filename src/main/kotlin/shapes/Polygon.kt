package shapes

class Polygon() {
    //polygon properties
    var side:Double = 0.0
    var length:Double = 0.0
    var width:Double = 0.0
    var height:Double = 0.0
    var b:Double = 0.0
    var a:Double = 0.0
    var c:Double = 0.0
    var d:Double = 0.0

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
    constructor(height:Double,b:Double,c:Double): this(){
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


}