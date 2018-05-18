package wiki.heyi

import java.util.concurrent.BlockingQueue

/**
 * #### 生产者 ;
 * @author 何怡
 * @since 1.0.0
 */
class Producer(private val queue:BlockingQueue<String>) :Runnable {
    override fun run() {

            try {
                while (true) {
                    val item = "${System.currentTimeMillis()}"
                    queue.put(item)
                    println("produce : $item ;")
                }
            }catch (e:Exception){
                e.printStackTrace()
            }

    }
}