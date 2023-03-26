package providers.british_airways.dto

import com.google.gson.annotations.SerializedName


data class BaggageAllowance (

  @SerializedName("numberOfPieces" ) var numberOfPieces : Int?           = null,
  @SerializedName("type"           ) var type           : String?        = null,
  @SerializedName("baggageWeight"  ) var baggageWeight  : BaggageWeight? = BaggageWeight()

)