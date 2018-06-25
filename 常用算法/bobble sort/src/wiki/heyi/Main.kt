package wiki.heyi

/**
 * @author 何怡
 * @since 1.0.0
 */
fun main(args: Array<String>) {
    val arr = intArrayOf(77,2,42,2532,52362,44,3,55,2153,-99)

    arr.forEach { print(" "+ it) }
    bobbleSort(arr)
    println()
    arr.forEach { print(" "+ it)}
}


fun bobbleSort(arr:IntArray){
    for ( i in 0..arr.size-2){
        //外层控制排序趟数
       for (j in 0..arr.size-2-i){
           //内层控制每趟的次数
           if (arr[j]>arr[j+1]){
               val temp = arr[j]
               arr[j]=arr[j+1]
               arr[j+1]= temp
           }

       }
    }
}