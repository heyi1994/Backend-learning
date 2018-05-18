#### Queue 

##### Queue : 一个队列就是先入先出(FIFO)的数据结构 ;
##### Queue接口与List、Set同一级别，都是继承了Collection接口。LinkedList实现了Deque接口。

      e.g : val queue:Queue<String> = LinkedList()

##### Queue的实现 ;

1. 没有实现的阻塞接口(BlockingQueue)的LinkedList: 实现了Queue接口和AbstractQueue接口 ;其他两个内置的不阻塞队列： PriorityQueue 和 ConcurrentLinkedQueue ;
  
   - PriorityQueue :维护了一个有序列表。加入到 Queue 中的元素根据它们的天然排序（通过其 java.util.Comparable 实现）或者根据传递给构造函数的 java.util.Comparator 实现来定位。
   
   - ConcurrentLinkedQueue : 基于链接节点的、线程安全的队列。并发访问不需要同步。因为它在队列的尾部添加元素并从头部删除它们，所以只要不需要知道队列的大小，ConcurrentLinkedQueue 对公共集合的共享访问就可以工作得很好。收集关于队列大小的信息会很慢，需要遍历队列。
   
2. 实现阻塞接口队列(BlockingQueue) , BlockingQueue不接受null元素(put/add/offer会抛出NPE),BlockingQueue可安全地用于多个生产者和多个消费者:
   
   -   ArrayBlockingQueue :一个由数组支持的有界队列 ;在构造时需要指定容量， 并可以选择是否需要公平性，如果公平参数被设置true，等待时间最长的线程会优先得到处理（其实就是通过将ReentrantLock设置为true来 达到这种公平性的：即等待时间最长的线程会先操作）。通常，公平性会使你在性能上付出代价，只有在的确非常需要的时候再使用它。它是基于数组的阻塞循环队 列，此队列按 FIFO（先进先出）原则对元素进行排序 ;
   
   -   LinkedBlockingQueue :一个由链接节点支持的可选有界队列 ;容量是没有上限的（说的不准确，在不指定时容量为Integer.MAX_VALUE，不要然的话在put时怎么会受阻呢），但是也可以选择指定其最大容量，它是基于链表的队列，此队列按 FIFO（先进先出）排序元素 ;
   
   -   PriorityBlockingQueue : 一个由优先级堆支持的无界优先级队列 ;
   
   -   DelayQueue : 一个由优先级堆支持的、基于时间的调度队列 ;
   
   -   SynchronousQueue  : 一个利用 BlockingQueue 接口的简单聚集（rendezvous）机制 ;
   
   -  阻塞队列操作:
   
      1. add        增加一个元索:如果队列已满，则抛出一个IIIegaISlabEepeplian异常
      2. remove     移除并返回队列头部的元素,如果队列为空，则抛出一个NoSuchElementException异常
      3. element    返回队列头部的元素,如果队列为空，则抛出一个NoSuchElementException异常       
      4. offer      添加一个元素并返回true,如果队列已满，则返回false
      5. poll       移除并返问队列头部的元素,如果队列为空，则返回null
      6. peek       返回队列头部的元素,如果队列为空，则返回null
      7. put        添加一个元素,如果队列满，则阻塞
      8. take        移除并返回队列头部的元素,如果队列为空，则阻塞
       
   
   　　
   
   　　
   　　
   　　
   　　
   　　