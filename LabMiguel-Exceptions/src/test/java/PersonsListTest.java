import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class PersonsListTest {

    @Test
    void testConcat() {
        PersonsList stringUtils = new PersonsList(1, "John", "Smith", 30,"Teacher");
        String name = "John";
        String firstName = "Smith";
        String concatResult = "John Smith";

        String concatResultPrueba = stringUtils.concat(name, firstName);
        assertEquals(concatResult, concatResultPrueba);
    }

    @Test
    void clonePerson() {
        PersonsList clonedP1Test = new PersonsList(0, "", " ", 30 , "Teacher");
        Person originalPerson = new Person(1, "Alice", 25, "Engineer");

        Person clonedPerson = clonedP1Test.clonePerson(originalPerson);
        assertNotEquals(originalPerson.getId(), clonedPerson.getId());
        assertEquals(originalPerson.getName(), clonedPerson.getName());
        assertEquals(originalPerson.getAge(), clonedPerson.getAge());
        assertEquals(originalPerson.getOcupation(), clonedPerson.getOcupation());
    }

}