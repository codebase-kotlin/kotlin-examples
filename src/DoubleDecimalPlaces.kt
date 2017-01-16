/**
 * Created by aromal on 1/5/17.
 */



fun Double.toDecimalPlaces(decimalPlaces:Int=2):Double{


    var priceVal:Double =  try { this?:0.0 }catch (e:Exception){0.0}


    val decimalPlaces = Math.pow(10.0,decimalPlaces.toDouble())
    priceVal = Math.round(priceVal*decimalPlaces)/decimalPlaces


    return priceVal

}
fun Double.formatToStringWith(decimalPlaces: Int):String{

    return String.format("%.${decimalPlaces}f", toDecimalPlaces(decimalPlaces))

}



fun main(args : Array<String>) {


    println("${2.8567.formatToStringWith(3)}")
    println("${2.806.formatToStringWith(3)}")
    println("${2.8000.formatToStringWith(3)}")
    println("${2.8.formatToStringWith(3)}")

}