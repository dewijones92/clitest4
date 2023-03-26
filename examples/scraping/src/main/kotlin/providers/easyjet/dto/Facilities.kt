package providers.easyjet.dto

import com.google.gson.annotations.SerializedName


data class Facilities (

  @SerializedName("name"        ) var name        : String?          = null,
  @SerializedName("code"        ) var code        : String?          = null,
  @SerializedName("iconUrl"     ) var iconUrl     : String?          = null,
  @SerializedName("id"          ) var id          : String?          = null,
  @SerializedName("description" ) var description : String?          = null,
  @SerializedName("title"       ) var title       : String?          = null,
  @SerializedName("items"       ) var items       : ArrayList<Items> = arrayListOf()

)