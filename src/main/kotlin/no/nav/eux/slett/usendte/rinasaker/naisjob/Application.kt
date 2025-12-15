package no.nav.eux.slett.usendte.rinasaker.naisjob

import no.nav.eux.slett.usendte.rinasaker.naisjob.integration.EuxSlettUsendteRinasakerClient
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Application(
    val client: EuxSlettUsendteRinasakerClient
) : CommandLineRunner {

    override fun run(vararg args: String) {
        client.execute()
    }
}

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
