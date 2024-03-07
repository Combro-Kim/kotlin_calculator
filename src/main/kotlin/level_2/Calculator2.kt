package level_2

import java.lang.NumberFormatException

fun main() {
    Calculator()
}

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

