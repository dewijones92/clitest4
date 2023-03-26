package providers.easyjet.dto

import com.google.gson.annotations.SerializedName


data class Offers (

  @SerializedName("id"                   ) var id                   : String?              = null,
  @SerializedName("date"                 ) var date                 : String?              = null,
  @SerializedName("stay"                 ) var stay                 : Int?                 = null,
  @SerializedName("price"                ) var price                : Int?                 = null,
  @SerializedName("pricePP"              ) var pricePP              : Int,
  @SerializedName("deposit"              ) var deposit              : Int?                 = null,
  @SerializedName("accom"                ) var accom                : Accom?               = Accom(),
  @SerializedName("altBoards"            ) var altBoards            : ArrayList<AltBoards> = arrayListOf(),
  @SerializedName("transport"            ) var transport            : Transport,
  @SerializedName("transfers"            ) var transfers            : ArrayList<String>    = arrayListOf(),
  @SerializedName("hotel"                ) var hotel                : Hotel?               = Hotel(),
  @SerializedName("hasDistressedFlights" ) var hasDistressedFlights : Boolean?             = null,
  @SerializedName("promotion"            ) var promotion            : Promotion?           = Promotion(),
  @SerializedName("otherRoutes"          ) var otherRoutes          : ArrayList<String>    = arrayListOf()

)