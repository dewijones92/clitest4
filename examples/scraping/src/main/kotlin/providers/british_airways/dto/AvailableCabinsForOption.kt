package providers.british_airways.dto

import com.google.gson.annotations.SerializedName


data class AvailableCabinsForOption (

  @SerializedName("availabilityInSellingClass" ) var availabilityInSellingClass : Int?                        = null,
  @SerializedName("sellingClass"               ) var sellingClass               : SellingClass?               = SellingClass(),
  @SerializedName("fareBasisCode"              ) var fareBasisCode              : FareBasisCode?              = FareBasisCode(),
  @SerializedName("flightOffer"                ) var flightOffer                : FlightOffer?                = FlightOffer(),
  @SerializedName("ticketFlexibility"          ) var ticketFlexibility          : String?                     = null,
  @SerializedName("taxInclusive"               ) var taxInclusive               : Boolean?                    = null,
  @SerializedName("cabinPrice"                 ) var cabinPrice                 : CabinPrice,
  @SerializedName("baggageAllowance"           ) var baggageAllowance           : ArrayList<BaggageAllowance> = arrayListOf(),
  @SerializedName("cabinName"                  ) var cabinName                  : String?                     = null,
  @SerializedName("productName"                ) var productName                : String?                     = null,
  @SerializedName("sortPosition"               ) var sortPosition               : Int?                        = null,
  @SerializedName("scarcityMessage"            ) var scarcityMessage            : Boolean?                    = null,
  @SerializedName("dominantCabin"              ) var dominantCabin              : String?                     = null,
  @SerializedName("dominantFareType"           ) var dominantFareType           : String?                     = null

)