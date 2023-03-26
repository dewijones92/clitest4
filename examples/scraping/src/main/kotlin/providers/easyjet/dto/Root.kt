package providers.easyjet.dto

import com.google.gson.annotations.SerializedName


data class Root (

  @SerializedName("status"  ) var status  : Status?            = Status(),
  @SerializedName("offers"  ) var offers  : ArrayList<Offers>  = arrayListOf(),
  @SerializedName("filters" ) var filters : ArrayList<Filters> = arrayListOf()

)