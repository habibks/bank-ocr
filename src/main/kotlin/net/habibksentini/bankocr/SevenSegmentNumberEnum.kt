package net.habibksentini.bankocr


enum class SevenSegmentNumberEnum(val entry: String) {

    ZERO(" _ | ||_|"),
    ONE("     |  |"),
    TWO(" _  _||_ "),
    THREE(" _  _| _|"),
    FOUR("   |_|  |"),
    FIVE(" _ |_  _|"),
    SIX(" _ |_ |_|"),
    SEVEN(" _   |  |"),
    EIGHT(" _ |_||_|"),
    NINE(" _ |_| _|");

    companion object {

        @JvmStatic fun getInt(entry: String) =
                when (fromString(entry)) {
                    ZERO -> 0
                    ONE -> 1
                    TWO -> 2
                    THREE -> 3
                    FOUR -> 4
                    FIVE -> 5
                    SIX -> 6
                    SEVEN -> 7
                    EIGHT -> 8
                    NINE -> 9
                }

        fun fromString(entry: String): SevenSegmentNumberEnum =
                values().filter { it.entry == entry }.single()
    }

}