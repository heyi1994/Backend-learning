package wiki.heyi

import java.util.concurrent.BlockingQueue

/**
 * #### 消费者 ;
 * @author 何怡
 * @since 1.0.0
 */
class Consumer (private val queue:BlockingQueue<String>):Runnable{

    override fun run() {
        try {
           while (true){
              val item = queue.take()
              println("consume : $item ;")
           }
        }catch (e:Exception){
            e.printStackTrace()
        }
    }
}