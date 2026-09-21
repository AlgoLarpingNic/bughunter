/* Find fejlen i koden */

void main() {
    int[] numbers = {4, 8, 15, 16, 23, 42};
    int target = 15;

    for (int scannedNumber : numbers) {
        if (scannedNumber == target) {
            IO.println("Found");
        } else {
            IO.println("Not found");
        }
    }
}
