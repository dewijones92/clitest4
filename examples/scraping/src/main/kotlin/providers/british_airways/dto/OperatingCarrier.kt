package providers.british_airways.dto

import com.google.gson.annotations.SerializedName


data class OperatingCarrier (

  @SerializedName("carrierCode"  ) var carrierCode  : String? = null,
  @SerializedName("carrierName"  ) var carrierName  : String? = null,
  @SerializedName("flightNumber" ) var flightNumber : String? = null

)