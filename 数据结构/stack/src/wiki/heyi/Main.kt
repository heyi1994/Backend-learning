package wiki.heyi

import java.util.*

/**
 * @author 何怡
 * @since 1.0.0
 */

fun main(args: Array<String>) {

    val stack = Stack<String>()


    for ( i in 0..9){
        stack.push("item : $i ")
    }


    while (!stack.empty()){
        println("the item is ${stack.pop()}")
    }
}