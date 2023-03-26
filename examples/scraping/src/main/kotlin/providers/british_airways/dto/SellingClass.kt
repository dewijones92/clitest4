package providers.british_airways.dto

import com.google.gson.annotations.SerializedName


data class SellingClass (

  @SerializedName("BA2758" ) var BA2758 : ArrayList<String> = arrayListOf()

)