import kotlin.test.Test
import java.io.File
import com.google.gson.Gson
import org.junit.jupiter.api.BeforeEach
import providers.british_airways.dto.Root
import providers.british_airways.mapFromProvider
import java.math.BigDecimal
import java.time.LocalDateTime
import kotlin.test.assertEquals
import kotlin.test.assertTrue

internal class BA_deserialize_test {

    lateinit var deserializedJsonResponse: Root;
    val filesnames = arrayListOf("scraped_json", "scraped_json_2")

    @BeforeEach
    fun init() {
        filesnames.forEachIndexed { index, it ->
                val currentDir = File(".")
                val basePath = currentDir.path
                val contents = File("${basePath}/src/test/test_resources/BA/${it}.json").readText()
                val gson = Gson()
                if (index == 0) deserializedJsonResponse = gson.fromJson(contents, Root::class.java)
                assertEquals(deserializedJsonResponse.flightOption.size, 15)
        }
    }

    @Test
    fun mapperTest() {
        val mapToProviderResult = mapFromProvider(deserializedJsonResponse);
        assertEquals("LONDON", mapToProviderResult.departureCity )
        assertEquals(LocalDateTime.parse("2023-04-24T16:25"), mapToProviderResult.depatureTime)

        assertEquals("AMSTERDAM", mapToProviderResult.arrivivalCity)
        assertEquals( LocalDateTime.parse("2023-04-24T18:45"), mapToProviderResult.arrivalTime)
        assertTrue (mapToProviderResult.priceGBP.compareTo(BigDecimal("51.27")) == 0 )
    }
}
