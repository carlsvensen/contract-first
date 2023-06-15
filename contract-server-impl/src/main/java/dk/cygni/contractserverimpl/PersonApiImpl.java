package dk.cygni.contractserverimpl;

import dk.cygni.contract.server.api.PersonsApi;
import dk.cygni.contract.server.model.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class PersonApiImpl implements PersonsApi {

    Map<Long, Person> personMap =
            Map.of(
                    1L, new Person(1L, "First", "Last", "Address 1a"),
                    2L, new Person(2L, "AnotherFirst", "AnotherLast", "Address 2a")
            );

    @Override
    public ResponseEntity<List<Person>> getPersons() {
        return new ResponseEntity<>(
                personMap.values().stream().toList(),
                HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Person> getPersonById(Long id) {
        return new ResponseEntity<>(
                personMap.get(id),
                HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> updatePerson(Long id, String firstname, String lastname) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}
