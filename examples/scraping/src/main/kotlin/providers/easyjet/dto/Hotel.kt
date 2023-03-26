package providers.easyjet.dto

import com.google.gson.annotations.SerializedName


data class Hotel (

  @SerializedName("name"            ) var name            : String?               = null,
  @SerializedName("strapline"       ) var strapline       : String?               = null,
  @SerializedName("description"     ) var description     : String?               = null,
  @SerializedName("starRating"      ) var starRating      : String?               = null,
  @SerializedName("rating"          ) var rating          : String?                  = null,
  @SerializedName("numberOfReviews" ) var numberOfReviews : Int?                  = null,
  @SerializedName("longitude"       ) var longitude       : String?               = null,
  @SerializedName("latitude"        ) var latitude        : String?               = null,
  @SerializedName("images"          ) var images          : ArrayList<Images>     = arrayListOf(),
  @SerializedName("airports"        ) var airports        : ArrayList<String>     = arrayListOf(),
  @SerializedName("facilities"      ) var facilities      : ArrayList<Facilities> = arrayListOf(),
  @SerializedName("country"         ) var country         : Country?              = Country(),
  @SerializedName("location"        ) var location        : Location?             = Location(),
  @SerializedName("resort"          ) var resort          : Resort?               = Resort(),
  @SerializedName("ksp1"            ) var ksp1            : String?               = null,
  @SerializedName("ksp2"            ) var ksp2            : String?               = null,
  @SerializedName("theme"           ) var theme           : Theme?                = Theme(),
  @SerializedName("type"            ) var type            : Type?                 = Type(),
  @SerializedName("tripAdvisorId"   ) var tripAdvisorId   : String?               = null,
  @SerializedName("isGreatDeal"     ) var isGreatDeal     : Boolean?              = null

)