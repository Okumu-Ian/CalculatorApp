package shapes.polygons

import shapes.Polygon

class Square(var squareSide:Double) : Polygon(squareSide) {

    override fun area(): Double {
        return squareSide * squareSide
    }

    override fun perimeter(): Double {
        return 4 * squareSide
    }

    //function to calculate diagonal
    fun getDiag():Double{
        //variable to hold value of square of diagonal
        val diagSquare = 2 * squareSide * squareSide
        //find square root
        return Math.sqrt(diagSquare)
    }

}