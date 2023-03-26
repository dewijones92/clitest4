package providers.easyjet.dto

import com.google.gson.annotations.SerializedName


data class AltBoards (

  @SerializedName("price"       ) var price       : Int?    = null,
  @SerializedName("pricePP"     ) var pricePP     : Int?    = null,
  @SerializedName("code"        ) var code        : String? = null,
  @SerializedName("title"       ) var title       : String? = null,
  @SerializedName("content"     ) var content     : String? = null,
  @SerializedName("description" ) var description : String? = null,
  @SerializedName("iconUrl"     ) var iconUrl     : String? = null

)