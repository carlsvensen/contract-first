package dk.cygni.contractserverimpl;

import dk.cygni.contract.server.api.PersonApi;
import dk.cygni.contract.server.model.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class PersonApiImpl implements PersonApi {

    HashMap<Long, Person> personMap = new HashMap<>();
    public PersonApiImpl() {
        Person person = new Person(1L, "Fornavn", "Etternavn", "Adress 1a");
        personMap.put(person.getId(), person);
    }

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
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
