package wiki.heyi

/**
 * @author 何怡
 * @since 1.0.0
 */
fun main(args: Array<String>) {


    val array  =  arrayListOf<String?>()

    array.add(null)

    for (i in 0..9){
        array.add("$i")
    }

    array.forEach { println("the string is $it ;") }
}