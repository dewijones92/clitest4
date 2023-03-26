package providers.easyjet.dto

import com.google.gson.annotations.SerializedName


data class Unit (

  @SerializedName("code"          ) var code          : String?     = null,
  @SerializedName("price"         ) var price         : Int?        = null,
  @SerializedName("pricePP"       ) var pricePP       : Int?        = null,
  @SerializedName("discount"      ) var discount      : Int?        = null,
  @SerializedName("discountPP"    ) var discountPP    : Int?        = null,
  @SerializedName("avail"         ) var avail         : Int?        = null,
  @SerializedName("isFreeForKids" ) var isFreeForKids : Boolean?    = null,
  @SerializedName("roomType"      ) var roomType      : RoomType?   = RoomType(),
  @SerializedName("board"         ) var board         : String?     = null,
  @SerializedName("boardType"     ) var boardType     : BoardType?  = BoardType(),
  @SerializedName("occupation"    ) var occupation    : Occupation? = Occupation(),
  @SerializedName("freeNights"    ) var freeNights    : FreeNights? = FreeNights()

)