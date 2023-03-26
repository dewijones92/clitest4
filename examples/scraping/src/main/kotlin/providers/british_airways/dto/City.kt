package providers.british_airways.dto

import com.google.gson.annotations.SerializedName


data class City (

  @SerializedName("code"          ) var code          : String,
  @SerializedName("name"          ) var name          : String,
  @SerializedName("acoApplicable" ) var acoApplicable : Boolean

)