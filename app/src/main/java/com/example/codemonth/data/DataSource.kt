package com.example.codemonth.data

import com.example.codemonth.R
import com.example.codemonth.model.CodingDays

class DataSource {
    fun loadCodingDays() :List<CodingDays>{
        return listOf<CodingDays>(
            CodingDays(1, R.string.day1topic, R.drawable.image1, R.string.day1Desc),
            CodingDays(2, R.string.day2topic, R.drawable.image2, R.string.day2Desc),
            CodingDays(3, R.string.day3topic, R.drawable.image3, R.string.day3Desc),
            CodingDays(4, R.string.day4topic, R.drawable.image4, R.string.day4Desc),
            CodingDays(5, R.string.day5topic, R.drawable.image5, R.string.day5Desc),
            CodingDays(6, R.string.day6topic, R.drawable.image6, R.string.day6Desc),
            CodingDays(7, R.string.day7topic, R.drawable.image7, R.string.day7Desc),
            CodingDays(8, R.string.day8topic, R.drawable.image8, R.string.day8Desc),
            CodingDays(9, R.string.day9topic, R.drawable.image9, R.string.day9Desc),
            CodingDays(10, R.string.day10topic, R.drawable.image10, R.string.day10Desc),
            CodingDays(11, R.string.day11topic, R.drawable.image11, R.string.day11Desc),
            CodingDays(12, R.string.day12topic, R.drawable.image12, R.string.day12Desc),
            CodingDays(13, R.string.day13topic, R.drawable.image13, R.string.day13Desc),
            CodingDays(14, R.string.day14topic, R.drawable.image14, R.string.day14Desc),
            CodingDays(15, R.string.day15topic, R.drawable.image15, R.string.day15Desc),
            CodingDays(16, R.string.day16topic, R.drawable.image16, R.string.day16Desc),
            CodingDays(17, R.string.day17topic, R.drawable.image17, R.string.day17Desc),
            CodingDays(18, R.string.day18topic, R.drawable.image18, R.string.day18Desc),
            CodingDays(19, R.string.day19topic, R.drawable.image19, R.string.day19Desc),
            CodingDays(20, R.string.day20topic, R.drawable.image20, R.string.day20Desc),
            CodingDays(21, R.string.day21topic, R.drawable.image21, R.string.day21Desc),
            CodingDays(22, R.string.day22topic, R.drawable.image22, R.string.day22Desc),
            CodingDays(23, R.string.day23topic, R.drawable.image23, R.string.day23Desc),
            CodingDays(24, R.string.day24topic, R.drawable.image24, R.string.day24Desc),
            CodingDays(25, R.string.day25topic, R.drawable.image25, R.string.day25Desc),
            CodingDays(26, R.string.day26topic, R.drawable.image26, R.string.day26Desc),
            CodingDays(27, R.string.day27topic, R.drawable.image27, R.string.day27Desc),
            CodingDays(28, R.string.day28topic, R.drawable.image28, R.string.day28Desc),
            CodingDays(29, R.string.day29topic, R.drawable.image29, R.string.day29Desc),
            CodingDays(30, R.string.day30topic, R.drawable.image30, R.string.day30Desc)
        )
    }
}