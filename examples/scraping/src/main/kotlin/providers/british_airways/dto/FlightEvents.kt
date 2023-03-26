package providers.british_airways.dto

import com.google.gson.annotations.SerializedName


data class FlightEvents (

  @SerializedName("eventType"                   ) var eventType                   : String,
  @SerializedName("duration"                    ) var duration                    : String,
  @SerializedName("departureLocation"           ) var departureLocation           : DepartureLocation,
  @SerializedName("arrivalLocation"             ) var arrivalLocation             : ArrivalLocation,
  @SerializedName("departureDateTime"           ) var departureDateTime           : String            ,
  @SerializedName("arrivalDateTime"             ) var arrivalDateTime             : String            ,
  @SerializedName("operatingCarrier"            ) var operatingCarrier            : OperatingCarrier  = OperatingCarrier(),
  @SerializedName("marketingCarrier"            ) var marketingCarrier            : MarketingCarrier  = MarketingCarrier(),
  @SerializedName("fareBreakPoint"              ) var fareBreakPoint              : Boolean,
  @SerializedName("aircraft"                    ) var aircraft                    : Aircraft?          = Aircraft(),
  @SerializedName("haulType"                    ) var haulType                    : String,
  @SerializedName("dominantSegment"             ) var dominantSegment             : Boolean,
  @SerializedName("daysBetweenDepartureArrival" ) var daysBetweenDepartureArrival : Int

)