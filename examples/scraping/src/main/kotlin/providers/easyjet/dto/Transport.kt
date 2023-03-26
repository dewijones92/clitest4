package providers.easyjet.dto

import com.google.gson.annotations.SerializedName


data class Transport (

  @SerializedName("routes" ) var routes : ArrayList<Routes> = arrayListOf()

)