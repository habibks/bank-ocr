package net.habibksentini.bankocr

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.containsInAnyOrder
import org.junit.Test
import org.hamcrest.CoreMatchers.`is` as isEqualTo

class SevenSegmentAccountNumberEntryTest{

    @Test
    fun getAccountNumber_given_sevenSegmentEntryContainsOnlyZeros_then_recognizeAccountNumber(){
        val line1 : String = " _  _  _  _  _  _  _  _  _ "
        val line2 : String = "| || || || || || || || || |"
        val line3 : String = "|_||_||_||_||_||_||_||_||_|"

        val result = SevenSegmentAccountNumberEntry(line1,line2,line3).getAccountNumber()

        assertThat(result, isEqualTo("000000000"))
    }

    @Test
    fun getAccountNumber_given_sevenSegmentEntryContainsOnlyOnes_then_recognizeAccountNumber(){
        val line1 : String = "                           "
        val line2 : String = "  |  |  |  |  |  |  |  |  |"
        val line3 : String = "  |  |  |  |  |  |  |  |  |"

        val result = SevenSegmentAccountNumberEntry(line1,line2,line3).getAccountNumber()

        assertThat(result, isEqualTo("111111111"))
    }

    @Test
    fun parse_given_sevenSegmentEntry_then_return_sevenSegmentCodes(){
        val line1 : String = "    _  _     _  _  _  _  _ "
        val line2 : String = "  | _| _||_||_ |_   ||_||_|"
        val line3 : String = "  ||_  _|  | _||_|  ||_| _|"

        val result = SevenSegmentAccountNumberEntry(line1,line2,line3).parse()
        assertThat(result, containsInAnyOrder(
                "     |  |",
                " _  _||_ ",
                " _  _| _|",
                "   |_|  |",
                " _ |_  _|",
                " _ |_ |_|",
                " _   |  |",
                " _ |_||_|",
                " _ |_| _|"))
    }

}

