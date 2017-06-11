package net.habibksentini.bankocr

import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test
import org.hamcrest.CoreMatchers.`is` as isEqualTo

class SevenSegmentNumberEnumTest {

    @Test
    fun getInt_given_sevenSegmentZero_then_returnZero(){
        val sevenSegmentEntry: String = " _ " +
                                        "| |" +
                                        "|_|"

        val result: Int = SevenSegmentNumberEnum.getInt(sevenSegmentEntry)

        assertThat(result, isEqualTo(0))
    }

    @Test
    fun getInt_given_sevenSegmentOne_then_returnOne(){
        val sevenSegmentEntry: String = "   " +
                                        "  |" +
                                        "  |"

        val result: Int = SevenSegmentNumberEnum.getInt(sevenSegmentEntry)

        assertThat(result, isEqualTo(1))
    }

    @Test
    fun getInt_given_sevenSegmentTwo_then_returnTwo(){
        val sevenSegmentEntry: String = " _ " +
                                        " _|" +
                                        "|_ "

        val result: Int = SevenSegmentNumberEnum.getInt(sevenSegmentEntry)

        assertThat(result, isEqualTo(2))
    }

    @Test
    fun getInt_given_sevenSegmentThree_then_returnThree(){
        val sevenSegmentEntry: String = " _ " +
                                        " _|" +
                                        " _|"

        val result: Int = SevenSegmentNumberEnum.getInt(sevenSegmentEntry)

        assertThat(result, isEqualTo(3))
    }

    @Test
    fun getInt_given_sevenSegmentFour_then_returnFour(){
        val sevenSegmentEntry: String = "   " +
                                        "|_|" +
                                        "  |"

        val result: Int = SevenSegmentNumberEnum.getInt(sevenSegmentEntry)

        assertThat(result, isEqualTo(4))
    }

    @Test
    fun getInt_given_sevenSegmentFive_then_returnFive(){
        val sevenSegmentEntry: String = " _ " +
                                        "|_ " +
                                        " _|"

        val result: Int = SevenSegmentNumberEnum.getInt(sevenSegmentEntry)

        assertThat(result, isEqualTo(5))
    }

    @Test
    fun getInt_given_sevenSegmentSix_then_returnSix(){
        val sevenSegmentEntry: String = " _ " +
                                        "|_ " +
                                        "|_|"

        val result: Int = SevenSegmentNumberEnum.getInt(sevenSegmentEntry)

        assertThat(result, isEqualTo(6))
    }

    @Test
    fun getInt_given_sevenSegmentSeven_then_returnSeven(){
        val sevenSegmentEntry: String = " _ " +
                                        "  |" +
                                        "  |"

        val result: Int = SevenSegmentNumberEnum.getInt(sevenSegmentEntry)

        assertThat(result, isEqualTo(7))
    }

    @Test
    fun getInt_given_sevenSegmentEight_then_returnEight(){
        val sevenSegmentEntry: String = " _ " +
                                        "|_|" +
                                        "|_|"

        val result: Int = SevenSegmentNumberEnum.getInt(sevenSegmentEntry)

        assertThat(result, isEqualTo(8))
    }

    @Test
    fun getInt_given_sevenSegmentNine_then_returnNine(){
        val sevenSegmentEntry: String = " _ " +
                                        "|_|" +
                                        " _|"

        val result: Int = SevenSegmentNumberEnum.getInt(sevenSegmentEntry)

        assertThat(result, isEqualTo(9))
    }



}