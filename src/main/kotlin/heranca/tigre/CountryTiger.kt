package heranca.tigre;

/*
Nesse formato, o construtor possui atributos, conforme é possível visualizar
na classe Tiger()
*/

class CountryTiger() : Tiger("Origem do tigre"){

    fun main(){
        val tiger: Tiger = CountryTiger()
        tiger.sayHello()
    }

}
