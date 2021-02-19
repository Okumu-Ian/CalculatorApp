package shapes.polygons

import shapes.Polygon

class Trapezium(var trapA:Double, var trapB:Double,
        var trapC:Double, var trapD:Double, var trapH:Double) :
        Polygon(a=trapA,b=trapB,c = trapC,
        d = trapD,height = trapH) {

    override fun perimeter(): Double {
        return trapA + trapB + trapC + trapD
    }

    override fun area(): Double {
        return (trapH * (trapA + trapB)) / 2
    }

}