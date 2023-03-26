package providers.easyjet

import com.google.gson.Gson
import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import providers.easyjet.dto.Root
import providers.result.DTO.SearchResult


suspend fun search(): SearchResult {
    println("START EASY JET")
    val client = HttpClient(CIO)

    val response = client.get("https://www.easyjet.com/holidays/_api/v1.0/search/packages?startDate=2023-04-30&isFlexible=false&duration[0]=27&departure=STN&geography=NL,NLAM&automaticAllocation=true&room[0].adults=1&room[0].children=0&room[0].infants=0&&&take=10&page=1&freeForKidsOnly=false&searchType=normal&distressedFlightsOnly=false&placementId=hotels_list&destinations[0]=region:NLAM")

    val gson = Gson()
    val deserializedJsonResponse = gson.fromJson(response.bodyAsText(), Root::class.java)
    val mappedResponse = mapFromProvider(deserializedJsonResponse);

    println("FINISH EASY JET")
    return mappedResponse;
}




