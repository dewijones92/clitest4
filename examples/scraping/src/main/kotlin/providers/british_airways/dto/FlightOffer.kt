package providers.british_airways.dto

import com.google.gson.annotations.SerializedName


data class FlightOffer (

  @SerializedName("link" ) var link : Link? = Link()

)