package providers.easyjet.dto

import com.google.gson.annotations.SerializedName


data class FreeNights (

  @SerializedName("freeNightsIncluded" ) var freeNightsIncluded : Int? = null

)