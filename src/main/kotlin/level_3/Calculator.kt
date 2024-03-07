package level_3

import level_3.OperationList.AddOperation
import level_3.OperationList.DivideOperation
import level_3.OperationList.MultiplyOperation
import level_3.OperationList.SubstractOperation

// todo 문제점 1
//  0.1 + 0.2 = 0.30000000000000004 ?! 이상하게 나온다.
//  시도1. toBigDecimal 사용
//  -> 나누어떨어지지 않는 수를 계산하면 반올림을 해버림
//  ex) 5 / 3 = 2.0 ?!

// todo 문제점 2
//  1 + 1 = 2.0 <- 맞게 떨어지면 소수점 뒤를 없애고 싶다.
//  시도1. 1로 나눠서 소수점이 없으면 toInt로 출력?,,
//  시도2. type별로 나눠서 결과 출력?,,

// todo
//  1. 처음 값을 받아올때 double인지 int인지 확인?
//  2. 출력되는 값을 가지고 확인?

class Calculator {
    init {
        println("첫번째 수 입력")
        var a = exception("num").toString().toDouble()
        while (true) { // while문을 주어 추가 연산이 가능하도록 함
            println("연산자 입력")
            val op = exception("op").toString()
            println("두번째 수 입력")
            val b = exception("num").toString().toDouble()
            val result = calculation(a,op,b)

            println("답은 $result")

            println("-1:종료 / 0:추가 연산 / 1:새로운 계산")
            val question = exception("question")// 계속할지 질문
            // -1:종료 / 0:추가 연산 / 1:새로운 계산
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

    private fun calculation(n1: Double, op: String, n2: Double): Double {
        val result = when (op) {
            "+" -> AddOperation().calculator(n1, n2)
            "-" -> SubstractOperation().calculator(n1, n2)
            "*" -> MultiplyOperation().calculator(n1, n2)
            else -> DivideOperation().calculator(n1, n2)
        }
        return result
    }
    private fun calculation(n1: Int, op: String, n2: Int): Int { //오버로딩
        val result = when (op) {
            "+" -> AddOperation().calculator(n1, n2)
            "-" -> SubstractOperation().calculator(n1, n2)
            "*" -> MultiplyOperation().calculator(n1, n2)
            else -> DivideOperation().calculator(n1, n2)
        }
        return result
    }
}
