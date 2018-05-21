package wiki.heyi

/**
 * @property leftNode 左节点 ;
 * @property rightNode 右节点 ;
 * @author 何怡
 * @since 1.0.0
 */
class Node( var leftNode:Node?,
            var rightNode:Node?,
            var  data :Int){
    fun showData() {
        println("the data is $data ; left node's data is ${leftNode?.data} ; right node's data is ${rightNode?.data}")
        leftNode?.showData()
        rightNode?.showData()
    }
}

