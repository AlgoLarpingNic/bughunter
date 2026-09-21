/* Find fejlen i isOdd-metoden */

void main() {
    IO.println(isOdd(3));
    IO.println(isOdd(4));
    IO.println(isOdd(13));
}

boolean isOdd(int number) {
    if (number % 2 != 0) {
        IO.println("Tallet: " + number + " er ulige");
        return true;
    }else if (number % 2 == 0){
        IO.println("Tallet: " + number + " er lige");
        return true;
    }
    return false;
}