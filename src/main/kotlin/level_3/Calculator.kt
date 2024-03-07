package level_3

import level_3.OperationList.AddOperation
import level_3.OperationList.DivideOperation
import level_3.OperationList.MultiplyOperation
import level_3.OperationList.SubstractOperation
import kotlin.math.floor

class Calculator {
    init {
        while (true) {
            println("[-1: 종료 / 1 : 정수 계산 / 2 : 실수 계산]")
            var intOrDouble = exception("intOrDouble").toString() //-1: 종료 / 1: 정수계산 / 2:실수 계산으로 나눠버림
            if (intOrDouble.toInt() == -1) {
                break
            } else if (intOrDouble.toInt() == 1) {
                intCalc()
            } else {
                doubleCalc()
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

    // int형과 double형을 구분
    private fun intCalc() {
        println("첫번째 수 입력")
        var a = exception("num").toString().toInt()
        while (true) { // while문을 주어 추가 연산이 가능하도록 함
            println("연산자 입력")
            val op = exception("op").toString()
            println("두번째 수 입력")
            val b = exception("num").toString().toInt()
            val result = calculation(a, op, b)

            println("답은 $result")

            println("-1:처음으로 돌아가기 / 0:추가 연산 / 1:새로운 계산")
            val question = exception("question")// 계속할지 질문
            // -1:종료 / 0:추가 연산 / 1:새로운 계산
            if (question == -1) {
                println("계산기를 종료합니다.")
                break
            } else if (question == 0) {
                println("추가 연산을 진행합니다.")
                a = result
                continue
            } else if (question == 1) {
                println("첫번째 수 입력")
                a = exception("num").toString().toInt()
            }
        }
    }

    private fun doubleCalc() {
        println("첫번째 수 입력")
        var a = exception("num").toString().toDouble()
        while (true) { // while문을 주어 추가 연산이 가능하도록 함
            println("연산자 입력")
            val op = exception("op").toString()
            println("두번째 수 입력")
            val b = exception("num").toString().toDouble()
            val result = calculation(a, op, b)
            //기본 컴퓨터 계산기는 15자리까지 구현이 나와서 15자리까지 구현
            //왜 ? 일반적으로 계산했을때 0.1 + 0.2 = 0.30000000000000004라는 값이 나오는 에러 발생
            //왜 ? float와 double이 정확한 값이 아닌 근삿값을 담고 있어서 발생하는 문제를 해결하기 위해 제한을 뒀다.
            println("= ${floor(result * 1000000000000000) / 1000000000000000}")

            println("-1:처음으로 돌아가기 / 0:추가 연산 / 1:새로운 계산")
            val question = exception("question")// 계속할지 질문
            // -1:처음으로 back / 0:추가 연산 / 1:새로운 계산
            if (question == -1) {
                println("계산기를 종료합니다.")
                break
            } else if (question == 0) {
                println("추가 연산을 진행합니다.")
                a = result
                continue
            } else if (question == 1) {
                println("첫번째 수 입력")
                a = exception("num").toString().toDouble()
            }
        }
    }
}
