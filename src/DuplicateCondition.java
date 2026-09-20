/* Refaktorer koden for at fjerne duplikerede if-betingelser */

void main() {
    int age = 25;

    if (age >= 18) {
        IO.println("Can vote");
    }

    if (age >= 18) {
        IO.println("Can drive");
    }

    if (age >= 18) {
        IO.println("Is an adult");
    }
}
