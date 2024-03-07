package level_1

fun main() {
    Calculator()
}


class Calculator {
    init {
        println("첫번째 숫자 입력")
        val a = readln().toInt()
        println("연산자 입력")
        val op = readln()
        println("두번째 숫자 입력")
        val b = readln().toInt()

        val result = when (op) {
            "+" -> a + b
            "-" -> a - b
            "*" -> a * b
            "/" -> (a / b).toDouble()
            else -> "올바른 연산자가 아닙니다."
        }
        println("답은 $result")
    }
}