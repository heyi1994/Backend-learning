package wiki.heyi

/**
 * #### 二叉树 ;
 * @author 何怡
 * @since 1.0.0
 */
class Tree {
    private var mRoot:Node?=null
    fun insertNode(data:Int){
         val newNode =  Node(null,null,data)
        if (mRoot== null){
            mRoot = newNode
        }else {
            var parent :Node?=null
            //当前的节点 ;
            var current:Node?= mRoot
            while (true){
             parent = current

                  //当前节点的数据大于要插入节点的值,尝试往左节点放置 ;
                if (current!!.data > data){
                    current = current.leftNode
                    if (current == null){
                        parent?.leftNode = newNode
                        return
                    }
                }else{
                    //要初入的节点的值大于或者等于当前的值 ;
                    current = current.rightNode
                    if (current == null){
                        parent?.rightNode = newNode
                        return
                    }
                }



            }

        }
    }


    fun showData() = mRoot?.showData()



    fun find(data:Int):Node?{
        var current = mRoot
        while (current!!.data!=data){
            if (current.data>data){
                //left node
                current = current.leftNode
            }else{
                current = current.rightNode
            }
            if (current==null){
                return null
            }
        }
        return current
    }


    /**
     * @return 返回最小值和最大值 ;
     */
    fun value():Pair<Int,Int>{
        var min :Node?=null
        var max :Node?=null
        var current = mRoot
        while (current!=null){
            min = current
            current = current.leftNode
        }

        current = mRoot
        while (current!=null){
            max = current
            current = current.rightNode
        }
        return Pair(min!!.data,max!!.data)
    }
}