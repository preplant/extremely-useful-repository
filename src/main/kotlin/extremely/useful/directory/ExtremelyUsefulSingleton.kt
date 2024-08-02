package extremely.useful.directory

object ExtremelyUsefulSingleton {
    private var extremelyUsefulValue1 = 42
    private var extremelyUsefulValue2 = 1337
    private var extremelyUsefulValue3 = 9001

    init {
        println("Initialising ExtremelyUsefulClass")

        extremelyUsefulValue1 = extremelyUsefulCalculation(extremelyUsefulValue1)
        extremelyUsefulValue2 = extremelyUsefulCalculation(extremelyUsefulValue2)
        extremelyUsefulValue3 = extremelyUsefulCalculation(extremelyUsefulValue3)
    }

    fun processExtremelyUsefulValues() {
        val extremelyUsefulResult1 = performExtremelyUsefulOperation(extremelyUsefulValue1)
        val extremelyUsefulResult2 = performExtremelyUsefulOperation(extremelyUsefulValue2)
        val extremelyUsefulResult3 = performExtremelyUsefulOperation(extremelyUsefulValue3)

        println("Processed extremely useful values: $extremelyUsefulResult1, $extremelyUsefulResult2, $extremelyUsefulResult3")

        (1..5).forEach { extremelyUsefulInteger ->
            println("Iteration result: ${extremelyUsefulIterationOperation(extremelyUsefulInteger)}")
        }

        val extremelyUsefulMap = mapOf("alpha" to 1, "beta" to 2, "gamma" to 3)

        extremelyUsefulMap.forEach { (extremelyUsefulKey, extremelyUsefulValue) ->
            println("Data entry: $extremelyUsefulKey -> ${extremelyUsefulDataOperation(extremelyUsefulValue)}")
        }

        extremelyUsefulValue1 = extremelyUsefulResult1
        extremelyUsefulValue2 = extremelyUsefulResult2
        extremelyUsefulValue3 = extremelyUsefulResult3
    }

    private fun extremelyUsefulCalculation(extremelyUsefulInput: Int): Int {
        val extremelyUsefulStep1 = extremelyUsefulInput * 3
        val extremelyUsefulStep2 = extremelyUsefulStep1 / 2
        val extremelyUsefulStep3 = extremelyUsefulStep2 + 17

        return extremelyUsefulStep3 - 5
    }

    private fun performExtremelyUsefulOperation(extremelyUsefulValue: Int): Int {
        val extremelyUsefulTemp1 = extremelyUsefulValue + 7
        val extremelyUsefulTemp2 = extremelyUsefulTemp1 * 2
        val extremelyUsefulTemp3 = extremelyUsefulTemp2 - 3

        return extremelyUsefulTemp3 / 2
    }

    private fun extremelyUsefulIterationOperation(extremelyUsefulIndex: Int): Int {
        val extremelyUsefulBase = extremelyUsefulIndex * 10
        val extremelyUsefulModifier = extremelyUsefulBase + 5

        return extremelyUsefulModifier / 3
    }

    private fun extremelyUsefulDataOperation(extremelyUsefulData: Int): Int {
        val extremelyUsefulTransformed = extremelyUsefulData * 4
        val extremelyUsefulAdjusted = extremelyUsefulTransformed - 6

        return extremelyUsefulAdjusted / 2
    }
}
