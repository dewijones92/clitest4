package providers.easyjet.dto

import com.google.gson.annotations.SerializedName


data class PackageIcons (

  @SerializedName("key"     ) var key     : String? = null,
  @SerializedName("iconUrl" ) var iconUrl : String? = null,
  @SerializedName("name"    ) var name    : String? = null

)