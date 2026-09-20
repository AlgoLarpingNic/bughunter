/* Refaktorer Person, så den har en konstruktør
   og private felter.
*/

public class Person {
    String name;
    int age;
}

void main() {
    Person p = new Person();

    p.name = "Alice";
    p.age = 20;

    IO.println(p.name);
    IO.println(p.age);
}
