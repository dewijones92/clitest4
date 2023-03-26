package providers.easyjet.dto

import com.google.gson.annotations.SerializedName


data class Location (

  @SerializedName("code" ) var code : String? = null,
  @SerializedName("name" ) var name : String? = null

)