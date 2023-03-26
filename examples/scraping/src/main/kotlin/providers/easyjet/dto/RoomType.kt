package providers.easyjet.dto

import com.google.gson.annotations.SerializedName


data class RoomType (

  @SerializedName("code"  ) var code  : String? = null,
  @SerializedName("title" ) var title : String? = null

)