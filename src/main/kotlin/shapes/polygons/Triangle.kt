package shapes.polygons

import shapes.Polygon

class Triangle(var triA:Double  = 0.0, var triB:Double,
               var triC:Double, var triH:Double) :
    Polygon(a=triA,b = triB,c = triC,height = triH) {

    override fun area(): Double {
        return (triB * triH) / 2
    }

    override fun perimeter(): Double {
        //use if statement
        return if(isRightAngled()){
             triC + triB +triH
        }else{
             triA + triB +triC
        }
    }

    //function to check if it is a right-angle triangle
    fun isRightAngled():Boolean = triA == 0.0

}