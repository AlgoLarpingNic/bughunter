/* isPositive(...) virker, men kan simplificeres lidt */

void main() {
    IO.println(isPositive(-5));
    IO.println(isPositive(10));
    IO.println(isPositive(0));



}

boolean isPositive(int number) {
    return number > 0;
}
