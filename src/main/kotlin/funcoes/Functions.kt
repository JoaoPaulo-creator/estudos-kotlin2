package funcoes

fun main(){
    println(sum(2,15))
    println(sum2(10,5))
    //or
    printSoma(2,2)
    printSomaComUnitEscondido(2,2)
}

fun sum(a: Int, b: Int): Int{
    return a + b
}

fun sum2(a:Int, b:Int) = a+b

fun printSoma(a:Int, b:Int): Unit{
    println("A soma entre $a e $b é igual a ${a + b}")

}


fun printSomaComUnitEscondido(a:Int, b:Int){
    println("A soma entre $a e $b é igual a ${a + b}")

}

