package providers.easyjet.dto

import com.google.gson.annotations.SerializedName


data class Children (

  @SerializedName("code"  ) var code  : String? = null,
  @SerializedName("name"  ) var name  : String? = null,
  @SerializedName("count" ) var count : Int?    = null

)