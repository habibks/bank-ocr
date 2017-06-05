package net.habibksentini.bankocr

import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test
import org.hamcrest.CoreMatchers.`is` as isEqualTo

class SevenSegmentAccountNumberEntryTest{

    @Test
    fun getAccountNumber_given_sevenSegmentEntryContainOnlyZeros_then_recognizeAccountNumber(){
        val line1 : String = " _  _  _  _  _  _  _  _  _ "
        val line2 : String = "| || || || || || || || || |"
        val line3 : String = "|_||_||_||_||_||_||_||_||_|"

        val result = SevenSegmentAccountNumberEntry(line1,line2,line3).getAccountNumber()

        assertThat(result, isEqualTo("000000000"))
    }

}

