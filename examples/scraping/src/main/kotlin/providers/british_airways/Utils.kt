package providers.british_airways;

import providers.british_airways.dto.Root
import providers.result.DTO.SearchResult
import java.math.BigDecimal
import java.time.LocalDateTime

public fun mapFromProvider(root: Root): SearchResult {
    return root.flightOption.map {

        //just get the first for now
        val cabinOption = it.availableCabinsForOption.get(0);
        println("mapping: ${cabinOption.cabinPrice.lowestJourneyPrice}")

        //assume there is only one flight segment - i.e. no change over
        it.flightEvents.first().let {
            SearchResult(departureCity = it.departureLocation.city.name,
                arrivalTime = LocalDateTime.parse(it.arrivalDateTime),
                arrivivalCity = it.arrivalLocation.city.name,
                depatureTime =  LocalDateTime.parse(it.departureDateTime),
                priceGBP = BigDecimal.valueOf(cabinOption.cabinPrice.lowestJourneyPrice)
            )
        };
    }.get(0);
}

