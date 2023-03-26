package providers.easyjet.dto

import com.google.gson.annotations.SerializedName


data class Occupation (

  @SerializedName("adults"    ) var adults    : Int?              = null,
  @SerializedName("children"  ) var children  : Int?              = null,
  @SerializedName("infants"   ) var infants   : Int?              = null,
  @SerializedName("paxIds"    ) var paxIds    : ArrayList<Int>    = arrayListOf(),
  @SerializedName("childAges" ) var childAges : ArrayList<String> = arrayListOf()

)