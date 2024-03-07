package level_1

fun main() {
    val a = readln().toInt()
    val op = readln()
    val b = readln().toInt()

    val result = when (op) {
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> (a / b).toDouble()
        else -> "올바른 연산자가 아닙니다."
    }
    println(result)
}


class Calculator(){

}