package providers.british_airways.dto

import com.google.gson.annotations.SerializedName


data class BaggageWeight (

  @SerializedName("kilogram" ) var kilogram : Int? = null,
  @SerializedName("pound"    ) var pound    : Int? = null

)