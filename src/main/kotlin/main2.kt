
import java.lang.NumberFormatException

fun main() {
    var a = Ex("num").toString().toInt()

    while(true) {
        val op = Ex("op").toString()
        if(op == "-1"){
            break
        }
        val b = Ex("num").toString().toInt()

        val result = when (op) {
            "+" -> a + b
            "-" -> a - b
            "*" -> a * b
            "%" -> a % b
            else ->
                if (b == 0) {
                    0
                } else {
                    a / b
                }
        }
        println(result)
        a = result
    }
}

private fun Ex(type: String): Any? {
    val opList = listOf("*", "+", "-", "/", "%")
    return when (type) {
        "op" -> {
            while (true) {
                try {
                    var operator = readln()
                    if(operator == "-1"){
                        return operator
                    }
                    if (operator in opList) {
                        return operator
                    }
                    else {
                        println("연산자를 다시 입력해주세요.")
                    }
                } catch (e: NumberFormatException) {
                    println("알맞은 연산자를 입력해주세요.")
                }
            }
        }

        else -> {
            while (true) {
                try {
                    var number = readln()
                    return number?.toInt()

                } catch (e: NumberFormatException) {
                    println("숫자를 입력해주세요.")
                }
            }
        }
    }
}
