package heranca.tigre

/*
Aqui é passado o parâmetro ao qual será "referenciado" na subclasse CountryTiger
*/

open class Tiger(val origin: String) {
    fun sayHello(){
        println("A tiger from $origin says: grhh")
    }
}

/*
If you want to use a parameterized constructor of the superclass when creating a subclass,
provide the constructor arguments in the subclass declaration.

*/
