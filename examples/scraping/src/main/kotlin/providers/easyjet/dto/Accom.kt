package providers.easyjet.dto

import com.google.gson.annotations.SerializedName


data class Accom (

  @SerializedName("date"      ) var date      : String?         = null,
  @SerializedName("stay"      ) var stay      : Int?            = null,
  @SerializedName("id"        ) var id        : String?         = null,
  @SerializedName("packageId" ) var packageId : String?         = null,
  @SerializedName("code"      ) var code      : String?         = null,
  @SerializedName("type"      ) var type      : Type?           = Type(),
  @SerializedName("theme"     ) var theme     : Theme?          = Theme(),
  @SerializedName("unit"      ) var unit      : ArrayList<Unit> = arrayListOf(),
  @SerializedName("prom"      ) var prom      : String?         = null,
  @SerializedName("isExt"     ) var isExt     : Boolean?        = null,
  @SerializedName("latitude"  ) var latitude  : Double?         = null,
  @SerializedName("longitude" ) var longitude : Double?         = null

)