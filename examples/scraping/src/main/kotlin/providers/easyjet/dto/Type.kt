package providers.easyjet.dto

import com.google.gson.annotations.SerializedName


data class Type (

  @SerializedName("code"              ) var code              : String? = null,
  @SerializedName("name"              ) var name              : String? = null,
  @SerializedName("description"       ) var description       : String? = null,
  @SerializedName("icon"              ) var icon              : String? = null,
  @SerializedName("filledIcon"        ) var filledIcon        : String? = null,
  @SerializedName("typeAndThemeTitle" ) var typeAndThemeTitle : String? = null

)