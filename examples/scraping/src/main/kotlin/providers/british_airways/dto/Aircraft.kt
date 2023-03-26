package providers.british_airways.dto

import com.google.gson.annotations.SerializedName


data class Aircraft (

  @SerializedName("aircraftCode" ) var aircraftCode : String? = null,
  @SerializedName("aircraftName" ) var aircraftName : String? = null

)