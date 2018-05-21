package wiki.heyi

/**
 * @author 何怡
 * @since 1.0.0
 */

fun main(args: Array<String>) {

    val tree  = Tree()
    tree.insertNode(22)
    tree.insertNode(11)
    tree.insertNode(33)
    tree.insertNode(44)
    tree.insertNode(55)
    tree.insertNode(5)
    tree.insertNode(77)
    tree.showData()

    val data = tree.find(44)
    data?.showData()


    val (min,max)=tree.value()

    println("the min value is :$min ; the max value is :$max ;")
}