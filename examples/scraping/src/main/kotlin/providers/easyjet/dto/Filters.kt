package providers.easyjet.dto

import com.google.gson.annotations.SerializedName


data class Filters (

  @SerializedName("code"    ) var code    : String?            = null,
  @SerializedName("options" ) var options : ArrayList<Options> = arrayListOf()

)