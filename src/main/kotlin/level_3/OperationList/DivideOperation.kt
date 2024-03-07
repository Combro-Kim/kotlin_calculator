package level_3.OperationList

import level_3.OperationIF

class DivideOperation : OperationIF {
    override fun calculator(num1: Int, num2: Int): Int {
        return if (num2 == 0) 0
        else num1 / num2
    }

    override fun calculator(num1: Double, num2: Double): Double {
        return if (num2.toInt() == 0) 0.0
        else num1 / num2
    }
}