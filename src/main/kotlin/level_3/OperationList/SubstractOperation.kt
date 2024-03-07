package level_3.OperationList

import level_3.OperationIF

class SubstractOperation : OperationIF {
    override fun calculator(num1: Int, num2: Int): Int {
        return num1 - num2
    }

    override fun calculator(num1: Double, num2: Double): Double {
        return num1 - num2
    }
}