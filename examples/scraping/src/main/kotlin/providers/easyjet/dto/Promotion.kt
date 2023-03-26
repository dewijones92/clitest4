package providers.easyjet.dto

import com.google.gson.annotations.SerializedName


data class Promotion (

  @SerializedName("title"             ) var title             : String? = null,
  @SerializedName("description"       ) var description       : String? = null,
  @SerializedName("bannerDescription" ) var bannerDescription : String? = null

)