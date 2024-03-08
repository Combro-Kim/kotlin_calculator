package level_2

import java.math.BigDecimal

class Calculator {
    init {
        println("첫번째 수 입력")
        var a = exception("num").toString().toDouble()
        while (true) { // while문을 주어 추가 연산이 가능하도록 함
            println("연산자 입력")
            val op = exception("op").toString()
            println("두번째 수 입력")
            val b = exception("num").toString().toDouble()
            val result = when (op) {
                "+" -> a + b
                "-" -> a - b
                "*" -> a * b
                "%" -> a % b
                else ->
                    if (b == 0.0) {
                        0
                    } else {
                        a / b
                    }
            }
            //todo result의 값이 정수로 떨어지면 .0 제거
            //나머지가 없으면 toInt 시도

            println("답은 $result")

            println("-1:종료 / 0:추가 연산 / 1:새로운 계산")
            val question = exception("question")// 계속할지 질문
            //todo -1:종료 / 0:추가 연산 / 1:새로운 계산
            if (question == -1) {
                println("계산기를 종료합니다.")
                break
            } else if (question == 0) {
                println("추가 연산을 진행합니다.")
                a = result as Double
                continue
            } else if (question == 1) {
                println("첫번째 수 입력")
                a = exception("num").toString().toDouble()
            }
        }
    }
}