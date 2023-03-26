package providers.british_airways.dto

import com.google.gson.annotations.SerializedName


data class ArrivalLocation (

  @SerializedName("terminal" ) var terminal : Terminal,
  @SerializedName("airport"  ) var airport  : Airport,
  @SerializedName("city"     ) var city     : City,
  @SerializedName("country"  ) var country  : Country

)