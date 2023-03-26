package providers.easyjet.dto

import com.google.gson.annotations.SerializedName


data class Items (

  @SerializedName("name"              ) var name              : String?  = null,
  @SerializedName("code"              ) var code              : String?  = null,
  @SerializedName("number"            ) var number            : String?  = null,
  @SerializedName("disclaimerMessage" ) var disclaimerMessage : String?  = null,
  @SerializedName("isErrataInfo"      ) var isErrataInfo      : Boolean? = null,
  @SerializedName("icon"              ) var icon              : String?  = null

)