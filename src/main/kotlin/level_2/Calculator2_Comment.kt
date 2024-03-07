package level_2

import java.lang.NumberFormatException

/*
- Lv1에서 만든 Calculator 클래스에 출력 이후 추가 연산을 가능하도록 코드를 추가하고,
연산 진행 후 출력하기
- 반복문으로 무한 계산되도록 하고 나머지 연산자(%) 추가
*/
//lv.1과 다른 내용만 주석
fun main() {
    var a = ex("num").toString().toInt()

    while (true) { // while문을 주어 추가 연산이 가능하도록 함
        val op = ex("op").toString()
        if (op == "-1") break //'-1'일 경우 종료
        val b = ex("num").toString().toInt()

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
        a = result as Int
    }
}

private fun ex(type: String): Any {
    val opList = listOf("*", "+", "-", "/", "%")
    return when (type) {
        "op" -> {
            while (true) {
                try {
                    val operator = readln()
                    if (operator == "-1") {
                        return operator //-1일때 올려보냄
                    }
                    if (operator in opList) {
                        return operator
                    } else {
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
                    val number = readln()
                    return number.toInt()

                } catch (e: NumberFormatException) {
                    println("숫자를 입력해주세요.")
                }
            }
        }
    }
}
