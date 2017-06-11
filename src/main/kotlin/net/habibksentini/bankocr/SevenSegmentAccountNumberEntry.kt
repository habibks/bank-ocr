package net.habibksentini.bankocr

class SevenSegmentAccountNumberEntry(val line1: String, val line2: String, val line3: String) {

    fun getAccountNumber(): String {
        val sevenSegmentAccountNumber = parse()
        return sevenSegmentAccountNumber.map { SevenSegmentNumberEnum.getInt(it) }.joinToString("")
    }

    fun parse(): List<String> {
        val sevenSegmentAccountNumber: MutableList<String> = mutableListOf()
        for (i in 0 until 27 step 3) {
            val sevenSegmentNumber = parseSevenSegmentNumberLines(i)
            sevenSegmentAccountNumber.add(sevenSegmentNumber)
        }
        return sevenSegmentAccountNumber
    }

    private fun parseSevenSegmentNumberLines(i: Int): String {
        val startIndex = i
        val endIndex = i.plus(3)
        val sevenSegmentNumberFirstLineEntry = line1.substring(startIndex, endIndex)
        val sevenSegmentNumberSecondLineEntry = line2.substring(startIndex, endIndex)
        val sevenSegmentNumberThirdLineEntry = line3.substring(startIndex, endIndex)
        val sevenSegmentNumber = "$sevenSegmentNumberFirstLineEntry$sevenSegmentNumberSecondLineEntry$sevenSegmentNumberThirdLineEntry"
        return sevenSegmentNumber
    }
}