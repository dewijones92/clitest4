package providers.british_airways.dto

import com.google.gson.annotations.SerializedName


data class Calendar (

  @SerializedName("calendarEntries" ) var calendarEntries : ArrayList<CalendarEntries> = arrayListOf()

)