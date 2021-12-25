
fun main(){
    fizzBuzzIfElse()
    fizzBuzzWhen()
}

fun fizzBuzzIfElse(){
    for(i in 1..30){
        if(i%15==0){
            println("FizzBuzz")
        }else if(i%5==0){
            println("Buzz")
        }else if (i%3==0){
            println("Fizz")
        }else{
            println(i)
        }
    }
}


fun fizzBuzzWhen(){
    for(i in 1..30){
        when{
            (i % 15 ==0) -> println("FizzBuzz")
            i % 5 == 0 -> println("Buzz")
            i % 3 == 0 -> println("Fizz")
            else -> println(i)
        }
    }
}

