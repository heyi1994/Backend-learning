package wiki.heyi

/**
 * @author 何怡
 * @since 1.0.0
 */

fun main(args: Array<String>) {
    val arr = intArrayOf(77,2,42,2532,52362,44,3,55,2153,-99)

    arr.forEach { print(" "+ it) }
    selectSort(arr)
    println()
    arr.forEach { print(" "+ it)}
}


fun selectSort(arr:IntArray){
    for (i in 0..arr.size-1){
        for (j in i+1..arr.size-1){
            if (arr[i]>arr[j]){
                val temp = arr[i]
                arr[i] = arr[j]
                arr[j]=temp
            }
        }
    }
}