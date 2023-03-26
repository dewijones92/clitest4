package providers.british_airways.dto

import com.google.gson.annotations.SerializedName


data class Link (

  @SerializedName("href" ) var href : String? = null,
  @SerializedName("rel"  ) var rel  : String? = null

)