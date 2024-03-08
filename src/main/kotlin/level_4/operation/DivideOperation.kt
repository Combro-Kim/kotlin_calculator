package level_4.operation

import level_4.AbstractOperation

class DivideOperation : AbstractOperation() {
    override fun operate(num1: Int, num2: Int): Double {
        //@Throws(ArithmeticException::class)
        require(num2 != 0) {
            ArithmeticException("0으로 나눌 수 없습니다.")
        }
        return (num1 / num2).toDouble()
    }
}