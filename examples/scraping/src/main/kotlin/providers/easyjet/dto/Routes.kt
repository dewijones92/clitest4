package providers.easyjet.dto

import com.google.gson.annotations.SerializedName


data class Routes (

  @SerializedName("id"          ) var id          : String?  = null,
  @SerializedName("cycDate"     ) var cycDate     : String?  = null,
  @SerializedName("depPt"       ) var depPt       : String,
  @SerializedName("depDate"     ) var depDate     : String,
  @SerializedName("depName"     ) var depName     : String?  = null,
  @SerializedName("depLocation" ) var depLocation : String,
  @SerializedName("depTime"     ) var depTime     : String,
  @SerializedName("arrPt"       ) var arrPt       : String?  = null,
  @SerializedName("arrDate"     ) var arrDate     : String,
  @SerializedName("arrName"     ) var arrName     : String,
  @SerializedName("arrLocation" ) var arrLocation : String,
  @SerializedName("arrTime"     ) var arrTime     : String,
  @SerializedName("routeCd"     ) var routeCd     : String?  = null,
  @SerializedName("avail"       ) var avail       : Int?     = null,
  @SerializedName("fltNo"       ) var fltNo       : String?  = null,
  @SerializedName("car"         ) var car         : String?  = null,
  @SerializedName("direction"   ) var direction   : String?  = null,
  @SerializedName("isExt"       ) var isExt       : Boolean? = null,
  @SerializedName("bkgCls"      ) var bkgCls      : String?  = null

)