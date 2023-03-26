package providers.easyjet.dto

import com.google.gson.annotations.SerializedName


data class Status (

  @SerializedName("total"      ) var total      : Int?     = null,
  @SerializedName("minPrice"   ) var minPrice   : Int?     = null,
  @SerializedName("maxPrice"   ) var maxPrice   : Int?     = null,
  @SerializedName("minPricePP" ) var minPricePP : Int?     = null,
  @SerializedName("maxPricePP" ) var maxPricePP : Int?     = null,
  @SerializedName("hasDiscont" ) var hasDiscont : Boolean? = null

)