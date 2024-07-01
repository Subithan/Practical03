def mean(num1:Int,num2:Int):Double={
    val average=(num1+num2)/2.0
    BigDecimal(average).setScale(2,BigDecimal.RoundingMode.HALF_UP).toDouble
}

def main(args:Array[String]):Unit={
    val num1=13
    val num2=16
    val result=mean(num1,num2)
    println("The mean of $num1 and $num2 is : "+result)
}