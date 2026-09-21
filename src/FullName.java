/* Kan du forbedre klassen, så den returnerer fulde navne? */

void main() {
    Person person1 = new Person("Alice", "Smith");
    Person person2 = new Person("Bob", "Johnson");

    IO.println("Hello " + person1);
    IO.println("Hello " + person2);
}

public class Person {
    private final String firstName;
    private final String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String toString(){
        return String.format(firstName + " " +  lastName);
    }
}