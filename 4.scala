def sumOfEvens(numbers:List[Int]):Int={
    numbers.filter(_%2==0).sum
}

def main(args:Array[String]):Unit={
    val numbers=List(1,2,3,4,5)
    val result=sumOfEvens(numbers)
    println("The sum of even numbers is : "+result)
}