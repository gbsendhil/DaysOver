package com.sendhil.daysover

import androidx.lifecycle.ViewModel
import kotlinx.datetime.Clock
import kotlinx.datetime.Instant
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime

class MainActivityViewModel : ViewModel() {

    fun generateDaysSinceStartOfYear(): String {
        val currentMoment: Instant = Clock.System.now()
        val datetimeInSystemZone: LocalDateTime = currentMoment.toLocalDateTime(TimeZone.currentSystemDefault())

        return datetimeInSystemZone.dayOfYear.toString()
    }
}