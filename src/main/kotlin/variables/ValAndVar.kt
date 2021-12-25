fun main(){

    //Criando variáveis utilizando o val
    val a: Int = 1
    val b = 2
    //val c:Int = a+b
    var c = 3
    /*val é um tipo de variável local onde
    é possível atribuir um valor a ela somente uma vez
    */


    if(c == 3){
        /*Nesse exemplo, c deve ficar sublinhado com uma linha vermelha
        pois seu valor deve ser constante, ou seja, não deve mudar.
        Nada de impede de atribuir c a uma outra variável, mas c
        deve sempre ser igual a a+b
        */

        //Para pode incrementar, será mudar c para var
        c++
        print(c)
    }

    /*Para uma variável poder mudar de valor, ou ser incrementada no futuro
    ela precisa ser uma variável var
    */

    var d = 5
    while(d<10){
        /*Pelo fato de d ser uma variável com a keyword "var"
        ela vai permitir ter seu valor alterado
        No caso desse loop, enquanto for verdade que d, que vale 5,
        for menor que 10, será incremetando mais 1, até d ser igual a 10
         */
        d++
    }


}

