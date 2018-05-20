package wiki.heyi

/**
 * @author 何怡
 * @since 1.0.0
 */
fun main(args: Array<String>) {

    val person1 = Person("heyi",22)
    val person2 = Person("heyi",22)

    println(person1 == person2) // print true


    val set  = HashSet<Person>()
    for ( i in 0..4){
        set.add(person1)
    }

    for ( i in 0..4){
        set.add(person2)
    }


    println("the set size is ${set.size}")  // the set size is 1

}


class Person( val name:String, val age:Int){

    override fun hashCode()  =  1

    override fun equals(other: Any?) = true
}