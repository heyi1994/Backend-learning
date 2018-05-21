package wiki.heyi

/**
 * @author 何怡
 * @since 1.0.0
 */
fun main(args: Array<String>) {

    val map = HashMap<String?,String>()


    map.put(null,"11")
    map.put(null,"22")// 覆盖

    println("the map size is ${map.size} ;")  //print 1

    for ( i in 0..9){
        map.put("key : $i","value :$i")
    }

    map.forEach { k, v ->
        println("$k  $v ")
    }


}