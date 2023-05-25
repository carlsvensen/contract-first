package dk.cygni.contractserverimpl;

import dk.cygni.contract.server.api.PersonApi;
import dk.cygni.contract.server.model.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonApiImpl implements PersonApi {

    @Override
    public ResponseEntity<List<Person>> getPerson() {

        return new ResponseEntity<>(List.of(new Person(1L, "Fornavn", "Etternavn", "Adress 1a")), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Person> getPersonById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<Void> updatePerson(Long id, String firstname, String lastname) {
        return null;
    }
}
