package providers.british_airways.dto

import com.google.gson.annotations.SerializedName


data class CalendarEntries (

  @SerializedName("date" ) var date : String? = null

)