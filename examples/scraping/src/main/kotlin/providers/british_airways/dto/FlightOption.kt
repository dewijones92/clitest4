package providers.british_airways.dto

import com.google.gson.annotations.SerializedName


data class FlightOption (

  @SerializedName("flightEvents"                ) var flightEvents                : ArrayList<FlightEvents>             = arrayListOf(),
  @SerializedName("availableCabinsForOption"    ) var availableCabinsForOption    : ArrayList<AvailableCabinsForOption> = arrayListOf(),
  @SerializedName("duration"                    ) var duration                    : String?                             = null,
  @SerializedName("daysBetweenDepartureArrival" ) var daysBetweenDepartureArrival : Int?                                = null

)