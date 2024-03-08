package level_4

import level_4.operation.*


fun main() {
    val addCalc = Calculator(AddOperation())
    val minusCalc = Calculator(SubstractOperation())
    val multipleCalc = Calculator(MultiplyOperation())
    val divideCalc = Calculator(DivideOperation())

    println("2 + 4 = ${addCalc.operate(2, 4)}")
    println("2 - 4 = ${minusCalc.operate(2, 4)}")
    println("2 * 4 = ${multipleCalc.operate(2, 4)}")
    println("4 / 2 = ${divideCalc.operate(4, 2)}")

    val myStack = MyStack()
    val calResult = myStack.getPostFixExpressionOperation("(2 + 4) * 4 / 2 * 12")
    println("결과 : $calResult")
}