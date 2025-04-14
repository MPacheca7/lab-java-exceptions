import java.io.FileWriter;
import java.io.IOException;

public class PersonsList extends Person {
    private String lastName;

    public PersonsList(int id, String name, String lastName, int age, String occupation) {
        super(id, name, age, occupation);
        this.lastName = lastName;
    }

    public static String concat(String name, String lastName) throws IllegalArgumentException {
        if (name == null || lastName == null || name.isEmpty() || lastName.isEmpty() || name.contains(" ") || lastName.contains(" ")) {
            throw new IllegalArgumentException("First and last name cannot be null");
        }
        return name + " " + lastName;
    } // Comprueba el formato


    public Person clonePerson(Person origin){
        int newId = generateNewId();
        return new Person(newId, origin.getName(), origin.getAge(), origin.getOcupation());
    } // Metodo para clonar

    public int generateNewId() {
        return (int) (Math.random() * 10); // Genera un nuevo id para el clonado
    }

    public static void main(String[] args) throws IOException {
        Person person1 = new Person(1, "John Smith", 30, "Teacher");
        System.out.println("Original: " + person1);

        //Clona a la persona 1
        PersonsList clonerP1 = new PersonsList(0, "", "", 1, "");
        Person cloned = clonerP1.clonePerson(person1);
        System.out.println("Clonado: " + cloned);

        //Comprobación de formato
        String user1 = concat("John", "Smith");
        try {
            System.out.println(user1);
        } catch (IllegalArgumentException e) {
            System.out.println("Error " + e);
        }

        // Escribe en el archivo
        try {
            FileWriter writer = new FileWriter("person.txt", true);
            writer.write("Se ha clonado la persona: " + cloned + "\n");
            writer.close();
            System.out.println("Se ha almacendo a la persona: " + cloned);
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }

        // Comprueba el ID de person y clone
        if(person1.getId() == cloned.getId()) {
            throw new IllegalArgumentException("ID NULL");
        } else {
            System.out.println(person1.getId());
            System.out.println(cloned.getId());
        }

        // La edad se comprueba desde PersonTest
        // El restante en PersonListTest
    }


}

