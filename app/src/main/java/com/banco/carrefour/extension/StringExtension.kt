package com.banco.carrefour.extension

import android.util.Log
import java.text.SimpleDateFormat
import java.util.Locale

private const val DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'"

fun String.formatDate(): String {
    return try {
        val inputDateFormat = SimpleDateFormat(DATE_FORMAT, Locale.US)
        val outputDateFormat = SimpleDateFormat("dd MMM yyyy", Locale.US)

        val parsedDate = inputDateFormat.parse(this) ?: return this
        outputDateFormat.format(parsedDate)

    } catch (ex: Exception) {
        Log.e("formatDate", "failed to format date")
        this
    }
}