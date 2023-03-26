package scraper


import kotlinx.coroutines.*
import providers.easyjet.search as easy_jet_search
import providers.biritsh_airways.search as brirish_airwars_search

import java.io.File


suspend fun main() {
// Install Ktor features
    val currentDir = File(".")
    println("currentDir = ${currentDir.absolutePath}")
    val files = currentDir.listFiles()

    for (file in files) {
        if (file.isFile) {
            println(file.name)
        }
    }


    coroutineScope {
               var requsts = mapOf(
                   "Easy Jet" to ::easy_jet_search,
                   "British Airways" to ::brirish_airwars_search)
                   .map ( {(it.key to async {it.value ()})});

                //scrape each line in parallel - and wait for them all to finish
                requsts.map { it.second }.awaitAll();
                val results = requsts;

                results.forEach({
                    val (airline, result) = it;

                    println("------");
                    println("AIRLINE: ${airline}");
                    println("RESULT: ${result.await()}");
                });
    }

}



suspend fun doSomethingUsefulOne(): Int {
    delay(1000L) // pretend we are doing something useful here
    return 13
}