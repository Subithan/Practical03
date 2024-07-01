def reverseString(s:String):String={
    if(s.isEmpty) ""
    else reverseString(s.tail)+s.head
}
def main(args:Array[String]):Unit={
    val string="scala"
    println("The original string is "+string)
    println("The reversed string is "+reverseString(string))
}