package providers.easyjet.dto

import com.google.gson.annotations.SerializedName


data class BoardType (

  @SerializedName("code"        ) var code        : String? = null,
  @SerializedName("title"       ) var title       : String? = null,
  @SerializedName("content"     ) var content     : String? = null,
  @SerializedName("description" ) var description : String? = null,
  @SerializedName("iconUrl"     ) var iconUrl     : String? = null

)