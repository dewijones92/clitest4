import kotlin.test.Test
import java.io.File
import com.google.gson.Gson
import org.junit.jupiter.api.BeforeEach
import providers.easyjet.dto.Root
import providers.easyjet.mapFromProvider
import java.math.BigDecimal
import java.time.LocalDateTime
import kotlin.test.assertEquals
import kotlin.test.assertTrue

internal class Easy_jet_deserialize_test {

    lateinit var deserializedJsonResponse: Root;
    val filesnames = arrayListOf("scraped_json", "scraped_json_2")

    @BeforeEach
    fun init() {
        val currentDir = File(".")
        val basePath = currentDir.path
        val contents = File("${basePath}/src/test/test_resources/easy_jet/scraped_json.json").readText()
        val gson = Gson()
        deserializedJsonResponse = gson.fromJson(contents, Root::class.java)
        assertEquals(deserializedJsonResponse.offers.size, 3)
    }

    @Test
    fun mapperTest() {
        val mapToProviderResult = mapFromProvider(deserializedJsonResponse);
        assertEquals("LONDON", mapToProviderResult.departureCity)
        assertEquals(LocalDateTime.parse("2023-04-30T12:00"), mapToProviderResult.depatureTime)

        assertEquals("NETHERLANDS", mapToProviderResult.arrivivalCity)
        assertEquals(LocalDateTime.parse("2023-04-30T14:05"), mapToProviderResult.arrivalTime)
        println(mapToProviderResult.priceGBP);
        assertTrue (mapToProviderResult.priceGBP.compareTo(BigDecimal("45.11")) == 0 )
    }
}
