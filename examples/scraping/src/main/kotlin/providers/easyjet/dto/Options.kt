package providers.easyjet.dto

import com.google.gson.annotations.SerializedName


data class Options (

  @SerializedName("code"     ) var code     : String?             = null,
  @SerializedName("name"     ) var name     : String?             = null,
  @SerializedName("count"    ) var count    : Int?                = null,
  @SerializedName("children" ) var children : ArrayList<Children> = arrayListOf()

)