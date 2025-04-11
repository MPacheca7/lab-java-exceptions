public class Person {
    private int id;
    private String name;
    private int age;
    private String ocupation;

    public Person(int id, String name, int age, String occupation) {
        this.id = id;
        this.name = name;
        setAge(age);
        this.ocupation = occupation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Introduce un valor mayor que 0");
        } // genera un error si age es menor que 0.
        this.age = age;
    }

    public String getOcupation() {
        return ocupation;
    }

    public void setOcupation(String ocupation) {
        this.ocupation = ocupation;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ocupation='" + ocupation + '\'' +
                '}';
    }
}
