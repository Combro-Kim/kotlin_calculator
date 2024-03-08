package level_4.operation

import level_4.AbstractOperation

class AddOperation : AbstractOperation() {
    override fun operate(num1: Int, num2: Int): Double = (num1 + num2).toDouble()

}