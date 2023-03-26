package providers.easyjet;

import providers.easyjet.dto.Root
import providers.result.DTO.SearchResult
import java.math.BigDecimal
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter

fun mapFromProvider(root: Root): SearchResult {
    val formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME

    return root.offers.first().let {
        val route = it.transport.routes.get(0);
        SearchResult(
            departureCity = route.depLocation.toUpperCase(),
            depatureTime = OffsetDateTime.parse(route.depDate, formatter).toLocalDateTime(),
            arrivalTime =  OffsetDateTime.parse(route.arrDate, formatter).toLocalDateTime(),
            arrivivalCity = route.arrLocation.toUpperCase(),
            priceGBP = it.pricePP.toBigDecimal().divide(BigDecimal(100))
            )
    }
}


