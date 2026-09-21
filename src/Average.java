/* Find ud hvordan vi håndterer tomme lister */
// Det kan den ikke fordi index-tallet tager værdien nul :c
void main() {
    IO.println("Gennemsnittet af 1, 2, 3, 4, 5 er: "
            + calculateAverage(new int[]{1, 2, 3, 4, 5}));
    IO.println("Gennemsnittet af en tom liste er: "
            + calculateAverage(new int[]{2, 14}));
}

double calculateAverage(int[] numbers) {
    int sum = 0;

    for (int number : numbers) {
        sum += number;
    }

    return  sum / numbers.length;
}
