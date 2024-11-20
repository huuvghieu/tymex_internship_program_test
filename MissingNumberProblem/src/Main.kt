//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val arr = listOf<Int>(3, 7, 1, 2, 6, 4)

    println("Input: $arr (n = ${arr.size})")
    println(
        "Ouput: ${findMissingNumber(arr, arr.size)} (since ${
            findMissingNumber(
                arr,
                arr.size
            )
        } is the missing number)"
    )
}

fun findMissingNumber(arr: List<Int>, n: Int): Int {

    //Sum of numbers from 1 to n + 1 is
    //sum = (n + 1) * (n + 2) / 2
    val realSum = (n + 1) * (n + 2) / 2

    //Sum of elements in the arr
    val sum = arr.sum()

    //The missing number is the difference between realSum and sum
    return realSum - sum
}


