#### tree 树 ;


##### 一、二叉树 ;
 
   - 二叉树的优势 : 
   
         在实际使用时会根据链表和有序数组等数据结构的不同优势进行选择。有序数组的优势在于二分查找，链表的优势在于数据项的插入和数据项的删除。但是在有序数组中插入数据就会很慢，同样在链表中查找数据项效率就很低。综合以上情况，二叉树可以利用链表和有序数组的优势，同时可以合并有序数组和链表的优势，二叉树也是一种常用的数据结构
         
   - 二叉树 :
   
          二叉树由节点（node）和边组成。节点分为根节点、父节点、子节点 ;
          
          
   - 二叉树的搜索 : 
   
          二叉树一个节点左子节点的关键字小于这个节点，右子节点关键字大于或等于这个父节点 ;
          
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
          
   - 二叉树的创建插入 ;
   
         class Node( var leftNode:Node?,
                  var rightNode:Node?,
                  var  data :Int)
                  
         //创建 ;
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
             }         
   
   
   - 二叉树的最值 ;
   
      root开始查找，最小值只会出现所有父节点的左节点处，同样最大值只会出现在所有父节点的沿着右节点搜索的最底层右节点处。   
      
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
             
##### 二、完全二叉树 ;

   若设二叉树的深度为h，除第 h 层外，其它各层 (1～h-1) 的结点数都达到最大个数，第 h 层所有的结点都连续集中在最左边，这就是完全二叉树。
   
   完全二叉树从根结点到倒数第二层满足完美二叉树，最后一层可以不完全填充，其叶子结点都靠左对齐。
   
   
 - 完满二叉树 : 所有非叶子结点的度都是2。（只要你有孩子，你就必然是有两个孩子。）
 
 - 平衡二叉树 : 左右两个子树的高度差的绝对值不超过1，并且左右两个子树都是一棵平衡二叉树。
 
 - 二叉查找树 : TODO 
 
 - 红黑树 : TODO 
 
 - B-，B+，B*树 : TODO 
 
 