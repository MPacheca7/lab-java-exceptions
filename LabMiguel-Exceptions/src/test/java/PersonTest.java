import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    public void ageMore(){
        var personTest = new Person(1, "John Smith", 30, "Teacher");
        assert personTest.getAge() > 0;
    }

}
