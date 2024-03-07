package level_3

import java.lang.NumberFormatException

/*
- AddOperation(더하기), SubstractOperation(빼기), MultiplyOperation(곱하기), DivideOperation(나누기) 연산 클래스를을 만든 후 클래스간의 관계를 고려하여
Calculator 클래스와 관계를 맺기
- 관계를 맺은 후 필요하다면 Calculator 클래스의 내부 코드를 변경하기
- 나머지 연산자(%) 기능은 제외합니다.
- Lv2 와 비교하여 어떠한 점이 개선 되었는지 스스로 생각해 봅니다.
- hint. 클래스의 책임(단일책임원칙)
*/

fun main() {
    Calculator()
}
//todo 0.1 + 0.2 결과 오류 -> BigDecimal ?
//todo 1 + 1 = 2.0 -> double로 받았기 때문에 수정 필요

fun exception(type: String): Any {
    val opList = listOf("*", "+", "-", "/", "%")
    val questionList = listOf(-1,0,1)
    return when (type) {
        "op" -> {
            while (true) {
                try {
                    val operator = readln()
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
        "question" -> {
            while(true){
                try {
                    val question = readln().toInt()
                    if(question in questionList){
                        return question
                    }
                }catch (e: NumberFormatException){
                    println("[-1:종료 / 0:추가 연산 / 1:새로운 계산] \n 보기에 맞는 선택을 해주세요.")
                }
            }
        }

        else -> {
            while (true) {
                try {
                    val number = readln()
                    return number.toDouble()

                } catch (e: NumberFormatException) {
                    println("숫자를 입력해주세요.")
                }
            }
        }
    }
}


