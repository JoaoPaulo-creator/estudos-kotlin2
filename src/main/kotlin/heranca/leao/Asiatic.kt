package heranca.leao

class Asiatic(name: String) : Lion(name = name, origin = "India"){

    fun main(){
        val lion: Lion = Asiatic("Ruffo")
        lion.sayHello()
    }
}






/*


"name" in the "Asiatic" declaration is neither a "var" nor "val": it's a constructor argument, whose value is passed to the "name"
 property of the superclass Lion.
Creates an "Asiatic" instance with the name "Rufo". The call invokes the "Lion" constructor with arguments "Rufo" and "India".

*/
