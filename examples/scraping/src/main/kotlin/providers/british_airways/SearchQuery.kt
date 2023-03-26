package providers.biritsh_airways

import com.google.gson.Gson
import providers.result.DTO.SearchResult
import kotlinx.coroutines.*
import providers.british_airways.dto.Root
import providers.british_airways.mapFromProvider

import java.io.BufferedReader
import java.io.InputStreamReader


suspend fun search(): SearchResult {
    println("START BRITISH AIRWAYS")
    val return_val = runInBackground("""nodeScrape https://www.britishairways.com/travel/book/public/en_gb/flightList?onds=LHR-AMS_2023-04-24&ad=1&yad=0&ch=0&inf=0&cabin=M&flex=LOWEST&ond=1""")

    val gson = Gson()
    val deserializedJsonResponse = gson.fromJson(return_val, Root::class.java)


    return mapFromProvider(deserializedJsonResponse);
}

private suspend fun runInBackground(command: String): String = withContext(Dispatchers.IO) {
    val foundToken = "{{FLIGHTDATA}}";
    val process = Runtime.getRuntime().exec(command)
    var result = ""

    BufferedReader(InputStreamReader(process.inputStream)). use {
            stdOutReader ->
        var line: String?
        while (stdOutReader.readLine().also { line = it } != null) {
            println(line)
            if(line?.startsWith(foundToken) ?: false){
                result = line!!.removePrefix(foundToken);
                break;
            }
        }
    }
    return@withContext result
}
