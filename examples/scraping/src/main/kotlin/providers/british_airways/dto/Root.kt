package providers.british_airways.dto

import com.google.gson.annotations.SerializedName


data class Root (

  @SerializedName("flightOption" ) var flightOption : ArrayList<FlightOption> = arrayListOf(),
  @SerializedName("calendar"     ) var calendar     : Calendar?               = Calendar()

)