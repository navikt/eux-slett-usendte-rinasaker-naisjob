package no.nav.eux.slett.usendte.rinasaker.naisjob.integration

import io.github.oshai.kotlinlogging.KotlinLogging.logger
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.MediaType
import org.springframework.http.MediaType.APPLICATION_JSON
import org.springframework.stereotype.Component
import org.springframework.web.client.RestClient

@Component
class EuxSlettUsendteRinasakerClient(
    @Value("\${sletteprosess}")
    val sletteprosess: String,
    @Value("\${endpoint.euxslettusendterinasaker}")
    val euxJournalarkivarUrl: String,
) {

    val log = logger {}

    fun execute() {
        log.info { "execute: $sletteprosess" }
        RestClient
            .create()
            .post()
            .uri("${euxJournalarkivarUrl}/api/v1/sletteprosess/$sletteprosess/execute")
            .contentType(APPLICATION_JSON)
            .accept(MediaType.ALL)
            .retrieve()
            .toBodilessEntity()
    }
}
