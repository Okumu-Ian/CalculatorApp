package shapes.polygons

import shapes.Polygon

class Rectangle(var rectLength:Double,var rectWidth:Double)
    : Polygon(rectLength,rectWidth) {

    override fun perimeter(): Double {
        return 2 * (rectLength + rectWidth)
    }

    override fun area(): Double {
        return rectLength * rectWidth
    }

    //function to calculate diagonal
    fun getDiag() : Double{
        //get c-square
        val diagSquare = (rectLength * rectLength) +
                (rectWidth * rectWidth)
        //return value of diagonal
        return Math.sqrt(diagSquare)
    }

}