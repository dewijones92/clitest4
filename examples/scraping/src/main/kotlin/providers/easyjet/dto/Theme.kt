package providers.easyjet.dto

import com.google.gson.annotations.SerializedName


data class Theme (

  @SerializedName("code"         ) var code         : String?                 = null,
  @SerializedName("name"         ) var name         : String?                 = null,
  @SerializedName("description"  ) var description  : String?                 = null,
  @SerializedName("packageIcons" ) var packageIcons : ArrayList<PackageIcons> = arrayListOf()

)