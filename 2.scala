def filterLongString(strings:List[String]):List[String]={
    strings.filter(_.length>5)
}

def main(args:Array[String]):Unit={
    val strings=List("Scala","Programming","Language")
    val filtered=filterLongString(strings)
    println("Original list : "+strings)
    println("Filtered list : "+filtered)
}