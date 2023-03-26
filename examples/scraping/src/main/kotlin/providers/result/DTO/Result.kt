package providers.result.DTO;

import java.math.BigDecimal
import java.time.LocalDateTime

data class SearchResult(val departureCity: String, val arrivivalCity: String,
                        val depatureTime: LocalDateTime,
                        val arrivalTime: LocalDateTime,
                        val priceGBP: BigDecimal
    )
