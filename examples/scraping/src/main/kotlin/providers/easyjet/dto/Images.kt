package providers.easyjet.dto

import com.google.gson.annotations.SerializedName


data class Images (

  @SerializedName("small"       ) var small       : String? = null,
  @SerializedName("medium"      ) var medium      : String? = null,
  @SerializedName("large"       ) var large       : String? = null,
  @SerializedName("description" ) var description : String? = null

)