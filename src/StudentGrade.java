/* 
Danske karakterer og amerikanske tilsvarende:
DK      US
12	    A
10	    B+
7	    B
4	    C
02	    D
00/-3	F

Bemærk at 7 og 10 begge konverteres til B, da char kun kan indeholde et enkelt tegn.
Omskriv convertToAmericanGrade(...) så den returnerer en enum i stedet for et char.
*/

enum AmericanGrade {
    A, B, B_PLUS, C, D, F
}

void main() {
    int danishGrade = 10;
    char americanGrade = convertToAmericanGrade(danishGrade);
    IO.println("Danish grade: " + danishGrade);
    IO.println("American grade: " + americanGrade);
}

char convertToAmericanGrade(int danishGrade) {
    if (danishGrade == 12) {
        return 'A';
    } else if (danishGrade == 10) {
        return 'B';
    } else if (danishGrade == 7) {
        return 'B';
    } else if (danishGrade == 4) {
        return 'C';
    } else if (danishGrade == 2) {
        return 'D';
    } else {
        return 'F';
    }
}