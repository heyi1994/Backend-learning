package wiki.heyi

import java.util.*
import java.util.concurrent.BlockingQueue
import java.util.concurrent.ConcurrentLinkedQueue
import java.util.concurrent.LinkedBlockingQueue

/**
 * @author 何怡
 * @since 1.0.0
 */

fun main(args: Array<String>) {

    //未实现阻塞的实现类 ;
    val queue:Queue<String> = LinkedList()
    val queue1 : Queue<String> = PriorityQueue()
    val queue2 : Queue<String> = ConcurrentLinkedQueue()


    //实现阻塞的实现类 ;
    val queue3 :BlockingQueue<String> = LinkedBlockingQueue()
   // queue3.offer(null) // throw NPE ;

    //生产消费者例子 ;
    val producer = Producer(queue3)
    val consumer = Consumer(queue3)

    Thread(producer).start()
    Thread(consumer).start()

}