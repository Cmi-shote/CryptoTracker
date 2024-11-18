package com.plcoding.cryptotracker.crypto.presentation.coinDetail

import java.text.NumberFormat
import java.util.Locale

data class ValueLabel(
    val value: Float,
    val unit: String
) {
    fun formatted(): String {
        val formatter = NumberFormat.getNumberInstance(Locale.getDefault()).apply {
            val fractionDigits = when {
                value > 1000 -> 0 //no fractions
                value in 2f..999f -> 2 //have two digits after period
                else -> 3
            }

            maximumFractionDigits = fractionDigits
            minimumFractionDigits = 0 //if any coin is a whole number, then we it shouldn't display any fractions
        }

        return "${formatter.format(value)}$unit"
    }
}
