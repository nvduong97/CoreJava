package interview;

public class Person {
    private String id;
    private String name;
    private Person person;

    public Person() {
    }

    public Person(String id, String name, Person person) {
        if(person == null)
            person = new Person();
        this.id = id;
        this.name = name;
        this.person = person;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
