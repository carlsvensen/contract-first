package dk.cygni.javaclientimpl;

import dk.cygni.contract.client.ApiException;
import dk.cygni.contract.client.api.PersonApi;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class AppConfig {

    @Scheduled(fixedRate = 10000)
    public void readAndPrintPersons() throws ApiException {
        PersonApi personApi = new PersonApi();
        personApi.setCustomBaseUrl("http://localhost:8081");

        System.out.println("Found some persons: " + personApi.getPerson());
    }
}
