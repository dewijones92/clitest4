package providers.british_airways.dto

import com.google.gson.annotations.SerializedName


data class CabinPrice (

  @SerializedName("currencyCode"       ) var currencyCode       : String?  = null,
  @SerializedName("lowestJourneyPrice" ) var lowestJourneyPrice : Double,
  @SerializedName("lowestSegmentPrice" ) var lowestSegmentPrice : Double?  = null,
  @SerializedName("discounted"         ) var discounted         : Boolean? = null,
  @SerializedName("taxInclusive"       ) var taxInclusive       : Boolean? = null

)