//Inheritance

//This is a parent class
open class Toiletries(val brand: String){
    fun notification():String{
        return "$brand is a soap for ${purpose()}" //--->This is moved from child class to parent class
    }                                              //--->It is called generalization

    open fun purpose():String{
        return "Soap for body or face"   //--->This will be override by the child class
    }
}

//child classes inherit the parent class
class BodySoap(brand:String):Toiletries(brand){
    override fun purpose():String{
        return "body"
    }
}

class FaceSoap(brand:String):Toiletries(brand){
    override fun purpose():String{
        return "face"
    }
}

fun main() {

    print("Enter the brand of soap of your choice: ")
    val brandBody = readLine()!!

    val showBodySoap:Toiletries = BodySoap(brandBody)
    println(showBodySoap.notification())

    print("Enter the brand of soap of your choice: ")
    val brandFace = readLine()!!
    val showFaceSoap:Toiletries = FaceSoap(brandFace)
    println(showFaceSoap.notification())


}