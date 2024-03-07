package level_1

import java.lang.NumberFormatException

/*
필수 구현 기능:
더하기, 빼기, 나누기, 곱하기 연산을 수행할 수 있는 Calculator 클래스를 만들고,
클래스를 이용하여 연산을 진행하고 출력하기
*/

fun main() {
    val a = ex("num").toString().toInt() //Ex라는 에러처리 메서드를 만들었다.
    val op = ex("op").toString()
    val b = ex("num").toString().toInt()

    val result = when (op) {
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        else -> //값을 0으로 나누면 컴파일 에러 발생 -> if문 추가
            if (b == 0) {
                0
            } else {
                a / b
            }
    }
    println(result)
}

fun ex(type: String): Any { //강의를 보고 예외처리 과정을 만들었다.
    val opList = listOf("*", "+", "-", "/", "%")
    return when (type) {
        //연산자를 받을때
        "op" -> {
            while (true) {
                try {
                    val operator = readln() //연산자 받기
                    if (operator in opList) {
                        return operator
                    } else {
                        println("연산자를 다시 입력해주세요.")
                    }
                } catch (e: NumberFormatException) {
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
